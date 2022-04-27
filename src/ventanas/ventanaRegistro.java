package ventanas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

import eventos.goRegistroEvent;

public class ventanaRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	public static String FICHERO = "alumno.txt";
	public static final String RUTA = "c://trastero//";

	private static JComboBox<String> CargoBox;
	private JPanel jPanel = null;
	private static JCalendar calendarFechNac;

	JButton botonLogin, botonRegistro, BotonInicio;
	JLabel nomLabel, apellidoLabel, apellido2Label, dniLabel, passwd1Label, passwd2Label, fechLabel, cargoLabel;
	static JTextField nombreField;
	static JTextField apellidoField;
	static JTextField apellido2Field;
	static JTextField dniField;
	static JTextField passwd1Field;
	static JTextField passwd2Field;

	public ventanaRegistro() {

		createIfNotExist();

		// Los constructores son enormes... tienen que crear la ventana,
		// los diferentes elementos de la ventana, e insertarlos todos
		// juntos
		// creamos el nombre en fomulario
		nomLabel = new JLabel();
		nombreField = new JTextField(15);
		nomLabel.setText("NOMBRE");

		// creamos el 1ºapellido en fomulario
		apellidoLabel = new JLabel();
		apellidoField = new JTextField(15);
		apellidoLabel.setText("PRIMER APELLIDO");

		// creamos el 2ºapellido en fomulario
		apellido2Label = new JLabel();
		apellido2Field = new JTextField(15);
		apellido2Label.setText("SEGUNDO APELLIDO");

		// creamos el dni en fomulario
		dniLabel = new JLabel();
		dniField = new JTextField(15);
		dniLabel.setText("DOCUMENTO DE IDENTIDAD");

		// creamos LA CONTRASEÑA en fomulario
		passwd1Label = new JLabel();
		passwd1Field = new JTextField(15);
		passwd1Label.setText("CONTRASEÑA");

		// creamos REPETIR LA CONTRASEÑA en fomulario
		passwd2Label = new JLabel();
		passwd2Field = new JTextField(15);
		passwd2Label.setText("REPETIR CONTRASEÑA");

		// añadimos calendario para la fech nacimiento
		fechLabel = new JLabel();
		calendarFechNac = new JCalendar();
		fechLabel.setText("FECHA NACIMIENTO");

		// creamos el combobox en formulario
		cargoLabel = new JLabel();
		cargoLabel.setText("CLASE");
		CargoBox = new JComboBox<String>();
		CargoBox.addItem("               EMPLEADO                   ");
		CargoBox.addItem("               DIRECTOR PROVINCIAL        ");
		CargoBox.addItem("               DIRECTOR ESTATAL           ");

		// CREAMOS EL BOTON
		botonRegistro = new JButton("REGISTRAR");

		// Detalles de la ventana

		setTitle("REGISTRO DE USUARIO");
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
		jPanel.add(nomLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(nombreField, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		jPanel.add(apellidoLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(apellidoField, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		jPanel.add(apellido2Label, constraints);
		constraints.gridx = 1;
		jPanel.add(apellido2Field, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		jPanel.add(fechLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(calendarFechNac, constraints);

		constraints.gridx = 0;
		constraints.gridy = 4;
		jPanel.add(dniLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(dniField, constraints);

		constraints.gridx = 0;
		constraints.gridy = 5;
		jPanel.add(claseLabel, constraints);
		constraints.gridx = 1;
		jPanel.add(ClaseBox, constraints);

		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		jPanel.add(botonRegistro, constraints);

		// set border for the panel
		jPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "REGISTRO"));

		// add the panel to this frame
		add(jPanel);

		pack();
		setLocationRelativeTo(null);
		goRegistroEvent registro = new goRegistroEvent();
		botonRegistro.setActionCommand("OK");
		botonRegistro.addActionListener(registro);

	}

	/**
	 * creates the File if it does not exist on the file path. if exist does not
	 * nothing
	 */
	public static void createIfNotExist() {
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

	public JLabel getApellidoLabel() {
		return apellidoLabel;
	}

	public void setApellidoLabel(JLabel apellidoLabel) {
		this.apellidoLabel = apellidoLabel;
	}

	public JLabel getApellido2Label() {
		return apellido2Label;
	}

	public void setApellido2Label(JLabel apellido2Label) {
		this.apellido2Label = apellido2Label;
	}

	public static JTextField getNombreField() {
		return nombreField;
	}

	public static void setNombreField(JTextField nombreField) {
		ventanaRegistro.nombreField = nombreField;
	}

	public static JTextField getApellidoField() {
		return apellidoField;
	}

	public static void setApellidoField(JTextField apellidoField) {
		ventanaRegistro.apellidoField = apellidoField;
	}

	public static JTextField getApellido2Field() {
		return apellido2Field;
	}

	public static void setApellido2Field(JTextField apellido2Field) {
		ventanaRegistro.apellido2Field = apellido2Field;
	}

	public static JTextField getDniField() {
		return dniField;
	}

	public static void setDniField(JTextField dniField) {
		ventanaRegistro.dniField = dniField;
	}

	public static JComboBox<String> getClaseBox() {
		return ClaseBox;
	}

	public void setClaseBox(JComboBox<String> claseBox) {
		ClaseBox = claseBox;
	}

	public static JCalendar getCalendarFechNac() {
		return calendarFechNac;
	}

	public void setCalendarFechNac(JCalendar calendarFechNac) {
		ventanaRegistro.calendarFechNac = calendarFechNac;
	}

}
