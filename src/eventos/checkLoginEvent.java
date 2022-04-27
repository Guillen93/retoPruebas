package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ventanas.nuevaPagina;
import ventanas.ventanaLogin;

public class checkLoginEvent implements ActionListener {
	
	
	JTextField textField1 = ventanaLogin.getTextField1();
	JTextField textField2 = ventanaLogin.getTextField2();
	
	String user = "admin";
	String pass = "admin";

	@Override
	public void actionPerformed(ActionEvent e) {

		String userValue = (textField1.getText()).toLowerCase();
		String passValue = (textField2.getText()).toLowerCase();
		
		if ((userValue.equals(user)) && (passValue.equals(pass))) {
			insertOrder(userValue,passValue);
			
			
			
			nuevaPagina page = new nuevaPagina();
			page.setVisible(true);
			
			JLabel wel_label = new JLabel("Welcome: " + userValue);
			page.getContentPane().add(wel_label);

		} else {
			JOptionPane.showMessageDialog(null, "!! Porfavor introduce un usuario y contraseña valido ¡¡ ", "Error",
					JOptionPane.WARNING_MESSAGE);
		}

	}
	private void insertOrder(String user,String pass) {

		// System.out.println("Vamos a escribir en el fichero " + FICHERO + " en la ruta
		// " + RUTA);

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			
			fileWriter = new FileWriter(ventanaLogin.RUTA + ventanaLogin.FICHERO, true);

			printWriter = new PrintWriter(fileWriter);

			// Lo mandamos al fichero
			printWriter.println("el usuario es :" + user + "             ");


			// Lo mandamos al fichero
			printWriter.println("la contraseña es :" + pass + "             ");

		} catch (IOException e) {
			System.out.println("IOException - Error de escritura en el fichero " + ventanaLogin.RUTA + ventanaLogin.FICHERO);
		} finally {
			printWriter.close();
			try {
				fileWriter.close();
			} catch (IOException e) {
				// Nos da igual
			}
		}

	}
	
}
