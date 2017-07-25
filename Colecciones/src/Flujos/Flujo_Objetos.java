package Flujos;

public class Flujo_Objetos {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Serialización de objetos

		Streams de Entrada de Bytes(InputStream)
		ObjectInputStream: Lee representaciones binarias de objetos java, se utiliza para deserializar objetos.

		ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("media.obj")); 
		String str=(String)entrada.readObject(); 
		Lista obj1=(Lista)entrada.readObject(); 
		System.out.println(str+obj1); 
		entrada.close();	

		Streams de Salida de Bytes(OutputStream)
		ObjectOutputStream: Escribe representaciones binarias de objetos java a un OutputStream. Se utiliza para serializar objetos.

		Lista lista1= new Lista(new int[]{12, 15, 11, 4, 32}); 
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("media.obj")); 
		salida.writeObject("guardar este string y un objeto\n"); 
		salida.writeObject(lista1); 
		salida.close();*/

/*		
		http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/archivos/objetos.htm
	        
	        serialización de objetos: permite convertir cualquier objeto cuya clase implemente el interface 
	        Serializable en una secuencia de bytes que pueden ser posteriormente leídos para restaurar 
	        el objeto original
	        
	        La serialización es una característica añadida al lenguaje Java para dar soporte a  

				- La invocación remota de objetos (RMI)
				- La persistencia
				
				
			 "Invocación remota de objetos": permite a los objetos que viven en otros ordenadores comportarse 
			  como si vivieran en nuestra propia máquina. La serialización es necesaria para transportar 
			  los argumentos y los valores de retorno.
				 - Esta característica se mantiene incluso a través de la red, por lo que podemos crear un objeto
				  en un ordenador que corra bajo Windows 95/98, serializarlo y enviarlo a través de la red a una
				  estación de trabajo que corra bajo UNIX donde será correctamente reconstruido. No tenemos que
				  procuparnos, en absoluto, de las diferentes representaciones de datos en los distintos ordenadores.
				  

			 "La persistencia": (Sirve para guardar objetos y reconstruirlos posteriormente) 
				 - Es una característica importante de los JavaBeans. El estado de un componente
				es configurado durante el diseño. La serialización nos permite guardar el estado de un componente
				en disco, abandonar el Entorno Integrado de Desarrollo (IDE) y restaurar el estado de dicho 
				componente cuando se vuelve a correr el IDE.



	 		Interface Serializable. Una interface vacía.
				import java.io.*;
				public interface Serializable{ }
		
			Para hacer una clase serializable simplemente ha de implementar el interface Serializable. Ejemplo 
				public class Lista implements java.io.Serializable{
				     private int[] x;
				     private int n;
					//otros miembros...
				}
				
				El "método defaultWriteObject" de la "clase ObjectOutputStream" realiza la serialización de los 
				objetos de una clase. Este método "escribe en el flujo de salida todo lo necesario para reconstruir 
				dichos objetos":
					- La clase del objeto
					- La firma de la clase (class signature)
					- Los valores de los miembros que no tengan los modificadores static o transient, incluyendo 
					  los miembros que se refieren a otros objetos.
					  
					  
				El método "defaultReadObject" de la "clase ObjectInputStream" realiza la deserialización de los 
				objetos de una clase. Este método "lee el flujo de entrada y reconstruye los objetos de dicha clase".


				
				"Escribir objetos" al flujo de salida ObjectOutputStream:
				
				1- Creamos un objeto.
				        Lista lista1= new Lista(new int[]{12, 15, 11, 4, 32});
				2- Creamos un fujo de salida.
				        FileOutputStream fileOut=new FileOutputStream("media.obj");
				3- El fujo de salida ObjectOutputStream es el que procesa los datos 
				       ObjectOutputStream salida=new ObjectOutputStream(fileOut);
				4- El método writeObject escribe los objetos al flujo de salida y los guarda en un archivo en disco.
				            salida.writeObject("guardar este string y un objeto\n");  //objeto de tipo string
				            salida.writeObject(lista1);								 //objeto de tipo lista
				5- Se cierran los flujos
				            salida.close();

					Ejemplo 
					  Lista lista1= new Lista(new int[]{12, 15, 11, 4, 32});
				      ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("media.obj"));
				      salida.writeObject("guardar este string y un objeto\n");
				      salida.writeObject(lista1);
				      salida.close();
				      
							      
				"Lectura de Objeto" desde el flujo de entrada  ObjectInputStream:
				
				1- Creamos fujo de entrada
				        FileInputStream fileIn=new FileInputStream("media.obj");
				2- El fujo de entrada ObjectInputStream es el que procesa los datos        
				        ObjectInputStream entrada=new ObjectInputStream(fileIn);
				3-El método readObject lee los objetos del flujo de entrada, en el mismo orden en el que ha sido escritos. 
				            String str=(String)entrada.readObject();
				            Lista obj1=(Lista)entrada.readObject();
				4-Se cierra los flujos
				            entrada.close();			   
				            
	            ejemplo:
	              ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("media.obj"));
			      String str=(String)entrada.readObject();
			      Lista obj1=(Lista)entrada.readObject();
			      System.out.println(str+obj1);
			      entrada.close();			               



			----Resumen----- 
				"Escritura de objeto"
					FileOutputStream fileOut=new FileOutputStream("media.obj");
					ObjectOutputStream salida=new ObjectOutputStream(fileOut);
					salida.writeObject(objeto);	//escribe el objeto al flujo
					
				"Lectura de objeto"	
			        FileInputStream fileIn=new FileInputStream("media.obj");
			        ObjectInputStream entrada=new ObjectInputStream(fileIn);
			        String str=(String)entrada.readObject();


			"transient"
			   Es una manera de proteger información sensible, cuando quiera que un valor no se transfiera,
			   pues es necesario anteponer el "modificador transient" delante del  tipo de dato que no quieras trasnferir.

				public class Cliente implements java.io.Serializable{
				  private String nombre;
				  private transient String passWord;
				  public Cliente(String nombre, String pw) {
				    this.nombre=nombre;
				    passWord=pw;  //este valor no será guardado al objeto porq a su tipo se le antepone "transient" 
				  }		        
*/		
		
	}

}
