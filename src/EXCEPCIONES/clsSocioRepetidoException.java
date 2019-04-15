package EXCEPCIONES;

/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 * Esta clase se encarga de generar una excepcion cuando el usuario intente introducir un socio cuyo dni ya se encuentra registrado
 * en nuestro sistema. Tiene dos constructores, uno sin parametros y el otro con el parametro dni que es el que determina
 * la igualdad de dos socios
 *
 */

public class clsSocioRepetidoException extends Exception
{
	private String m = "Socio repetido con DNI nº";
	private String dni = "";
	
	public clsSocioRepetidoException ()
	{
	
	}
	public clsSocioRepetidoException (String dni)
	{
		this.dni = dni;
	}
	
	
	/**
	 * @param dni El parametro es el dni del socio que queremos introducir
	 * @return mensaje. Devuelve al usuario un mensaje de error indicandole que el socio se encuentra repetido
	 */
	public String getMessage (String dni)
	{
		String mensaje = m + dni;
		
		return mensaje;
	}
}
