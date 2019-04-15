package LN;

import static COMUN.clsConstantes.PROPIEDAD_USUARIO_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_USUARIO_APELLIDO1;
import static COMUN.clsConstantes.PROPIEDAD_USUARIO_APELLIDO2;
import static COMUN.clsConstantes.PROPIEDAD_USUARIO_DIRECCION;
import static COMUN.clsConstantes.PROPIEDAD_USUARIO_DNI;

import COMUN.itfProperty;

/**
 * @author Ignacio Chapero
 * 		   Alvaro Husillos
 * 
 * Esta clase es abstracta para que por higiene de programacion no nos deje crear objetos de la misma.
 * Esta clase es la clase padre de clsSocio y clsProfesor, de tal forma que los atributos y metodos de 
 * esta clase seran heredados por clsSocio y clsProfesor.
 *
 */
public abstract class clsUsuario implements itfProperty {
	
	/**
    Atributo nombre de la persona.
    */
    private String nombre;
    
    /**
     *  Atributo apellido1 de la persona.
     */
    private String apellido1;
    
    /**
     *  Atributo apellido2 de la persona.
     */
    private String apellido2;
    
    /**
     *  Atributo dni de la persona.
     */
    private String dni;
    
    /**
     *  Atributo direccion de la persona.
     */
    private String direccion;
    
    public clsUsuario() {
    	
    	this.nombre="";
    	this.apellido1="";
    	this.apellido2="";
    	this.dni="";
    	this.direccion="";
    	
    }
    
    /**
     * Constructor de la clase clsUsuario. Necesita como parametros los atributos de esta clase, que son los
     * inicializados anteriormente.
     * 
     * @param _nombre Nombre del Usuario
     * @param _apellido1 Primer apellido del usuario
     * @param _apellido2 Segundo apellido del usuario
     * @param _dni DNI del usuario
     * @param _direccion Direccion del usuario
     * 
     * No tiene ningun retorno.
     */
	public clsUsuario(String _nombre, String _apellido1, String _apellido2, String _dni, String _direccion) {
		
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellido1 = _apellido1;
		this.apellido2 = _apellido2;
		this.direccion = _direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Object getProperty(String propiedad){
		
			switch(propiedad)
			{
			case PROPIEDAD_USUARIO_NOMBRE: return this.getNombre();
			case PROPIEDAD_USUARIO_APELLIDO1: return this.getApellido1();
			case PROPIEDAD_USUARIO_APELLIDO2: return this.getApellido2();
			case PROPIEDAD_USUARIO_DIRECCION: return this.getDireccion();
			case PROPIEDAD_USUARIO_DNI: return this.getDni();	
			
			}
			return propiedad;
			
		}

	/* 
	 * El metodo hashCode sirve para distinguir que dos objetos de la clase clsUsurario son iguales o no en 
	 * funcion de su dni.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	/* El metodo equals sirve para distinguir que dos objetos de la clase clsUsurario son iguales o no en 
	 * funcion de su dni.
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		if (obj == null) {
			
			return false;
		}
		
		clsUsuario other = (clsUsuario) obj;
		if (dni == null) {
			if (other.dni != null) {
				
				return false;
			}
		} else if (!dni.equals(other.dni)) {
			
			return false;
		}
		
		return true;
	}
	}
	
	
    



