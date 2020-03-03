package practicasClasePepe;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class PanelOpciones extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("Aceptar");
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		add(btnNewButton_2);

	}

}
