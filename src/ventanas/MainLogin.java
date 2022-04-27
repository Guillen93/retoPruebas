package ventanas;

import javax.swing.JOptionPane;

public class MainLogin {
	public static void main(String[] args) {

		// Las ventanas se suelen inicializar así:
		// 1) Creas la clase
		// 2) El constructor hace su trabajo colocando los botones y tal
		// 3) Haces visible la ventana
		try {
			ventanaLogin login = new ventanaLogin();
			
			login.setVisible(true);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
