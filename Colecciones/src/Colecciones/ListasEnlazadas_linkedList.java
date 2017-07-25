package Colecciones;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListasEnlazadas_linkedList {

	public static void Listas_enlazadas() {
		/*
		 *  cap 184
		 LinkedList: esta implementación permite que mejore el rendimiento en ciertas ocasiones.
		  Esta implementación se basa en una "lista doblemente enlazada" de los elementos, 
		  teniendo cada uno de los elementos un puntero al anterior y al siguiente elemento.
		  
		  La diferencia con un ArrayList, radica en "la eficiencia":
		  		* ArrayList(2.00min): Estos almacenan los datos en posiciones adyacentes en la memoria
		  			  (pegados uno de otro)
		  			  Entonces cuando queremos eliminar un elemento: estamos obligados a cubrir su espacio
		  			  y eso implica q tenemos q recorrer todos los elementos hasta cubrir los espacios
		  			  Por tanto en eficiencia consume muchos recursos
		  	
				* LinkedList: Almacena la información en un nodo. 
						Nodo: Consta de 3 partes
						      - Almacena información
						      - Enlace que apunta elemento anterior dentro de la LinkedList. 
						      - Enlace que apunta elemento siguiente dentro de la LinkedList.
						Nota: los nodos no tienen porq estar adyacente entre ellos
						  		  			
		  							
		  ----------------------------------------------------------  
		 
		 Ventajas:
		   - Acceso aleatorio
		   - Están ordenadas (collection.sort())
		   - Añadir y eliminar sin restricciones
		   - ListIterator modifica en cualquier direccion
		   - Sintaxis similar a Array
		 
		 DesVentajas:
		 	- Bajo rendimiento en operaciones concretas q se resolverian mejor con otras interfaz
		  
		  
		  List<Integer> linkedList = new LinkedList<Integer>();
			
		 */
		
		
		List<Cliente> personas = new LinkedList<Cliente>();
		
		   Cliente cl1 = new Cliente("osmel", "002", 100);
		   Cliente cl2 = new Cliente("duvi", "001", 90);
		   Cliente cl3 = new Cliente("alex", "003", 60);
		   Cliente cl4 = new Cliente("fidel", "001", 90);
		
		   
		   personas.add(cl1);
		   personas.add(cl2);
		   personas.add(cl3);
		   personas.add(cl4);
		   
		
		   System.out.println(personas.size());
		   
		   //insertamos un elemento en la posicion 2
		   personas.add(2, new Cliente("nuevo", "003", 190));
		   
		
		   //se muestra en el mismo orden que han sido agregados los elementos
		   for (Cliente cliente : personas) {
				 System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()
				                    +" "+cliente.getSaldo());
		   }	
		   
	}
	
	public static void Listas_enlazadas_iterador() {
		/*       interfaz ListIterator
		
		Nota: para listas la "interfaz Iterator" no sirve de mucho, porq solo da posibilidad de moverse 
					hacia-delante y borrar elementos
		 
		Pues sería Más cómodo utilizar la "interfaz ListIterator" que me da mucha más opciones
		    	  remove() : Eliminar elementos
		    	  add(E e): Agregar un Elemento
		    	  Set(E e): Remplazar un elemento con el elemento especificado 
	
		    	  hasNext:   hacia delante
		    	  hasPrevious: moverme hacia atraz
		    	  nextIndex() : tomar el valor de un elemento especificado
		    	  next():
		    	  previous();
		    	  previousIndex() : tomar el valor de un elemento especificado
		  */
		
		
			List<String> personas = new LinkedList<String>();
		
		   
		   personas.add("osmel");
		   personas.add("duvi");
		   personas.add("alex");
		   personas.add("fidel");
	   
		   
		   //insertamos un elemento en la posicion 1
		   personas.add(1, "nena");
		   
		   /*
		   //se muestra en el mismo orden que han sido agregados los elementos
		   for (String cliente : personas) {
				 System.out.println(cliente);
		   }	
		   */
		   
		   ListIterator<String> mi_iterador = personas.listIterator();
		   //mi_iterador.hasNext(): Mientras el iterator tenga un proximo elemento   
		   
	    	  mi_iterador.next();//se mueve a la segunda posicion
	    	  mi_iterador.add("soy segundo");

	      	for (String p : personas) {
	  			System.out.println(p);
	  		}    
		
		
		
	}	
	
	 //5 cap 185 (Practicando con LinkedList) "
	 //micuenta.Mi_linked_list();

   public static  void Mi_linked_list() {
   	LinkedList<String> paises = new LinkedList<String>();
   	paises.add("España");
   	paises.add("Colombia");
   	paises.add("Mexico");
   	paises.add("Perú");

   	LinkedList<String> capitales = new LinkedList<String>();
   	capitales.add("Madrid");
   	capitales.add("Bogota");
   	capitales.add("DF");
   	capitales.add("Lima");

   	//comprobar que ambos fueron bien agregados
   	System.out.println(paises);
   	System.out.println(capitales);
   	

   		//declaramos e iniciamos el iterador
	    ListIterator<String> it_paises = paises.listIterator();
	    ListIterator<String> it_capitales = capitales.listIterator();
	    
	     //agregarle las capitales a la lista de paises
	     while (it_capitales.hasNext()) {
   		  if (it_paises.hasNext()){
   			  it_paises.next();
   		  }
   		  
   		  	it_paises.add(it_capitales.next());
			
		  }
   	  
   	  System.out.println(paises);


   	  
   	  //Aqui el iterador se encuentra en la ultima posicion
   	  //para volver a poner el iterador al inicio, volvemos a iniciar nuestro iterador

   	  it_capitales = capitales.listIterator();
   	//Borrar las posiciones pares de la lista paises
   	  while (it_capitales.hasNext()) {
   		  it_capitales.next();
   		  if  ( it_capitales.hasNext() ){
   			  it_capitales.next();
   			  it_capitales.remove();
   		  }
		  }
   	  System.out.println(paises);
   	  System.out.println(capitales);   
   	  
   	  //lo que hace es remover de paises los que se encuentran en capitales
   	  paises.removeAll(capitales);
   	  System.out.println(paises);

   	  
   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	//cap 184
		//Listas_enlazadas();
		//Listas_enlazadas_iterador();

		
	//5 cap 185 (Practicando con LinkedList) "
		Mi_linked_list();
		 	
		
		
		
	}

}
