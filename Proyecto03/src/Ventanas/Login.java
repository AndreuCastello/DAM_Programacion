package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField CuadroParaNombre;
	private JTextField CuadroParaPrimerApellido;
	private JTextField CuadroParaSegundoApellido;
	private JTextField CuadroParaEdad;
	private JTextField CuadroParaMostrarJugador;
	private Juego v2;
	private Login referencia;
	// Generamos nuevo jugador
	Jugador player1 = new Jugador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		//Estamos indicando que referencia es esta ventana
		referencia=this;
		// Datos del jugador
		player1.setNombre("");
		player1.setPrimerApellido("");
		player1.setSegundoApellido("");
		player1.setEdad(999);
		player1.setId(0);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiqueta Nombre
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setForeground(Color.BLACK);
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Nombre.setBounds(10, 57, 90, 20);
		contentPane.add(Nombre);

		// Etiqueta Primer Apellido
		JLabel PrimerApellido = new JLabel("Primer Apellido");
		PrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 22));
		PrimerApellido.setBounds(10, 105, 150, 27);
		contentPane.add(PrimerApellido);

		// Etiqueta Segundo Apellido
		JLabel SegundoApellido = new JLabel("Segundo Apellido");
		SegundoApellido.setFont(new Font("Tahoma", Font.PLAIN, 22));
		SegundoApellido.setBounds(10, 163, 175, 32);
		contentPane.add(SegundoApellido);

		// Etiqueta Edad
		JLabel Edad = new JLabel("Edad");
		Edad.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Edad.setBounds(10, 232, 90, 20);
		contentPane.add(Edad);

		// Campo de texto para poner el Nombre
		CuadroParaNombre = new JTextField();
		CuadroParaNombre.setBounds(195, 57, 259, 20);
		contentPane.add(CuadroParaNombre);
		CuadroParaNombre.setColumns(10);

		// Campo de texto para poner el Primer Apellido
		CuadroParaPrimerApellido = new JTextField();
		CuadroParaPrimerApellido.setBounds(195, 113, 259, 20);
		contentPane.add(CuadroParaPrimerApellido);
		CuadroParaPrimerApellido.setColumns(10);

		// Campo de texto para poner el Segundo Apellido
		CuadroParaSegundoApellido = new JTextField();
		CuadroParaSegundoApellido.setBounds(195, 174, 259, 20);
		contentPane.add(CuadroParaSegundoApellido);
		CuadroParaSegundoApellido.setColumns(10);

		// Campo de texto para poner la Edad
		CuadroParaEdad = new JTextField();
		CuadroParaEdad.setBounds(195, 237, 259, 20);
		contentPane.add(CuadroParaEdad);
		CuadroParaEdad.setColumns(10);

		// Cuadro Para comentario y para mostrar resultados
		CuadroParaMostrarJugador = new JTextField();
		CuadroParaMostrarJugador.setBounds(10, 323, 444, 77);
		contentPane.add(CuadroParaMostrarJugador);
		CuadroParaMostrarJugador.setColumns(10);

		// Titulo
		JLabel TituloDatosJugador = new JLabel("DATOS JUGADOR");
		TituloDatosJugador.setForeground(Color.BLACK);
		TituloDatosJugador.setFont(new Font("Tahoma", Font.PLAIN, 24));
		TituloDatosJugador.setBounds(134, 11, 208, 35);
		contentPane.add(TituloDatosJugador);

		// Boton Jugar
		JButton botonJugar = new JButton("JUGAR");
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setNombre(CuadroParaNombre.getText());
				player1.setPrimerApellido(CuadroParaPrimerApellido.getText());
				player1.setSegundoApellido(CuadroParaSegundoApellido.getText());
				// Comprobar si el dato que ha introducido es un numero
				if (player1.isNumeric(CuadroParaEdad.getText()) == true)
					player1.setEdad(Integer.parseInt(CuadroParaEdad.getText()));
				else
					player1.setEdad(999);
				// Al pulsar el boton mostrara el resultado por el
				// cuadroParaMostrarJugador
				if (player1.getEdad() == 999)
					CuadroParaMostrarJugador.setText("Edad incorrecta");
				else if (player1.sonEspacios(player1.getNombre()))
					CuadroParaMostrarJugador.setText("Falta el Nombre");
				else if (player1.sonEspacios(player1.getPrimerApellido()))
					CuadroParaMostrarJugador.setText("Falta el Primer Apellido");
				else if (player1.sonEspacios(player1.getSegundoApellido()))
					CuadroParaMostrarJugador.setText("Falta el Segundo Apellido");
				else
					CuadroParaMostrarJugador
							.setText("Nuevo Jugador: " + player1.getNombre() + " " + player1.getPrimerApellido() + " "
									+ player1.getSegundoApellido() + " de " + player1.getEdad() + " años");
				
				v2.setJugador(player1);
				//Poner visible la siguiente venatana
				v2.setVisible(true);
				referencia.setVisible(false);
			}
		});

		botonJugar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		botonJugar.setBounds(10, 283, 444, 27);
		contentPane.add(botonJugar);
		
		//Mostrar la otra ventana
		v2=new Juego();
	}
}