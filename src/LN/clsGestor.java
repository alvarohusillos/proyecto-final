package LN;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import COMPARADORES.clsComparadorNombreProfesor;
import COMPARADORES.clsComparadorNombreSocio;
import COMUN.itfProperty;
import EXCEPCIONES.clsProfesorRepetidoException;
import EXCEPCIONES.clsSocioRepetidoException;
import LD.clsDatos;
import LN.clsTipoSocio;
import LN.clsSocio;

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

import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_NOMBRE;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO1;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_APELLIDO2;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DIRECCION;
import static COMUN.clsConstantes.PROPIEDAD_PROFESOR_DNI;

/**
 * @author Industria 4.0
 * 
 *         Esta clase se encarga de hacer de intermediario entre la capa de
 *         presentacion y la capa de negocio Para ello, utilizara todos los
 *         metodos necesarios para realizar las funcionalidades del menu. En
 *         esta clase se implementan todos los metodos para insertar, modificar,
 *         eliminar, consultar socios, profesores, reservas Esta clase tambien
 *         es la unica que va a tener contacto con el gestor del paquete datos,
 *         pasandole los parametros necesarios para relacionarse con la base de
 *         datos, para insertar o para extraer informacion de la misma.
 */

public class clsGestor {

	private ArrayList<clsSocio> miListaSocios;
	private ArrayList<clsProfesor> miListaProfesores;
	private clsDatos objDatos;
	private clsSocio objSocio;
	private clsProfesor objProfesor;
	private HashSet<clsSocio> miListaSociosDiferentes;
	private HashSet<clsProfesor> miListaProfesoresDiferentes;

	public clsGestor() {
		miListaSocios = new ArrayList<clsSocio>();
		miListaProfesores = new ArrayList<clsProfesor>();
		objDatos = new clsDatos();
		miListaSociosDiferentes = new HashSet<clsSocio>();
		miListaProfesoresDiferentes = new HashSet<clsProfesor>();
	}

	/**
	 * Este metodo permite crear objetos de la clase clsSocio. Como parametros le
	 * pasamos todos los atributos de su clase padre clsUsuario y todos los
	 * atributos propios de la clase clsSocio. Estos valores se los pasamos como
	 * parametros porque seran introducidos por teclado por el usuario de la
	 * aplicacion.
	 * 
	 * @param _nombre          Nombre del Socio
	 * @param _apellido1       Primer apellido del socio
	 * @param _apellido2       Segundo apellido del socio
	 * @param _dni             DNI del socio
	 * @param _direccion       Direccion del socio
	 * @param _codigoPostal    Codigo Postal del socio
	 * @param _fechaNacimiento Fecha de namiciento del socio
	 * @param _telefono        Telefono del socio
	 * @param _email           Email del socio
	 * @param _iban            IBAN del socio
	 * @param _idtipo_socio    Tipo socio del socio
	 * 
	 *                         El metodo no tiene ningun retorno, simplemente a�ade
	 *                         un nuevo socio al ArrayList miLista
	 *                      
	 *  @throws clsSocioRepetidoException Puede producirse una excepcion si intentamos insertar un socio repetido
	 */
	
	public void CrearSocio(String _nombre, String _apellido1, String _apellido2, String _dni, String _direccion,
			String _codigoPostal, String _fechaNacimiento, String _telefono, String _email, String _iban,
			int _idtipo_socio) throws clsSocioRepetidoException {

		objSocio = new clsSocio(_nombre, _apellido1, _apellido2, _dni, _direccion, _codigoPostal, _fechaNacimiento,
				_telefono, _email, _iban, _idtipo_socio);

		objSocio.setNombre(_nombre);
		objSocio.setApellido1(_apellido1);
		objSocio.setApellido2(_apellido2);
		objSocio.setDni(_dni);
		objSocio.setDireccion(_direccion);
		objSocio.setCodigoPostal(_codigoPostal);
		objSocio.setFechaNacimiento(_fechaNacimiento);
		objSocio.setTelefono(_telefono);
		objSocio.setEmail(_email);
		objSocio.setIban(_iban);
		objSocio.setIdtipo_socio(_idtipo_socio);

		

		// Introducimos el objSocio en un HashSet para comprobar si ya existe en el
		// sistema. Si ya existe, lanzaremos una excepcion

		if (miListaSociosDiferentes.add(objSocio) == false) {
			throw new clsSocioRepetidoException();

			// Llamamos al metodo de la clase clsDatos, para poder insertar el socio creado
			// en la base de datos
		} else {
			objDatos.insertarSocio(_nombre, _apellido1, _apellido2, _dni, _direccion, _codigoPostal, _fechaNacimiento,
					_telefono, _email, _iban, _idtipo_socio);
			
			miListaSocios.add(objSocio);

		}

	}

