package LP;

import java.sql.SQLException;
//Importamos todas las clases y todas las constantes que vamos a utilizar en la clsMenu
import java.util.ArrayList;

import COMUN.itfProperty;
import EXCEPCIONES.clsProfesorRepetidoException;
import EXCEPCIONES.clsSocioRepetidoException;
import LN.clsGestor;
import LN.clsProfesor;
import LN.clsSocio;

//Constantes relacionadas con la clase clsSocio
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

//Constantes relacionadas con la clase clsProfesor
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO1;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO2;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DIRECCION;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DNI;

//Constantes relacionadas con la clase clsTipoSocio
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_ID;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_DESCRIPCION;
import static COMUN.clsConstantes.PROPIEDAD_TIPO_SOCIO_CUOTA;

/**
 * @author Ignacio Chapero Alvaro Husillos
 * 
 *         La clase menu se encarga de mostrar al usuario el menu con todas las
 *         funcionalidades de la aplicacion. Posteriormente, se encarga de
 *         recoger la opcion introducida por el usuario, y aplicarle el metodo
 *         correspondiente. Este menu se mostrara indefinidamente hasta que el
 *         usuario decida salir de la aplicacion. Una vez elegida la opcion,
 *         esta clase solicitara al usuario los datos necesarios para realizar
 *         la operacion indicada. Para ejecutar la funcionalidad, la clase menu
 *         utilizara un objeto y los metodos de la clsGestor.
 *
 */
public class clsMenu {

	public static void MenuPrincipal(clsGestor objGestor) throws clsProfesorRepetidoException {
		int op = 0;

		System.out.println("Bienvenido a la aplicaci�n Gestion del Bakh");

		// Con el bucle do-while mostramos el menu continuamente mientras el usuario no
		// decida salir de la aplicacion
		do {
			System.out.println("");
			System.out.println("1.- Alta de socio");
			System.out.println("2.- Modificaci�n datos de socio");
			System.out.println("3.- Consulta datos de socio");
			System.out.println("4.- Eliminaci�n socio");
			System.out.println("5.- Alta de profesor");
			System.out.println("6.- Modificaci�n datos de profesor");
			System.out.println("7.- Consulta datos de profesor");
			System.out.println("8.- Eliminaci�n de profesor");
			System.out.println("9.- Reserva de actividad");
			System.out.println("10.- Consulta disponibilidad");
			System.out.println("11.- Anulaci�n reserva");
			System.out.println("12.- SALIR");

			System.out.println("");
			System.out.println("Elija la opci�n deseada:");

			// Recogemos con el metodo leerEntero() de la clase utilidadesLP el int
			// introducido por el usuario
			op = utilidadesLP.leerEntero();

			// Con el if nos aseguramos de que el numero introducido este entre 1 y 12, las
			// opciones disponibles
			if (op >= 1 & op <= 12) {
				switch (op) {

				case 1:
					insertarSocio(objGestor);
					break;

				case 2:
					modificarSocio(objGestor);
					break;

				case 3:
					consultarSocios(objGestor);
					break;

				case 4:
					eliminarSocio(objGestor);
					break;

				case 5:

					insertarProfesor(objGestor);

					break;

				case 6:
					modificarProfesor(objGestor);
					break;

				case 7:
					consultarProfesor(objGestor);
					break;

				case 8:
					eliminarProfesor(objGestor);
					break;

				case 9:
					reservar(objGestor);
					break;

				case 10:
					consultarDisponibilidad();
					break;

				case 11:
					anularReserva();
					break;

				case 12:
					System.out.println("********************");
					System.out.println("FIN DE LA APLICACION");
					System.out.println("Vuelve cuando quieras");
					System.out.println("*********************");
					break;

				}
			} else {
				System.out.println("Introduzca una opci�n v�lida");
			}
		} while (op != 12);

	}

	/**
	 * Este metodo se encarga de solicitar al usuario alg�n dato del profesor cuyos
	 * datos queremos eliminar, de tal forma que a traves de un metodo de la clase
	 * clsGestor se pueda buscar ese profesor y eliminarlo.
	 * 
	 * @param objG
	 */
	private static void eliminarProfesor(clsGestor objGestor) {
		// TODO Auto-generated method stub

	}

	/**
	 * Este metodo se encarga de solicitar al usuario algun dato del profesor cuyos
	 * datos queremos consultar, de tal forma que a traves de un metodo de la clase
	 * clsGestor se pueda acceder a los datos de dicho profesor.
	 * 
	 * @param objG
	 */
	private static void consultarProfesor(clsGestor objGestor) {
		ArrayList<itfProperty> profesores;

		profesores = objGestor.consultaProfesores();

		for (itfProperty p : profesores) {

			System.out.println(p.getProperty(PROPIEDAD_PROFESOR_NOMBRE));
			System.out.println(p.getProperty(PROPIEDAD_PROFESOR_APELLIDO1));
			System.out.println(p.getProperty(PROPIEDAD_PROFESOR_APELLIDO2));
			System.out.println(p.getProperty(PROPIEDAD_PROFESOR_DIRECCION));
			System.out.println(p.getProperty(PROPIEDAD_PROFESOR_DNI));
			System.out.println("************************");
			System.out.println("");

		}

	}

