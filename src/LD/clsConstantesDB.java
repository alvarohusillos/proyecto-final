package LD;

public class clsConstantesDB {

	public static final String SQL_INSERT_SOCIO = "INSERT INTO GestionBakh.SOCIO (nombre, apellido1, apellido2, dni, direccion, "
			+ " codigo_postal, fecha_nacimiento, telefono, email, iban, idtipo_socio) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String SQL_SELECT_SOCIO = "SELECT * FROM GestionBakh.SOCIO WHERE dni = ?";
	
	public static final String SQL_SELECT_SOCIOS = "SELECT * FROM GestionBakh.SOCIO ";
	
	public static final String SQL_SELECT_PROFESORES = "SELECT * FROM GestionBakh.PROFESOR ";
	
	public static final String SQL_SELECT_TIPO_SOCIO = "SELECT * FROM GestionBakh.TIPO_SOCIO ";
	
	public static final String SQL_INSERT_PROFESOR = "INSERT INTO GestionBakh.profesor (nombre, apellido1, apellido2, dni, direccion) "
			+ "values (?, ?, ?, ?, ?)";
	
	public static final String SQL_DELETE_SOCIO = "DELETE * FROM GestionBakh.SOCIO WHERE dni = ?";
	
	//Constantes para la conexion a base de datos
	public static final String TIME = "?useTimezone=true&serverTimezone=GMT";
	public static final String SSL = "&useSSL=false";
	public static final String URL = "jdbc:mysql://localhost:3306/GestionBakh" + TIME + SSL;
	public static final String USER = "root";
	public static final String PASSWORD = "";
	
	
	public static final String PROPIEDAD_SOCIO_NOMBRE = "NOMBRE";
	public static final String PROPIEDAD_SOCIO_APELLIDO1 = "APELLIDO1";
	public static final String PROPIEDAD_SOCIO_APELLIDO2 = "APELLIDO2";
	public static final String PROPIEDAD_SOCIO_DIRECCION = "DIRECCION";
	public static final String PROPIEDAD_SOCIO_DNI = "DNI";
	public static final String PROPIEDAD_SOCIO_CODIGO_POSTAL = "CODIGO_POSTAL";
	public static final String PROPIEDAD_SOCIO_TELEFONO = "TELEFONO";
	public static final String PROPIEDAD_SOCIO_EMAIL = "EMAIL";
	public static final String PROPIEDAD_SOCIO_FECHA_NACIMIENTO = "FECHA_NACIMIENTO";
	public static final String PROPIEDAD_SOCIO_IBAN = "IBAN";
}
