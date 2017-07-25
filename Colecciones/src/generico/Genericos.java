package generico;
import Colecciones.Empleados;

public class Genericos {

	
	  public static void abc() {
		   //la clase generica se adapta en cada momento para cada tipo de objeto que se declare
		   
		   // instanciando esta clase de tipo <string>, por tanto todo lo q trate sera cadena
		   ClaseGenerica<String>  cadena = new ClaseGenerica<String>("osmel");
		   cadena.setValor("nuevo valor");
		   
		   ClaseGenerica<Integer>  numero = new ClaseGenerica<Integer>(4);
		   numero.setValor(10);
		   
		   
		   
		   System.out.println(cadena.getValor());
		   System.out.println(numero.getValor());
		   
		   /*
		   //caso <Empleados>
	        
		   //1--creamos el objeto
		   Empleados objetoEmpleado = new Empleados("prueba generica",39); 
		   //
		   Pareja<Empleados>  miEmpleado = new Pareja<Empleados>();
		   miEmpleado.setPrimero(objetoEmpleado);  //aqui ponemos el objeto q nos pide
		   System.out.println(miEmpleado.getPrimero().toString());
		  */
		   
	   }  
	
	public static void metodo_generico(){
		//char caracteres[] = {'a','b','c','d','e'};
		Double doble[][] = { 
						{3.5, 3.6, 3.7}, 
						{5.0, 4.7, 10.7}						
				};

		String cadena[] = {"duvi","alex","otro"};

		Integer numero[] = new Integer[4];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = i;
	    }
		
		String cant_cadena = ClaseGenerica.<String>MetodoGenerico(cadena);
		System.out.println(cant_cadena);
		
		String cant_numero = ClaseGenerica.<Integer>MetodoGenerico(numero);
		System.out.println(cant_numero);
		
		String cant_double = ClaseGenerica.<Double[]>MetodoGenerico(doble);
		System.out.println(cant_double);

		
	}  
	public static void Limitar_tipos(){
		Empleados lista[] = new Empleados[3]; 
		lista[0]= new Empleados("osmel",39); 
		lista[1]= new Empleados("pepe",28); 
		lista[2]= new Empleados("dag",27);
		ClaseGenerica.<Empleados>inspector(lista);
		
		Jefe mijefe[] = new Jefe[1]; 
		mijefe[0]= new Jefe("osmel",39); 
		ClaseGenerica.<Jefe>inspector(mijefe);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abc();
		//metodo_generico();
		Limitar_tipos();
	}

}
