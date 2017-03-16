package Principal;

import Ventanas.Juego;
import Ventanas.Login;
import Ventanas.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		//Ventanas a utilizar
		//Ventana del Juego
		VentanaPrincipal vJuego=new VentanaPrincipal();
		
		//Generamos la ventana de Login
		Login login=new Login(vJuego);
		login.setVisible(true);
		
		
	}
	
	
	
}
