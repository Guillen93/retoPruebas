package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

import ventanas.ventanaRegistro;

public class registroEvent implements ActionListener  {
	JTextField nombreField = ventanaRegistro.getNombreField();
	JTextField apellidoField = ventanaRegistro.getApellidoField();
	JTextField apellido2Field = ventanaRegistro.getApellido2Field();
	JTextField dniField = ventanaRegistro.getDniField();
	JCalendar calendarFechNac = ventanaRegistro.getCalendarFechNac();
	JComboBox<String> ClaseBox = ventanaRegistro.getClaseBox();

	@Override
	public void actionPerformed(ActionEvent e) {

		// if{

		// } else {
		// JOptionPane.showMessageDialog(null, "!! Porfavor introduce datos valido ¡¡ ",
		// "Error",
		// JOptionPane.WARNING_MESSAGE);
		// }

	}
}
