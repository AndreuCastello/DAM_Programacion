import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Texto extends JFrame {

	private JPanel contentPane;
	private JTextField CampoDeTextoIzquierda;
	private JTextField CampoDeTextoDerecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Texto frame = new Texto();
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
	public Texto() {
		setTitle("Intercambio De Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		CampoDeTextoIzquierda = new JTextField();
		CampoDeTextoIzquierda.setBounds(10, 109, 135, 29);
		contentPane.add(CampoDeTextoIzquierda);
		CampoDeTextoIzquierda.setColumns(10);
		
		CampoDeTextoDerecha = new JTextField();
		CampoDeTextoDerecha.setColumns(10);
		CampoDeTextoDerecha.setBounds(289, 109, 135, 29);
		contentPane.add(CampoDeTextoDerecha);
		
		JButton BotonPasarDerecha = new JButton("     ----->");
		BotonPasarDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampoDeTextoDerecha.setText(CampoDeTextoIzquierda.getText());
				CampoDeTextoIzquierda.setText("");
			}
		});
		BotonPasarDerecha.setBounds(170, 24, 89, 23);
		contentPane.add(BotonPasarDerecha);
		
		JButton BotonPasarIzquierda = new JButton("<-----   ");
		BotonPasarIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CampoDeTextoIzquierda.setText(CampoDeTextoDerecha.getText());
				CampoDeTextoDerecha.setText("");
			}
		});
		BotonPasarIzquierda.setBounds(170, 195, 89, 23);
		contentPane.add(BotonPasarIzquierda);
	}
}
