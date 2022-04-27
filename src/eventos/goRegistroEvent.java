package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ventanas.ventanaRegistro;

public class goRegistroEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ventanaRegistro registro = new ventanaRegistro();
		registro.setVisible(true);
		
	}

}