	/**
	 * Este metodo permite crear objetos de la clase clsProfesor. Como parametros le
	 * pasamos todos los atributos de su clase padre clsUsuario y todos los
	 * atributos propios de la clase clsProfesor. Estos valores se los pasamos como
	 * parametros porque seran introducidos por teclado por el usuario de la
	 * aplicacion.
	 *
	 * @param _nombre    Nombre del Profesor
	 * @param _apellido1 Primer apellido del profesor
	 * @param _apellido2 Segundo apellido del profesor
	 * @param _dni       DNI del profesor
	 * @param _direccion Direccion del profesor
	 * 
	 *                   El metodo no tiene ningun retorno, simplemente añade un
	 *                   objeto profesor al ArrayList miLista
	 *                   
	 *  @throws clsProfesorRepetidoException Puede producirse una excepcion al introducir un profesor repetido
	 */

	
	public void CrearProfesor(String _nombre, String _apellido1, String _apellido2, String _dni, String _direccion)
			throws clsProfesorRepetidoException {

		objProfesor = new clsProfesor(_nombre, _apellido1, _apellido2, _dni, _direccion);

		objProfesor.setNombre(_nombre);
		objProfesor.setApellido1(_apellido1);
		objProfesor.setApellido2(_apellido2);
		objProfesor.setDni(_dni);
		objProfesor.setDireccion(_direccion);

		
		// Introducimos el objProfesor en un HashSet para comprobar si ya existe en el
		// sistema. Si ya existe, lanzaremos una excepcion

		if (miListaProfesoresDiferentes.add(objProfesor) == false) {
			throw new clsProfesorRepetidoException();

			// Llamamos al metodo de la clase clsDatos, para poder insertar el socio creado
			// en la base de datos

		} else {
			clsDatos objDatos = new clsDatos();
			miListaProfesores.add(objProfesor);

		}
		objDatos.insertarProfesor(_nombre, _apellido1, _apellido2, _dni, _direccion);
	}

	/**
	 * Este metodo permite recuperar los datos de un socio a partir del DNI que se
	 * le pasa como parametro.
	 *
	 * @param dni DNI del socio
	 * 
	 * @return Devuelve un objeto de tipo socio con los datos del socio recuperados
	 *         de la base de datos
	 * @throws SQLException
	 */
	public clsSocio mostrarUnSocio(String dni) throws SQLException {
		ResultSet miSocio = objDatos.recuperarUnSocio(dni);

		while (miSocio.next()) {
			objSocio.setNombre(miSocio.getString(PROPIEDAD_SOCIO_NOMBRE));
			objSocio.setApellido1(miSocio.getString(PROPIEDAD_SOCIO_APELLIDO1));
			objSocio.setApellido2(miSocio.getString(PROPIEDAD_SOCIO_APELLIDO2));
			objSocio.setDni(miSocio.getString(PROPIEDAD_SOCIO_DNI));
			objSocio.setDireccion(miSocio.getString(PROPIEDAD_SOCIO_DIRECCION));
			objSocio.setCodigoPostal(miSocio.getString(PROPIEDAD_SOCIO_CODIGO_POSTAL));
			objSocio.setFechaNacimiento(miSocio.getString(PROPIEDAD_SOCIO_FECHA_NACIMIENTO));
			objSocio.setTelefono(miSocio.getString(PROPIEDAD_SOCIO_TELEFONO));
			objSocio.setEmail(miSocio.getString(PROPIEDAD_SOCIO_EMAIL));
			objSocio.setIban(miSocio.getString(PROPIEDAD_SOCIO_IBAN));
			objSocio.setIdtipo_socio(miSocio.getInt(PROPIEDAD_SOCIO_IDTIPO_SOCIO));
		}

		return objSocio;
	}

	/**
	 * Con este metodo vamos a buscar un socio por su dni, que lo pasamos por
	 * parámetro, y eliminarlo.
	 * 
	 * @param dni DNI del socio
	 * 
	 *            No devuelve nada
	 */
	public void borrarSocio(String dni) 
	{
		//Con este for-each eliminamos el socio del ArrayList miListaSocios
		for(clsSocio a: miListaSocios)
			
			if(a.getDni() == dni)
				
				miListaSocios.remove(a);
		
		//Con este for-each eliminamos el socio del HashSet miListaSociosDiferentes
		for(clsSocio a: miListaSociosDiferentes)
			
			if(a.getDni() == dni)
				
				miListaSociosDiferentes.remove(a);
		
		//Finalmente eliminamos el socio de la BD
		objDatos.eliminarSocio(dni);
		
	}

	/**
	 * Este método crea un array con los socios que estén en la lista de usuarios,
	 * para luego poder mostrarlos por pantalla No hace falta pasarle ningún
	 * parámetro
	 * 
	 * @return retorno. Devuelve un ArrayList de objetos itfProperty que se llama
	 *         retorno.
	 */
	public ArrayList<itfProperty> consultaSocios() {

		ArrayList<itfProperty> retorno = null;

		ordenarSocios(miListaSocios);

		retorno = new ArrayList<itfProperty>(miListaSocios);

		return retorno;

	}

