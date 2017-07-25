package Colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Conjunto_set {

	
	 public  static void iteradores_coleccion() {
		   
		   Cliente cl1 = new Cliente("osmel", "001", 100);
		   Cliente cl2 = new Cliente("pepe", "002", 90);
		   Cliente cl3 = new Cliente("caca", "003", 60);

		   Set <Cliente> coleccionBanco = new HashSet<Cliente>();
	   
		   coleccionBanco.add(cl1);
		   coleccionBanco.add(cl2);
		   coleccionBanco.add(cl3);
		      
			   
			  /*
			   Aunque para recorrer el foreach es más comodo, pues para eliminar, modificar, 
			   no nos sirve, porq Cuando tratamos de hacer estas operaciones sobre 
			   un elemento de una coleccion ocurre una 
			    excepción "ConcurrentModificationException":
			    Que significa que no se puede borrar o modificar una coleccion,
			    cuando la recorremos, 
			   *******"hay problema de concurrencia en las acciones"******				   

			   for (Cliente cliente : coleccionBanco) {
				  if (cliente.getNombre().equals("osmel")){
					  coleccionBanco.remove(cliente); 
				  }
	 		   }

			   */
			   
			  	
			   
 		   	/*Para eliminar o modificar, usaremos iterador. Los metodos idoneos para hacer esto en colecciones*/
			   
			 //creo un iterador que será el encargado de recorrer la lista
				//metodo iterator(): Devuelve un objeto de tipo iterator

			   
				 Iterator<Cliente> mi_iterador = coleccionBanco.iterator();
				  //mi_iterador.hasNext(): Mientras el iterator tenga un proximo elemento   
				   
				   while (mi_iterador.hasNext()) {
					   //String el_nombre = mi_iterador.next().getNombre();
					   Cliente proximo = mi_iterador.next(); 
					   System.out.print(proximo.getNombre());
					   System.out.println(proximo.getN_cuenta());
					   
					   if (proximo.getNombre().equals("osmel") ){
						   mi_iterador.remove();
					   } 
				   }
				   
				   /*
				    boolean hasNext: dice si hay o no mas elementos
				    		E next : devuelve proximo elemento. "en este caso E = Cliente" 
				    		        Lanza una excepcion "NoSuchElementException" cuando salta a una posicion que no existe 
				      void remove  : Elimina elemento que estamos mirando
				    */
	 		   
		   
				   for (Cliente cliente : coleccionBanco) {
						 System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()
						                    +" "+cliente.getSaldo());
			 		   }	
			   
	   }  
	
	
	
	public static void Interfaz_Set() {
		   Cliente cl1 = new Cliente("osmel", "002", 100);
		   Cliente cl2 = new Cliente("duvi", "001", 90);
		   Cliente cl3 = new Cliente("alex", "003", 60);
		   Cliente cl4 = new Cliente("fidel", "001", 90);
		 
		   

		   /*
		    Implementar una Interfaz de tipo "SET"
		       - Que no se dupliquen los clientes
		       - Me permite agregar y eliminar
		       - Solo sea de lectura
		       
		        INTERFAZ SET:
		          Ventajas:
		            - No permite elem duplicados(cuando son el mismo objeto, stack y heap min 7.04 cap181)
		               	 
		               --"métodos equals y hashCode" --->  source/generate hashCode() and equals() 
		               	  Importante destacar que, para comprobar si los elementos son elementos duplicados 
		               	  o no lo son, es necesario que dichos elementos tengan implementada, de forma correcta
		               	  , los métodos "equals y hashCode". Para comprobar si dos Set son iguales, 
		               	  se comprobarán si todos los elementos que los componen son iguales sin importar en 
		               	  el orden que ocupen dichos elementos.
		               	  
		               	 
		            - Uso sencillo de "add". Q asegura no duplicados
		            - Contiene, únicamente, los métodos heredados de Collection añadiendo la restricción 
		            	de que los elementos duplicados están prohibidos.
                    		            	
		          DESventajas:
		            - No tiene acceso aleatorio
		            - Poca eficiencia para ordenar elemento. Y no siempre se puede
		            
		    *  Esto no lo puedo hacer porq es una interfaz.
		         Set<Cliente> coleccionBanco = new Set<Cliente>();
		      Hay que "implementarla a travez de una clase" que implementa la interface
		      Puede ser Una de estas clases:
		       		HashSet, AbstractSet, ConcurrentHashMap.KeySetView, ConcurrentSkipListSet, 
		      		CopyOnWriteArraySet, EnumSet, JobStateReasons, LinkedHashSet, TreeSet

			sintaxis
				  interfaz<ClaseGenerica> variable = new ClaseImplementaSet<ClaseGenerica>();	
		    	  HashSet <Cliente> coleccionBanco = new HashSet<Cliente>();
		    	  	
		    */
		   
		   Set <Cliente> coleccionBanco = new HashSet<Cliente>();

		   //add detecta si un objeto se repite
		   coleccionBanco.add(cl1);
		   coleccionBanco.add(cl2);
		   coleccionBanco.add(cl3);
		   //este cuarto no lo va agregar porque es igual al 2, y ya implementamos en Cliente
		   //al HashCode y equals de la propia clase, que prohibe las duplicaciones
		   coleccionBanco.add(cl4);
	
		   
		   
		   for (Cliente cliente : coleccionBanco) {
			 System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()
			                    +" "+cliente.getSaldo());
		   }
		   
		   
		   
}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//cap 183	
		//Interfaz_Set(); //utilizando la "clase HashSet"
		
		iteradores_coleccion(); //para eliminar solo se puede hacer con iteradores.
	}	
	
}
