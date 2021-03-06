package Colecciones;

public class Libro_equals_hashCode {

	public static void compararLibros_equals(){
		Libro libro1 = new Libro("titulo1", "autor1", 20);
		Libro libro2 = new Libro("titulo1", "autor1", 20);
		if (libro1.equals(libro2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}
	}
	
	public static void compararLibros_hashCode(){
		Libro libro1 = new Libro("titulo1", "autor1", 22);
		Libro libro2 = new Libro("titulo1", "autor1", 20);
		Libro libro3 = new Libro("titulo1", "autor1", 22);
		if (libro1.equals(libro2)) {
			System.out.println("son iguales");
			System.out.println(libro1.hashCode());//referencia de libro1
			System.out.println(libro2.hashCode());//referencia de libro2
			
		} else {
			System.out.println("son diferentes");
			System.out.println(libro1.hashCode());//referencia de libro1
			System.out.println(libro2.hashCode());//referencia de libro2
						
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*si sobreescribimos el metodo equals en nuestra clase,
		 conocera quien es el ISBN y podra darnos si son iguales o no
		 de lo contrario nos dara que son diferentes porq el método equals no conoce nuestros
		 objetos propios, y por defecto el esta preparado solo para conocer los objetos que
		 estan por defecto en JAVA como es el caso de String, Date. 
		 */
		//compararLibros_equals();
		compararLibros_hashCode();
		
		//source/generate hashCode() and equals() //Para hacerlo de forma automatica para cada clase
		//especificando q campos marcan la diferencia

	}

}
