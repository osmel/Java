package Colecciones;
	
	public class Empleados {
	
	private String nombre;
	private int edad;
	  
	   //min 1.27 cap161
	public  Empleados(String nombre, int edad) {  
	    super();
	    this.nombre = nombre;
	    this.edad = edad;
	}    
	
	public void setNombre(String nombre) {
			 this.nombre=nombre;   
	}
	
	public  String getNombre() {
			 return nombre;   
	}
	   
	public void setEdad(int edad) {
			 this.edad=edad;   
	}
	
	public  int getEdad() {
			 return edad;   
	}
	   
	   //esto es para la generica, sobreescribe metodo tostring de Object
	public String toString(){
		   return nombre;
	}
		   
}