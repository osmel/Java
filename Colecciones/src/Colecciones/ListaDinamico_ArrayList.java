package Colecciones;
import java.util.ArrayList;
import java.util.Iterator;
public class ListaDinamico_ArrayList {

	
	 public  static void arreglo_estatico() {
		 //array tradicional o estatico
		   Empleados lista[] = new Empleados[3];
		   lista[0]= new Empleados("osmel",39);
		   lista[1]= new Empleados("pepe",28);
		   lista[2]= new Empleados("dag",27);

		   //ciclo tradicional o convencional	
		   for (int i = 0; i < lista.length; i++) {
			    System.out.println(lista[i].getNombre());
		   }

		   //ciclo avanzado	
		   for (Empleados e : lista) {
			   System.out.println(e.getNombre());
		   }
		   
	   }
	 
	 public static void arreglo_dinamico() {
		   ArrayList<Empleados>  lista = new ArrayList<Empleados>();
		   
		   lista.add(new Empleados("osmel",39));
		   lista.add(new Empleados("pepe",28));
		   lista.add(new Empleados("dag",27));
		   lista.trimToSize(); // Optimiza recurso, recolector de basura borra espacio sobrante

		   //remplaza elemento 0
		   lista.set(0,new Empleados("nuevo posicion2",40));
		   
		   //Obtener elemento get()
		   System.out.println(" Elemento 3: " +lista.get(2).getNombre());

		   //-------------ciclo avanzado--------------------	
		   for (Empleados e : lista) {
			   System.out.println(e.getNombre());
		   }

		   
		   //--------------------ciclo tradicional o convencional--------------------	
		   //Recordar que un arrayList No lleva indice por tanto casteamos su posicion
		   for (int i = 0; i < lista.size(); i++) {
			    Empleados e = lista.get(i);
			    System.out.println(e.getNombre());
		   }


		  //--------------ciclo convencional COPIANDO un ArrayList(dinamico) a un ArrayConvencional(dinamico)
		   
		   Empleados arregloEmpleados[] = new Empleados[lista.size()];
		   lista.toArray(arregloEmpleados);

		   for (int i = 0; i < arregloEmpleados.length; i++) {
			    System.out.println(arregloEmpleados[i].getEdad());
		   }
		   
		   
		   
		   //metodo iterator() del arrayList: Devuelve un objeto de tipo iterator
		   //  será el encargado de recorrer la lista
		   Iterator<Empleados> mi_iterador = lista.iterator();
		   //mi_iterador.hasNext(): Mientras el iterator tenga un proximo elemento   
		   while (mi_iterador.hasNext()) {
			   System.out.println(mi_iterador.next().getEdad());
		   }
		   
		   /*
		    boolean hasNext: dice si hay o no mas elementos
		    		E next : devuelve proximo elemento
		      void remove  : Elimina elemento que estamos mirando
		     
		    */
		   
		   
		   
	   }  	 
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//arreglo_estatico();
			arreglo_dinamico();
		}
	 

}
