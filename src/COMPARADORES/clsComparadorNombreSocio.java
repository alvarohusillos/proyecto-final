package COMPARADORES;

import java.util.Comparator;

import LN.clsSocio;

public class clsComparadorNombreSocio implements Comparator<clsSocio> {

	@Override
		public int compare(clsSocio s1, clsSocio s2) { // Metodo que permite comparar personas
			if (s1.getNombre().compareTo(s2.getNombre()) == 0) {// En caso de tener mismo nombre, que compare apellido
				return s1.getApellido1().compareTo(s2.getApellido1());
			} else { 
				return s1.getNombre().compareTo(s2.getNombre());
			}
		}

	}
