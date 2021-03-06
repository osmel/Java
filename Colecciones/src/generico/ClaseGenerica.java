package generico;
import Colecciones.Empleados;


/*
 * Después del nombre de la clase se indica los parámetros de tipos con el formato <T1, T2, T3, …>.
 T: Estos argumentos que pongo en la clase son los tipos genericos, 
  que podre utilizar dentro de esta clase para referenciar a un tipo que no tengo determinado, 
  porque cuando instancien esta clase es que especificaran el tipo con el que trabajara la clase:
 */
public class ClaseGenerica<T> {
	   private T valor;
	   
		public  ClaseGenerica(T mivalor) { //constructor q recibe cualquier valor  
	        //super();
	        valor=mivalor;
	        
	    }    
		
		   public void setValor(T nuevovalor) {
				 this.valor=nuevovalor;   
		   }
		
		   public  T getValor() {
				 return valor;   
		   }
		   
		   /*
		    * nota:Para definir un método genérico, no es necesario que la clase sea generica.
		    * metodo generico que espera recibir como argumento cualquier tipo de array
		    *  método generico<T1> 
   			   que devuelve string 
   				y espera como argumento un array de tipo generico (T[] a) 
		    */
		   public static <T1> String MetodoGenerico(T1[] arreglo) { 
			   return "El array tiene "+arreglo.length+ " Elementos"; 
		   }
		   
		   
		   
		   /*
		     			Comodines 
		     			List<? extends Number>: Acepta una lista de Number o de sus subtipos.
		     			List<? super Number>: Acepta una lista de Number o de sus supertipos.
		     					    List<?> : acepte cualquier tipo
		    * cualquier(?) subclase(que herede(extends) de empleados, como es el caso de jefe).
		   }
		   */
		   
		  public static <U extends Empleados> void inspector(U[] u){ 
		       System.out.println("U: " + u.getClass().getName()); 
		  }
		   
		   
		   
	}

