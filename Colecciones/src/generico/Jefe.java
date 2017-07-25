package generico;
import Colecciones.Empleados;

public class Jefe extends Empleados {
	
	public Jefe(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
    
	double incentivo(double inc){
    	return inc;
    }	

}