	/**
	 * Este metodo se encarga de solicitar al usuario alg�n dato del profesor cuyos
	 * datos queremos modificar, de tal forma que a trav�s de un metodo de la clase
	 * clsGestor se pueda acceder a los datos de dicho profesor y modificar el dato
	 * que desee el usuario.
	 * 
	 * @param objG
	 */
	private static void modificarProfesor(clsGestor objGestor) {
		// TODO Auto-generated method stub

	}

	/**
	 * Este metodo se encarga de recoger los datos recogidos por el usuario y
	 * pasarselos a un objeto de la clase clsGestor para que utilizando el metodo de
	 * la clase clsGestor se pueda crear un nuevo profesor.
	 * 
	 * @param objG
	 * @throws clsProfesorRepetidoException
	 */
	private static void insertarProfesor(clsGestor objGestor) throws clsProfesorRepetidoException {

		System.out.println("Introduzca el nombre:");
		String nombre = utilidadesLP.leerCadena();

		System.out.println("Introduzca el primer apellido:");
		String apellido1 = utilidadesLP.leerCadena();

		System.out.println("Introduzca el segundo apellido:");
		String apellido2 = utilidadesLP.leerCadena();

		// Creamos un bucle do-while para controlar que el dni no tenga menos de 9
		// caracteres ni mas de 10

		String dni;
		do {

			System.out.println("Introduzca el DNI:");
			dni = utilidadesLP.leerCadena();

			if (dni.length() < 9 || dni.length() > 10)
				System.out.println("Introduzca un dni valido");
		} while (dni.length() < 9 || dni.length() > 10);

		System.out.println("Introduzca la direcci�n:");
		String direccion = utilidadesLP.leerCadena();

		try {

			objGestor.CrearProfesor(nombre, apellido1, apellido2, dni, direccion);

		} catch (clsProfesorRepetidoException e) {

			System.out.println(e.getMessage(dni));
		}
	}

	private static void visualizarTipoSocio(clsGestor objGestor) {

		ArrayList<itfProperty> tipoSocio;

		tipoSocio = objGestor.mostrarTipoSocio();

		for (itfProperty p : tipoSocio) {

			System.out.println(p.getProperty(PROPIEDAD_TIPO_SOCIO_ID) + " " + p.getProperty(PROPIEDAD_TIPO_SOCIO_NOMBRE)
					+ " " + p.getProperty(PROPIEDAD_TIPO_SOCIO_CUOTA));

			System.out.println("---------------------------------------------------");

		}
	}

	/**
	 * Este metodo se encarga de recoger los datos recogidos por el usuario y
	 * pasarselos a un objeto de la clase clsGestor para que utilizando el metodo de
	 * la clase clsGestor se pueda crear un nuevo socio.
	 * 
	 * @param objG
	 * @param
	 */
	private static void insertarSocio(clsGestor objGestor) {

		System.out.println("Introduzca el nombre:");
		String nombre = utilidadesLP.leerCadena();

		System.out.println("Introduzca el primer apellido:");
		String apellido1 = utilidadesLP.leerCadena();

		System.out.println("Introduzca el segundo apellido:");
		String apellido2 = utilidadesLP.leerCadena();

		// Creamos un bucle do-while para validar que el dni no tenga menos de 9
		// caracteres ni mas de 10

		String dni;
		do {

			System.out.println("Introduzca el DNI:");
			dni = utilidadesLP.leerCadena();

			if (dni.length() < 9 || dni.length() > 10)
				System.out.println("Introduzca un dni valido");
		} while (dni.length() < 9 || dni.length() > 10);

		System.out.println("Introduzca la direcci�n :");
		String direccion = utilidadesLP.leerCadena();

		System.out.println("Introduzca el codigo postal:");
		String codigoPostal = utilidadesLP.leerCadena();

		System.out.println("Introduzca la fecha de nacimiento(DD/MM/YYYY):");
		String fechaNacimiento = utilidadesLP.leerCadena();

		System.out.println("Introduzca el telefono:");
		String telefono = utilidadesLP.leerCadena();

		System.out.println("Introduzca la direccion de correo electronico:");
		String email = utilidadesLP.leerCadena();
		
		//Creamos un bucle do-while para validar que el IBAN introducido sea correcto
		
		String iban;
		int i;
		int contador = 0;
		
		do
		{
			System.out.println("Introduzca el IBAN de su cuenta bancaria:");
			iban = utilidadesLP.leerCadena();
			
			if(iban.length() != 24)
				System.out.println("El nº de IBAN debe tener 24 caracteres");
								
			else
			{
				
					
					for (i = 0; i <= 1; i++)
					
					{
						if(Character.isLetter(iban.charAt(i)) == false)
						contador++;
									
					}
					
					for(i = 2; i < iban.length(); i++)
						
					{
						if(Character.isLetter(iban.charAt(i)) == true)
						contador++;
				}
					if(contador != 0)
						System.out.println("El IBAN debe tener la siguiente estructura: XX0000000000000000000000");
					
			
												
		}
		}while(iban.length() <24 || contador != 0);
		
		

		// Creamos un bucle do-while para validar que el tipo de socio introducido sea
		// correcto
		int idtipo_socio;

		do {
			System.out.println("Introduzca el tipo de socio segun la tabla adjuntada:");

			visualizarTipoSocio(objGestor);

			idtipo_socio = utilidadesLP.leerEntero();

			if (idtipo_socio < 1 || idtipo_socio > 6)
				System.out.println("Introduzca un tipo de socio valido (1-6)");

		} while (idtipo_socio < 1 || idtipo_socio > 6);

		try {

			objGestor.CrearSocio(nombre, apellido1, apellido2, dni, direccion, codigoPostal, fechaNacimiento, telefono,
					email, iban, idtipo_socio);
		} catch (clsSocioRepetidoException e) {

			System.out.println(e.getMessage(dni));
		}
	}

