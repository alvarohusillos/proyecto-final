package EXCEPCIONES;

public class clsAtributoInexistenteRuntimeException extends RuntimeException 
{
	public clsAtributoInexistenteRuntimeException ()
	{
		
	}

	
	@Override
	public String getMessage() {
		 String mensaje = "Propiedad Inexistente";
		return mensaje;
	}
	
}
