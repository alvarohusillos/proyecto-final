package LN;

import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_ID;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_DESCRIPCION;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_CUOTA;

import COMUN.itfProperty;

public class clsTipoSocio implements itfProperty {
	
	/**
	 * Atributo de clase id que define la modalidad de socio.
	 */
	private int idTipo_Socio = 0;
	/**
	 * Atributo de clase tipo de socio que define la modalidad de socio.
	 */
	private String nombre = "";
	
	/**
	 * Atributo descripcion de cada modalidad de tipo de socio.
	 */
	private String descripcion = "";
	
	/**
	 * Atributo cuota de cada modalidad de tipo de socio.
	 */
	private double cuota = 0.00;
	
	public int getIdTipo_socio() {
		return idTipo_Socio;
	}
	public void setIdTipo_Socio(int idTipo_Socio) {
		this.idTipo_Socio = idTipo_Socio;
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public Object getProperty(String propiedad) 
	{
		
		switch(propiedad){
		case PROPIEDAD_TIPO_SOCIO_ID: return this.getIdTipo_socio();
		case PROPIEDAD_TIPO_SOCIO_NOMBRE: return this.getNombre();
		case PROPIEDAD_TIPO_SOCIO_DESCRIPCION: return this.getDescripcion();
		case PROPIEDAD_TIPO_SOCIO_CUOTA: return this.getCuota();
		
	}
	return propiedad;
	}
	
}