	/**
	 * Este metodo se encarga de solicitar al usuario algun dato del socio cuyos
	 * datos queremos modificar, de tal forma que a traves de un metodo de la clase
	 * clsGestor se pueda acceder a los datos de dicho socio y modificar el dato que
	 * desee el usuario.
	 * 
	 * @param objG
	 */
	private static void modificarSocio(clsGestor objGestor) {

		// Pedimos al usuario el dni del socio que quiere modificar
		System.out.println("Introduzca el dni del socio que quiere modificar:");
		String dni = utilidadesLP.leerCadena();

		itfProperty p = null;
		try {
			p = objGestor.mostrarUnSocio(dni);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Mostramos al usuario los datos del socio que quiere modificar
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_NOMBRE));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO1));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO2));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_DIRECCION));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_DNI));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_CODIGO_POSTAL));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_FECHA_NACIMIENTO));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_TELEFONO));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_EMAIL));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_IBAN));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_IDTIPO_SOCIO));

	}

	/**
	 * Este metodo se encarga de mostrar todo el listado de socios que se encuentran
	 * actualmente en nuestra base de datos.
	 * 
	 * @param objGestor
	 */
	private static void consultarSocios(clsGestor objGestor) {

		ArrayList<itfProperty> socios = objGestor.consultaSocios();

		for (itfProperty p : socios) {

			System.out.println(p.getProperty(PROPIEDAD_SOCIO_NOMBRE));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO1));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO2));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_DIRECCION));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_DNI));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_CODIGO_POSTAL));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_FECHA_NACIMIENTO));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_TELEFONO));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_EMAIL));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_IBAN));
			System.out.println(p.getProperty(PROPIEDAD_SOCIO_IDTIPO_SOCIO));
			System.out.println("************************");
			System.out.println("");

		}
	}

	/**
	 * Este metodo se encarga de mostrar la tabla con los tipos de socio existentes
	 * 
	 * @param objG
	 */

	/**
	 * Este metodo se encarga de solicitar al usuario el dni del socio cuyos datos
	 * queremos eliminar, de tal forma que a traves de un metodo de la clase
	 * clsGestor se pueda buscar ese socio y eliminarlo.
	 * 
	 * @param objG
	 */
	private static void eliminarSocio(clsGestor objGestor) {
		// Pedimos al usuario el dni del socio que quiere eliminar
		System.out.println("Introduzca el dni del socio que quiere eliminar:");
		String dni = utilidadesLP.leerCadena();

		clsSocio p = null;
		try {
			p = objGestor.mostrarUnSocio(dni);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		// Mostramos al usuario los datos del socio que quiere modificar
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_NOMBRE));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO1));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_APELLIDO2));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_DIRECCION));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_DNI));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_CODIGO_POSTAL));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_FECHA_NACIMIENTO));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_TELEFONO));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_EMAIL));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_IBAN));
		System.out.println(p.getProperty(PROPIEDAD_SOCIO_IDTIPO_SOCIO));
		System.out.println("*******************");

		// Pedimos confirmacion de borrado al usuario
		System.out.println("¿Quiere eliminar este socio?(SI/NO):");
		String opcion = utilidadesLP.leerCadena();

		if (opcion.toUpperCase() == "SI")

			objGestor.borrarSocio(dni);

	}

	private static void reservar(clsGestor objGestor) {
		// TODO Auto-generated method stub

	}

	private static void consultarDisponibilidad() {
		// TODO Auto-generated method stub

	}

	private static void anularReserva() {
		// TODO Auto-generated method stub

	}

}
