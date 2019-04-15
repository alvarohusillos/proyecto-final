package LN;

import COMUN.itfProperty;

import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO1;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO2;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DIRECCION;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DNI;


/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 * Esta clase es la encargada de crear distintos profesores. Esta clase hereda los atributos y métodos de su
 * clase padre que es clsUsuario. Esta clase no tiene ni atributos ni métodos puesto que sus atributos coinciden 
 * exactamente con los de la clase padre clsUsuario.
 *
 */
public class clsProfesor extends clsUsuario implements itfProperty
{
	public clsProfesor()
	{
		
	}
	public clsProfesor(String _nombre, String _apellido1, String _apellido2, String _dni, String _direccion)
	{

	}
	public Object getProperty(String propiedad)
	{
		switch(propiedad)
		{
		case PROPIEDAD_PROFESOR_NOMBRE: return this.getNombre();
		case PROPIEDAD_PROFESOR_APELLIDO1: return this.getApellido1();
		case PROPIEDAD_PROFESOR_APELLIDO2: return this.getApellido2();
		case PROPIEDAD_PROFESOR_DIRECCION: return this.getDireccion();
		case PROPIEDAD_PROFESOR_DNI: return this.getDni();
		}
		return propiedad;
	}
}
