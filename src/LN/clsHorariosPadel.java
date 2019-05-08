package LN;

import java.time.LocalTime;

import COMUN.itfProperty;

public class clsHorariosPadel implements itfProperty
{
	/**
	 * Atributo de clase id que define la franja horaria.
	 */
	private int id;
	
	/**
	 * Atributo de clase que define la hora de inicio de la franja horaria.
	 */
	private LocalTime hora_inicio;
	
	/**
	 * Atributo de clase que define la hora de fin de la franja horaria
	 */
	private LocalTime hora_fin;
	
	public clsHorariosPadel (int id, LocalTime hora_inicio, LocalTime hora_fin)
	{
		this.id = id;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the hora_inicio
	 */
	public LocalTime getHora_inicio() {
		return hora_inicio;
	}

	/**
	 * @param hora_inicio the hora_inicio to set
	 */
	public void setHora_inicio(LocalTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	/**
	 * @return the hora_fin
	 */
	public LocalTime getHora_fin() {
		return hora_fin;
	}

	/**
	 * @param hora_fin the hora_fin to set
	 */
	public void setHora_fin(LocalTime hora_fin) {
		this.hora_fin = hora_fin;
	}

	@Override
	public Object getProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
