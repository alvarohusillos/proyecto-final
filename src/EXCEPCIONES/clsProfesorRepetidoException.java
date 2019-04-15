package EXCEPCIONES;

public class clsProfesorRepetidoException extends Exception
{
	private String m = "Profesor repetido con DNI nº";
	private String dni = "";
	
	public clsProfesorRepetidoException ()
	{
	
	}
	public clsProfesorRepetidoException (String dni)
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
