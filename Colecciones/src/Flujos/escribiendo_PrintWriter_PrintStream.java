package Flujos;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class escribiendo_PrintWriter_PrintStream {

	public static void salida_Pantalla_automatica_PrintStream() throws IOException{
		/*
		 	PrintWriter: Buffer de salida es vaciado automaticamente los datos, 
		 				y se muestran de forma automatica
		*/

        PrintStream ps = new PrintStream( System.out ); 
		int a =2;    	
		ps.println(a);
	}   	
	
	public static void salida_Pantalla_forzarPUSH_PrintWriter() throws IOException{
		/*
		 	PrintWriter: Escribe representaciones textuales de objetos java en un Writer.
		 	Hay que forzar el vaciado del buffer de salida. Invocando el método flush
		*/

		PrintWriter fs = new PrintWriter( System.out ); 
		int a =3; 
		fs.println(a); 
		fs.flush();
		
	}   	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			salida_Pantalla_automatica_PrintStream();
			salida_Pantalla_forzarPUSH_PrintWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 Escribir información
			Streams de Salida de Bytes(OutputStream)
				PrintStream: Buffer de salida es vaciado automaticamente los datos, y
				 			 se muestran de forma automatica
				PrintStream ps = new PrintStream( System.out ); 
				int a =2;    	
				fs.println(a); 
			  
			Streams de Salida de caracteres(Writer)
				PrintWriter: Escribe representaciones textuales de objetos java en un Writer.
							 Hay que forzar el vaciado del buffer de salida. 
							 Invocando el método flush
				PrintWriter fs = new PrintWriter( System.out ); 
				int a =2; 
				fs.println(a); 
				fs.flush(); 
		 * 
		 */

	}

}
