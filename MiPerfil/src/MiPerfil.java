import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MiPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField CajaNombre;
	private JTextField CajaApellidos;
	private JTextField CajaEdad;
	private JTextField CajaEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
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
	public MiPerfil() {
		setTitle("Perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel EtiquetaNombre = new JLabel("Nombre");
		EtiquetaNombre.setBounds(10, 11, 70, 14);
		contentPane.add(EtiquetaNombre);
		
		CajaNombre = new JTextField();
		CajaNombre.setText("Andreu");
		CajaNombre.setBounds(10, 36, 200, 20);
		contentPane.add(CajaNombre);
		CajaNombre.setColumns(10);
		
		JLabel EtiquetaApellidos = new JLabel("Apellidos");
		EtiquetaApellidos.setBounds(10, 67, 70, 14);
		contentPane.add(EtiquetaApellidos);
		
		CajaApellidos = new JTextField();
		CajaApellidos.setText("Castell\u00F3 Canut");
		CajaApellidos.setBounds(10, 92, 200, 20);
		contentPane.add(CajaApellidos);
		CajaApellidos.setColumns(10);
		
		JLabel EtiquetaEdad = new JLabel("Edad");
		EtiquetaEdad.setBounds(10, 123, 70, 14);
		contentPane.add(EtiquetaEdad);
		
		CajaEdad = new JTextField();
		CajaEdad.setText("18");
		CajaEdad.setBounds(10, 148, 200, 20);
		contentPane.add(CajaEdad);
		CajaEdad.setColumns(10);
		
		JLabel EtiquetaEmail = new JLabel("Email");
		EtiquetaEmail.setBounds(10, 179, 70, 14);
		contentPane.add(EtiquetaEmail);
		
		CajaEmail = new JTextField();
		CajaEmail.setText("Andreucastello9lol@gmail.com");
		CajaEmail.setBounds(10, 204, 200, 20);
		contentPane.add(CajaEmail);
		CajaEmail.setColumns(10);
	}
}
