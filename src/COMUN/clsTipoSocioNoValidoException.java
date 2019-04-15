package COMUN;

public class clsTipoSocioNoValidoException extends Exception 
{
	public clsTipoSocioNoValidoException()
	{
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() 
	{
		String mensaje = "Introduzca un tipo de socio valido (1-6)";

		return mensaje;
	}
	
}
