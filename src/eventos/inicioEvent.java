package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ventanas.nuevaPagina;

public class inicioEvent implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		nuevaPagina page = new nuevaPagina();
		page.setVisible(true);
		
	}

}