	/**
	 * El metodo se encarga de extraer la informacion de todos los socios de la base
	 * de datos y cargarla en el ArrayList de usuarios miLista, al inicio de la
	 * aplicacion.
	 * 
	 * No devuelve nada.
	 */
	public void cargaSocios() {

		ResultSet misSocios = objDatos.recuperarSocios();

		try {
			while (misSocios.next()) {
				objSocio = new clsSocio();

				objSocio.setNombre(misSocios.getString(PROPIEDAD_SOCIO_NOMBRE));
				objSocio.setApellido1(misSocios.getString(PROPIEDAD_SOCIO_APELLIDO1));
				objSocio.setApellido2(misSocios.getString(PROPIEDAD_SOCIO_APELLIDO2));
				objSocio.setDni(misSocios.getString(PROPIEDAD_SOCIO_DNI));
				objSocio.setDireccion(misSocios.getString(PROPIEDAD_SOCIO_DIRECCION));
				objSocio.setCodigoPostal(misSocios.getString(PROPIEDAD_SOCIO_CODIGO_POSTAL));
				objSocio.setFechaNacimiento(misSocios.getString(PROPIEDAD_SOCIO_FECHA_NACIMIENTO));
				objSocio.setTelefono(misSocios.getString(PROPIEDAD_SOCIO_TELEFONO));
				objSocio.setEmail(misSocios.getString(PROPIEDAD_SOCIO_EMAIL));
				objSocio.setIban(misSocios.getString(PROPIEDAD_SOCIO_IBAN));
				objSocio.setIdtipo_socio(misSocios.getInt(PROPIEDAD_SOCIO_IDTIPO_SOCIO));

				miListaSocios.add(objSocio);
				miListaSociosDiferentes.add(objSocio);

			}

		} catch (SQLException e) {
			System.out.println("No se ha podido realizar la consulta: " + e);
		}

	}

	/**
	 * Este método crea un array con los socios que estén en la lista de usuarios,
	 * para luego poder mostrarlos por pantalla No hace falta pasarle ningún
	 * parámetro
	 * 
	 * @return retorno. Devuelve un ArrayList de objetos itfProperty que se llama
	 *         retorno.
	 */
	public ArrayList<itfProperty> consultaProfesores() {

		ArrayList<itfProperty> retorno = null;

		ordenarProfesores(miListaProfesores);

		retorno = new ArrayList<itfProperty>(miListaProfesores);

		return retorno;

	}

	/**
	 * El metodo se encarga de extraer la informacion de todos los profesores de la
	 * base de datos y cargarla en el ArrayList de usuarios miLista, al inicio de la
	 * aplicacion.
	 * 
	 * No devuelve nada.
	 */
	public void cargaProfesores() {

		ResultSet misProfesores = objDatos.recuperarProfesores();

		try {
			while (misProfesores.next()) {
				objProfesor = new clsProfesor();

				objProfesor.setNombre(misProfesores.getString("Nombre"));
				objProfesor.setApellido1(misProfesores.getString("Apellido1"));
				objProfesor.setApellido2(misProfesores.getString("Apellido2"));
				objProfesor.setDni(misProfesores.getString("DNI"));
				objProfesor.setDireccion(misProfesores.getString("Direccion"));

				miListaProfesores.add(objProfesor);
				miListaProfesoresDiferentes.add(objProfesor);

			}

		} catch (SQLException e) {
			System.out.println("No se ha podido realizar la consulta: " + e);
		}

	}

	public ArrayList<itfProperty> mostrarTipoSocio() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();

		ResultSet miTipoSocio = objDatos.mostrarTipoSocio();

		try {
			while (miTipoSocio.next()) {
				clsTipoSocio objTipoSocio = new clsTipoSocio();

				objTipoSocio.setIdTipo_Socio(miTipoSocio.getInt("idTipo_Socio"));
				objTipoSocio.setNombre(miTipoSocio.getString("Nombre"));
				objTipoSocio.setDescripcion(miTipoSocio.getString("Descripcion"));
				objTipoSocio.setCuota(miTipoSocio.getDouble("cuota"));

				retorno.add(objTipoSocio);
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido realizar la consulta: " + e);
		}

		return retorno;
	}

	/**
	 * Este metodo sirve para ordenar los objetos de un ArrayList utilizando como
	 * criterio de ordenacion la primera letra del Nombre
	 * 
	 * @param p Es el ArrayList que queremos ordenar
	 * 
	 * @return p Devuelvo el ArrayList que hemos pasado por parametro pero ordenado
	 */
	public ArrayList<clsSocio> ordenarSocios(ArrayList<clsSocio> p) {

		clsComparadorNombreSocio comp = new clsComparadorNombreSocio();
		Collections.sort(p, comp);

		return p;
	}

	/**
	 * Este metodo sirve para ordenar los objetos de un ArrayList utilizando como
	 * criterio de ordenacion la primera letra del Nombre
	 * 
	 * @param p Es el ArrayList que queremos ordenar
	 */
	public void ordenarProfesores(ArrayList<clsProfesor> p) {

		clsComparadorNombreProfesor comp = new clsComparadorNombreProfesor();
		Collections.sort(p, comp);

	}
}
