import EXCEPCIONES.clsProfesorRepetidoException;
import LN.clsGestor;
import LP.clsMenu;

public class clsMain {

	public static void main(String[] args)  {
		
		//Realizamos la carga inicial de todos los datos de MySql
		
		clsGestor objGestor = new clsGestor ();
		
		objGestor.cargaSocios();
		objGestor.cargaProfesores();
		
		clsMenu objMenu;
		
		objMenu = new clsMenu();
		
		try {
			clsMenu.MenuPrincipal(objGestor);
		} catch (clsProfesorRepetidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//Hola
	
}