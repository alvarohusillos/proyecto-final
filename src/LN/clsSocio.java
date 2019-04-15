package LN;

import COMUN.itfProperty;
import EXCEPCIONES.clsAtributoInexistenteRuntimeException;

//Importamos todas las constantes del paquete comun para poder usarlas
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_APELLIDO1;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_APELLIDO2;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_DIRECCION;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_DNI;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_CODIGO_POSTAL;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_FECHA_NACIMIENTO;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_TELEFONO;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_EMAIL;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_IBAN;
import static COMUN.clsConstantes.PROPIEDAD_SOCIO_IDTIPO_SOCIO;
/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 * Esta clase es la encargada de crear distintos socios. Esta clase hereda los atributos y métodos de su
 * clase padre que es clsUsuario. En añadidura a estos atributos heredados, además posee otros propios que son
 * codigoPostal, fechaNacimiento, telefono, email, iban.
 *
 */
public class clsSocio extends clsUsuario {
	
	public clsSocio () {
		super();
	}	
	
	/**
	 * Atributo del codigo postal del socio del gimnasio.
	 */
	private String codigoPostal ="";
	
	/**
	 * Atributo de la fecha de nacimiento del socio del gimnasio.
	 */
	private String fechaNacimiento ="";
	
	/**
	 * Atributo del telefono del socio del gimnasio.
	 */
	private String telefono ="";
	
	/**
	 * Atributo del email del socio del gimnasio.
	 */
	private String email ="";
	
	/**
	 * Atributo del numero de cuenta del socio del gimnasio.
	 */
	private String iban ="";
	
	/**
	 * Atributo del identificador del tipo de socio.
	 */
	private int idtipo_socio = 0;
	

	public clsSocio (String _nombre, String _apellido1, String _apellido2, String _dni, String _direccion, String _codigoPostal, String _fechaNacimiento, String _telefono, String _email, String _iban, int _idtipo_socio)
	{
		super();
		this.codigoPostal= _codigoPostal;
		this.fechaNacimiento= _fechaNacimiento;
		this.telefono= _telefono;
		this.email= _email;
		this.iban= _iban;
		this.idtipo_socio = _idtipo_socio;
	}

	
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public int getIdtipo_socio() {
		return idtipo_socio;
	}

	public void setIdtipo_socio(int idtipo_socio) {
		this.idtipo_socio = idtipo_socio;
	}
	

	@Override
	public  Object getProperty(String propiedad) throws clsAtributoInexistenteRuntimeException
	{
		switch(propiedad){
			case PROPIEDAD_SOCIO_NOMBRE: return this.getNombre();
			case PROPIEDAD_SOCIO_APELLIDO1: return this.getApellido1();
			case PROPIEDAD_SOCIO_APELLIDO2: return this.getApellido2();
			case PROPIEDAD_SOCIO_DIRECCION: return this.getDireccion();
			case PROPIEDAD_SOCIO_DNI: return this.getDni();
			case PROPIEDAD_SOCIO_CODIGO_POSTAL: return this.getCodigoPostal();
			case PROPIEDAD_SOCIO_TELEFONO: return this.getTelefono();
			case PROPIEDAD_SOCIO_EMAIL: return this.getEmail();
			case PROPIEDAD_SOCIO_FECHA_NACIMIENTO: return this.getFechaNacimiento();
			case PROPIEDAD_SOCIO_IBAN: return this.getIban();
			case PROPIEDAD_SOCIO_IDTIPO_SOCIO: return this.getIdtipo_socio();		
			default: throw new clsAtributoInexistenteRuntimeException();
		}
		
		
	}
}