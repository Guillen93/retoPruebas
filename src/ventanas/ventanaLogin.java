package ventanas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import eventos.BotonSumit;
import eventos.goRegistroEvent;
import eventos.inicioEvent;

public class ventanaLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String FICHERO = "login.txt";
	public static final String RUTA = "c://trastero//";

	private JPanel jPanel = null;
	JButton botonSumit,botonRegistro,botonInicio;
	JLabel userLabel, passLabel;
	static JTextField textField1;
	static JTextField textField2;
	
	
	public ventanaLogin() {
		
		crearArchivo();

		

		// Los constructores son enormes... tienen que crear la ventana,
		// los diferentes elementos de la ventana, e insertarlos todos
		// juntos
		// creamos el fomulario de usuario
		userLabel = new JLabel();
		userLabel.setText("USUARIO");

		textField1 = new JTextField(10);
		// creamos el fomulario de usuario
		passLabel = new JLabel();
		passLabel.setText("CONTRASEÑA");

		textField2 = new JPasswordField(10);
		// CREAMOS EL BOTON
		botonInicio = new JButton("Inicio");
		botonSumit = new JButton("Login");
		botonRegistro = new JButton("Registrarse");
		// Detalles de la ventana
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);

		// La 'superficie' donde vamos a ir metiendo los botones, etc.
		// Se la añadimos a la ventana
	
		jPanel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel

		constraints.gridx = 0;
		constraints.gridy = 0;
		jPanel.add(userLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(textField1, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		jPanel.add(passLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(textField2, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		//constraints.gridwidth = 9;
		//constraints.gridheight = 2;
		//constraints.anchor = GridBagConstraints.CENTER;
		jPanel.add(botonSumit, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		//constraints.gridwidth = 2;
		//constraints.anchor = GridBagConstraints.CENTER;
		jPanel.add(botonRegistro, constraints);

		constraints.gridx = 2;
		constraints.gridy = 3;
		//constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		jPanel.add(botonInicio, constraints);
		
		// set border for the panel
		jPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

		// add the panel to this frame
		add(jPanel);

		pack();
		setLocationRelativeTo(null);
		BotonSumit login=new BotonSumit();
		botonSumit.setActionCommand("OK");
		botonSumit.addActionListener(login) ;
		
		inicioEvent goInicio=new inicioEvent();
		botonInicio.setActionCommand("OK");
		botonInicio.addActionListener(goInicio) ;
		
		goRegistroEvent goRegistro=new goRegistroEvent();
		botonRegistro.setActionCommand("OK");
		botonRegistro.addActionListener(goRegistro) ;
	}

	

	public static JTextField getTextField1() {
		return textField1;
	}

	public static JTextField getTextField2() {
		return textField2;
	}
	
	public static void crearArchivo() {
		try {
			String ruta = RUTA + FICHERO;
			File file = new File(ruta);
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void resetearDatosLogin() {
		//TODO
	}
	public static void comprobarLogin() {
		//TODO
	}
}
