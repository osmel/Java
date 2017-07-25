package Colecciones;

public class Cliente {
	   private String nombre;
	   private String n_cuenta;
	   private double saldo;
	   
	   //min 5.00 cap180
		public  Cliente(String nombre, String n_cuenta, double saldo) {  //constructor
	        super();
	        this.nombre = nombre;
	        this.n_cuenta = n_cuenta;
	        this.saldo = saldo;
	    }

		//crear getter y setter (Source/generate getter and setter)
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getN_cuenta() {
			return n_cuenta;
		}

		public void setN_cuenta(String n_cuenta) {
			this.n_cuenta = n_cuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		/*
		 "equals": Este Metodo es capaz de discernir si 2 objetos predefinidos de la clase
           	         java son iguales(como es el caso de String y Date), pero no es capaz
           	         de discernir si 2 objetos hechos por ti son iguales o no.
           	         Por tanto lo que se hace es reescribir a este metodo, para q conozca a tus
           	         objetos. Claro en tu clase, para q este haga esa salvedad solo a los
           	         objetos de tu clase, no a las de java predefinidas
		 */
		   
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((n_cuenta == null) ? 0 : n_cuenta.hashCode());
			return result;
		}

		/* "hashCode": Un numero de ncifras que hace referencia a la localizacion del 
		          objeto que tenemos almacenado en la memoria(Heap).
		          Este metodo solo sirve para las clases que estan definidas por java
		          para las que creamos nosotros abra que reescribirlo, en nuestra clase
		*/
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (n_cuenta == null) {
				if (other.n_cuenta != null)
					return false;
			} else if (!n_cuenta.equals(other.n_cuenta))
				return false;
			return true;
		}    
		
		
		 	   
	}
