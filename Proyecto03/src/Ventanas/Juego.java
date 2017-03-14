package Ventanas;
import Juego.Jugador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;

public class Juego extends JFrame {

	private JPanel contentPane;
	private Jugador player1;
	private JLabel Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nombre = new JLabel("New label");
		Nombre.setBounds(30, 11, 394, 43);
		contentPane.add(Nombre);
		
	}
	//Añadir el nombre de la ventana 1 a las ventana 2
	public void setJugador(Jugador player1){
		this.player1=player1;
		Nombre.setText("Hola " + player1.getNombre()+" "+ player1.getPrimerApellido()+" " + player1.getSegundoApellido()+ " bienvenido al juego." );


	}


	
}
