package COMPARADORES;

import java.util.Comparator;

import LN.clsProfesor;
import LN.clsSocio;

public class clsComparadorNombreProfesor implements Comparator<clsProfesor>
{

	@Override
	public int compare(clsProfesor p1, clsProfesor p2) { // Metodo que permite comparar personas
		if (p1.getNombre().compareTo(p2.getNombre()) == 0) {// En caso de tener mismo nombre, que compare apellido
			return p1.getApellido1().compareTo(p2.getApellido1());
		} else { 
			return p1.getNombre().compareTo(p2.getNombre());
		}
	}

}
