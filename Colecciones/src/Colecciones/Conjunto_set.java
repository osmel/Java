package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Conjunto_set {

	public static void Interfaz_Set() {
		   Cliente cl1 = new Cliente("osmel", "002", 100);
		   Cliente cl2 = new Cliente("duvi", "001", 90);
		   Cliente cl3 = new Cliente("alex", "003", 60);
		   Cliente cl4 = new Cliente("fidel", "003", 60);
		 
		   

		   /*
		    Implementar una Interfaz de tipo "SET"
		       - Que no se dupliquen los clientes
		       - Me permite agregar y eliminar
		       - Solo sea de lectura
		       
		        INTERFAZ SET:
		          Ventajas:
		            - No permite elem duplicados(cuando son el mismo objeto, stack y heap min 7.04 cap181)
		               	 "métodos equals y hashCode"
		               	 
		            - Uso sencillo de "add". Q asegura no duplicados
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
		   //este cuarto no lo va agregar porque es igual al 3, y ya implementamos en Cliente
		   //al HashCode y equals de la propia clase
		   coleccionBanco.add(cl4);
	
		   
		   
		   for (Cliente cliente : coleccionBanco) {
			 System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()
			                    +" "+cliente.getSaldo());
		   }
		   
		   
		   
}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz_Set(); //utilizando la "clase HashSet"
	}	
	
}