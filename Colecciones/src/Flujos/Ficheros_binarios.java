package Flujos;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ficheros_binarios {

	public static void escribiendo_fichero_conTipos(){
		double[] precios={1350, 400, 890, 6200, 8730};
		int[] unidades={5, 7, 12, 8, 30};
  	  	String[] descripciones={"paquetes de papel", "lápices", "bolígrafos", "carteras", "mesas"};

  	  	DataOutputStream salida=null;
  	  	try {
	  		  salida = new DataOutputStream(new FileOutputStream("src/Flujos/pedido.txt"));
	  		  for (int i=0; i<precios.length; i ++) {
	      	      salida.writeChars(descripciones[i]);
	      	      salida.writeChar('\n');
	      	      salida.writeInt(unidades[i]);
	      	      salida.writeChar('\t');
	      	      salida.writeDouble(precios[i]);
	      	  }
	      	  salida.close(); 
		} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			    	   
		} finally{  // una claúsula finally que siempre se llama independientemente de que se produzcan o no errores en el proceso de lectura/escritura.
				if(salida!=null){
		            try{
		                salida.close();
		            }catch(IOException ex){}
				}   
		}
		
	}
	
	public static void Leyendo_fichero_conTipos(){
        
      double precio;
  	  int unidad;
  	  String descripcion;
  	  double total=0.0;
  	  DataInputStream entrada=null;
  	  try {
  		  entrada = new DataInputStream(new FileInputStream("src/Flujos/pedido.txt"));
  	      while ((descripcion=entrada.readLine())!=null) {
  	          unidad=entrada.readInt();
  	          entrada.readChar();       //lee el carácter tabulador
  	          precio=entrada.readDouble();
  	          System.out.println("has pedido "+unidad+" "+descripcion+" a "+precio+" pts.");
  	          total=total+unidad*precio;
  	      }
  	      System.out.println("por un TOTAL de: "+total+" pts.");
  	  }catch (EOFException e) {
  		  
  	  } catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			    	   
			}finally{  // una claúsula finally que siempre se llama independientemente de que se produzcan o no errores en el proceso de lectura/escritura.
				if(entrada!=null){
		            try{
		            	entrada.close();
		            }catch(IOException ex){}
				}   
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//escribiendo_fichero_conTipos();
		 Leyendo_fichero_conTipos();

	/*
  nota: Nos falta probar
    BufferedInputStream y BufferedOutputStream
  -------------------------------------------------------------------------  
	Lectura/escritura de ficheros binarios(con datos primitivos)
	Streams de Entrada de Bytes(InputStream)
		FileInputStream:  Lee bytes de forma secuencias desde un archivo.
		DataInputStream:  Lee representaciones binarias de tipos de datos primitivos desde un InputStream.
		BufferedInputStream: Lee un buffer de bytes desde un InputStream y retorna los bytes del mismo.
		DataInputStream entrada = new DataInputStream(new FileInputStream("src/Flujos/pedido.txt")); 
		BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("src/Flujos/pedido.txt")); 
	
	Streams de Salida de Bytes(OutputStream)
		FileOutputStream: Escribe bytes de forma secuencial en un archivo.
		DataOutputStream: Escribe representaciones binarias de tipos de datos primitivos de java en un OutputStream.
		BufferedOutputStream: Almacena bytes para salida de forma eficiente. Escribe en un OutputStream cuando está lleno.
		DataOutputStream salida = new DataOutputStream(new FileOutputStream("src/Flujos/pedido.txt"));
		BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("src/Flujos/pedido.txt"));
	-----------------------------------------------------
	----------------------------------------------------- 
 
 * Para lectura/escritura de ficheros binarios(datos primitivos)
    		Flujos de datos DataInputStream(con FileInputStream) y DataOutputStream(con FileOutputStream)
    	 
    	 La clase DataInputStream es útil para "leer datos del tipo primitivo" de una forma portable. 
    	 Esta clase tiene un sólo constructor que toma un "objeto de la clase InputStream o sus derivados 
    	 como parámetro".

         Se crea un objeto de la clase DataInputStream  vinculándolo a un un objeto FileInputStream para 
         leer desde un   archivo en disco denominado pedido.txt..

		 FileInputStream fileIn=new FileInputStream("pedido.txt");
		 DataInputStream entrada=new DataInputStream(fileIn));
		
		 * La clase DataInputStream define diversos métodos readXXX que son variaciones del método read 
		 de la clase base para leer datos de tipo primitivo

					boolean readBoolean();
					byte readByte();
					int readUnsignedByte();
					short readShort();
					int readUnsignedShort();
					char readChar();
					int readInt();
					String readLine(); -->leer una linea completa
					long readLong();
					float readFloat();
					double readDouble();
        
         * La clase DataInputStream es útil para "escribir datos del tipo primitivo" de una forma portable. 
    	 Esta clase tiene un sólo constructor que toma un "objeto de la clase OutputStream o sus derivados 
    	 como parámetro".
    	 
    	 Se crea un objeto de la clase DataOutputStream vinculándolo a un un objeto 
    	 FileOutputStream para escribir en un archivo en disco denominado pedido.txt..

		FileOutputStream fileOut=new FileOutputStream("pedido.txt");
		DataOutputStream salida=new DataOutputStream(fileOut));
		
		La clase DataOutputStream define diversos métodos writeXXX que son variaciones del método write de la clase base para escribir datos de tipo primitivo
		
		void writeBoolean(boolean v);
		void writeByte(int v);
		void writeBytes(String s);
		void writeShort(int v);
		void writeChars(String s);
		void writeChar(int v);
		void writeInt(int v);
		void writeLong(long v);
		void writeFloat(float v);
		void writeDouble(double v);
 * */		 

	}

}
