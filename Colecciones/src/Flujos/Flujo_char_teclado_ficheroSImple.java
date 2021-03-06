package Flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Flujo_char_teclado_ficheroSImple {

	public static void basico_lectura_teclado() {
		/*System.in
   	     		1- Leer un solo carácter, retorna 1 byte.
    	*/
        
		try{
	         int dato = System.in.read();
	     	 System.out.println(dato);    //ASCII -->97
	     	 System.out.println((char)dato);//CHAR ->a
         }catch (IOException ex) {  }	
    	
		/*
    	
    	2- Leer multiples caracteres hasta que se pulse enter
    	   ‘\n’ (enter) salto de línea. 
    	   ‘\r’  retorno de carro. OJO poner un \r
  		char c;
        try{
            while ((c=(char)System.in.read())!='\n'){
            	System.out.println (c);
            }
        }catch(IOException ex){}  
        */
	}
	
	public static void lectura_fichero_dificil(){
		/*
		   "clase FileReader": Lectura de un archivo 
         "clase StringBuffer": para guardar información
         						Las lecturas son más dificiles 
         						porque no cuenta con métodos que hagan facil el trabajo 
			Este ejemplo leer de la forma más dificil, porq cuenta con el método
		   read(): que lee caracter a caracter         						
		 */
		  	FileReader entrada=null;
	        StringBuffer cadena=new StringBuffer();
	        try  {
	           entrada=new FileReader("src/Flujos/fichero.txt");
	           int c;
	           while((c=entrada.read())!=-1){
	        	   cadena.append((char)c);
	           }
	           System.out.print(cadena);
	        }catch (IOException ex) {
	    	  System.out.println(ex);
		    }finally{  // una claúsula finally que siempre se llama independientemente de que se produzcan o no errores en el proceso de lectura/escritura.
		        if(entrada!=null){
		            try{
		                entrada.close();
		            }catch(IOException ex){}
		        }
		    }  
		
	}
	
	public static void lectura_fichero_metodo_read(){
	/*
	   "clase FileReader": Lectura de un archivo 
	   "clase InputStreamReader": Convertir un flujo de byte a caracteres  
       "Clase BufferedReader": Permiten hacer lecturas sencillas desde flujos de caracteres.
				porque cuenta con métodos que hacen facil el trabajo
				  *Método  readLine():Lee una línea completa de texto. Retorna un string
				ademas cuenta con métodos estandar como
				 *Método read():Lee un solo caracter. Retorna un int q es el codigo ascii
		
			pero este ejemplo leer de la forma más dificil, porque uso el método
		   read(): que lee caracter a caracter. Pude haber usado el metodo readline()
        
        
        El uso sería:
         1- Convertir un flujo de byte a caracteres con la clase InputStreamReader
            Reader isr=new InputStreamReader(System.in);
         2- Hacer lecturas más faciles y sencilla apartir del flujos de caracteres que ya tenemos, con la clase BufferedReader
            BufferedReader br = new BufferedReader (isr);
         
	*/
	    
	        try {
				InputStreamReader  isr = new FileReader("src/Flujos/fichero.txt");
				BufferedReader  br = new BufferedReader(isr) ;
				int codigo = br.read();
		        char caracter;
	
		        //mientras el código no sea -1 (EOF) continuo leyendo
		        while (codigo != -1) { 
		            caracter = (char) codigo; //casting
		            System.out.print(caracter);
		            codigo = br.read();
		        }
				
			} catch (FileNotFoundException ex) {
			    ex.printStackTrace();
			} catch (IOException ex2) {
			   ex2.printStackTrace();
			} 
		
	}
	
	public static void lectura_fichero_facil_readline(){
	     /*
			       "clase FileReader": Lectura de un archivo 
			"clase InputStreamReader": Convertir un flujo de byte a caracteres  
		       "Clase BufferedReader": Permiten hacer lecturas sencillas desde flujos de caracteres.
		           Método  readLine(): Lee una línea completa de texto. Retorna un string
		           
		    Este ejemplo lee de la forma más facil, porq cuenta con el método
		   readline(): que lee caracter a caracter
	       */
        
        try {
				InputStreamReader  isr = new FileReader("src/Flujos/fichero.txt");
				BufferedReader  br = new BufferedReader(isr) ;
				String descripcion;
		        while ((descripcion=br.readLine())!=null) {
		            System.out.println(descripcion);
		        }
			} catch (FileNotFoundException ex) {
			    ex.printStackTrace();
			} catch (IOException ex2) {
			   ex2.printStackTrace();
			}
		
	}
	
	public static void lectura_fichero_facil_eof(){
		/*   
		 *  "clase FileReader": Lectura de un archivo 
			"clase InputStreamReader": Convertir un flujo de byte a caracteres  
		       "Clase BufferedReader": Permiten hacer lecturas sencillas desde flujos de caracteres.
		       
		   Este ejemplo lee de la forma más facil, porq cuenta con el método
		   readline(): que lee caracter a caracter y ademas use ready() para el eof, se hizo mucho más facil
		   
		       
			Método  ready(). Método definido para "detectar el EOF", 
				"true" si aún hay caracteres en el flujo para leer, "false" caso contrario.
				Retorna un boolean
				

               
            Método mark(). -->establecer una marca dentro del flujo
					reset(): -->regresar hasta la marca que tiene el flujo
					skip(long n): Mueve el apuntador del flujo las posiciones necesarios para evitar la cantidad de caracteres de n.

					  ejemplo:
					     br.mark(); -->establece una marca
					        ----
					     br.reset(); -->retorna el cursor hasta la marca    
				
				*/
		
		   try {
				InputStreamReader  isr = new FileReader("src/Flujos/fichero.txt");
				BufferedReader  br = new BufferedReader(isr) ;
		       while ((br.ready())) { // false cuando se llegue al eof
		           System.out.println(br.readLine());
		       }
			} catch (FileNotFoundException ex) {
			    ex.printStackTrace();
			} catch (IOException ex2) {
			   ex2.printStackTrace();
			}

		
	}
	
	public static void lectura_teclado(){
		/*CLASE StringBuffer: clase que hace funcion de buffer, para guardar información
		  "clase InputStreamReader": Convertir un flujo de byte a caracteres
		 
		  pero este ejemplo leer de la forma más dificil, porq cuenta con el método
		   read(): que lee caracter a caracter  
        */    
        StringBuffer cadena = new StringBuffer();  
        char c;
    	InputStreamReader isr = new InputStreamReader(System.in);
        try{
            while ((c=(char)isr.read())!='\n'){
		  	  	  cadena.append(c);
            }  	  
            System.out.println (cadena);
        }catch(IOException ex){}   
        
        /* el mismo ejemplo pero sin usar la "clase StringBuffer"
          char c;
        	InputStreamReader isr = new InputStreamReader(System.in);
            try{
                while ((c=(char)isr.read())!='\n'){
			  	  	  System.out.println (c);
                }  	  
            }catch(IOException ex){}    
          */
		
	}
	
	public static void salida_Pantalla(){
		/*
		 "OutputStreamWriter": Convertir un flujo de byte a caracteres
		 "Clase BufferedWriter": Permiten hacer escrituras sencillas a flujos de caracteres, 
        El uso sería:
         1- Convertir un flujo de byte a caracteres con la clase OutputStreamWriter
            Writer osw=new OutputStreamWriter(System.out);
         2- Hacer escrituras más faciles y sencilla apartir del flujos de caracteres que ya tenemos, con la clase BufferedReader
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
           
            BufferedWriter cuenta con métodos q son los que nos hacen facil el trabajo
		*/

        try {
     		Writer osw=new OutputStreamWriter(System.out);
	  		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("texto");
			bw.newLine();
		    bw.flush(); //Guardamos los cambios al fichero	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 lectura_fichero_dificil();//no aconsejado porq solo puede usar read() lectura de caracter por caracter
		 lectura_fichero_metodo_read();//no aconsejado porq usa read() en vez de usar readline()
		 lectura_fichero_facil_eof(); //este es el mejor de todo
		 lectura_fichero_facil_readline();//este tambien es bueno lee linea a linea
		 
		lectura_teclado(); //leer desde teclado y retornar toda la linea
		basico_lectura_teclado(); //lee desde teclado, solo suelta 1 caracter en ASCII y otro letra
			
		salida_Pantalla(); //los flujos de salida estan obligados a ser vaciados por flush	
			
		 ------------------------------
		   casting
        Integer.parseInt(valor)
        (char)valor
        
        
	        try {
			     variableInt = Integer.parseInt(br.readLine());
			} catch (IOException e) {
			     //Lo que queremos que se haga en caso de error de lectura
			}
			
		  ------------------------------
					    
		Lectura/escritura sencilla desde un flujo char(teclado, fihero)
			Streams de Entrada de Caracteres(Reader)
				FileReader: Lee caracteres secuencialmente desde un archivo.
				InputStreamReader: Lee caracteres desde un InputStream de bytes. Convierte los bytes en caracteres utilizando la codificación definida en su locale, o bien en el que se le haya definido.
				BufferedReader: Lee un buffer de caracteres desde un Reader, y retorna dichos caracteres.
				teclado
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				fichero
				BufferedReader br = new BufferedReader (new FileReader("src/Flujos/entrada.java"));
				
				StringReader: Lee caracteres de forma secuencial desde un String.
				      String s = "Hello World";
				      StringReader sr = new StringReader(s);
				
			Streams de Salida de caracteres(Writer)
				FileWriter:  Escribe caracteres secuencialmente en un archivo.
				OutputStreamWriter: Escribe caracteres a un byte de un OutputStream. Convierte caracteres a bytes utilizando la codificación definida en su locale, o una definida por nosotros.
				BufferedWriter: Almacena caracteres para salida de forma eficiente. Escribe en un Writer cuando está lleno.
				teclado
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				fichero
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/Flujos/entrada.java"));
				
				StringWriter: Escribe caracteres secuencialmente en un StringBuffer.
				String s = "Hello World";
				StringWriter sw = new StringWriter();
				sw.write(s, 0, 4); //escribe
					System.out.println("" + sw.toString());		    
		   
		   
		   
		   */
		   
	}

}
