package Colecciones;

public class Libro {
	  private String titulo;
	  private String autor;
	  private int ISBN;
	  
	  /*
	   Los que propone Eclipse tomando campo ISBN
	   //source/generate hashCode() and equals() //Para hacerlo de forma automatica para cada clase
		//especificando q campos marcan la diferencia
	   * */
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//aqui finalmente, no es tomando en cuenta la direccion de memoria, 
		//sino q solo esta tomando en cuenta el ISBN
		//y finalmente esta devolviendo el valor del ISBN+31 como el valor de referencia
		//por tanto si 2 ISBN son iguales, pues entonces las memorias serán iguales
		result = prime * result + ISBN;  
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}	  
	
	
	/* Este es el que se hizo a mano
	   @Override
		public boolean equals(Object obj) {
			
		//Primero q pregunto, es si el objeto q me estan pasando pertenece a la clase libro
		  if ( obj instanceof Libro) {
			//tengo q castearlo, porq el ISBN pertenece a libro no a object, 
			 //y para tomar el ISBN lo tengo q tomar desde libro.
				Libro otro = (Libro)obj;  //convertimos obj en un objeto de tipo libro

				if (this.ISBN==otro.ISBN) { //compara objeto actual, con el objeto pasado por parametro  objActual.equals(objpasadoPorParametro);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		
		}	  
		  
	 * 
	 * */
		  
		public Libro(String titulo, String autor, int iSBN) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			ISBN = iSBN;
		}
		
		public String getDatos() {
			return "El titulo es: "+titulo+" autor "+autor+" su ISBN es: "+ISBN;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public int getISBN() {
			return ISBN;
		}
		
		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}

		
}
