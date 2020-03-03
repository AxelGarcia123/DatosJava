package ventanaPrincipal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class LateralMenu extends JPanel {
	private JButton buttonEtiqueta;
	private JButton buttonCaja;
	private JButton buttonBoton;
	private JButton buttonRadio;
	private JButton buttonCheckBox;

	/**
	 * Create the panel.
	 */
	public LateralMenu() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(6, 1, 0, 90));
		
		JLabel lblMenPrincipal = new JLabel("Menú Principal");
		lblMenPrincipal.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 19));
		lblMenPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMenPrincipal);
		
		buttonEtiqueta = new JButton("Etiquetas");
		buttonEtiqueta.setBorderPainted(false);
		buttonEtiqueta.setForeground(Color.WHITE);
		buttonEtiqueta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		buttonEtiqueta.setBackground(new Color(0, 112, 192));
		buttonEtiqueta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonEtiqueta);
		
		buttonCaja = new JButton("Cajas");
		buttonCaja.setBorderPainted(false);
		buttonCaja.setForeground(Color.WHITE);
		buttonCaja.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		buttonCaja.setBackground(new Color(0, 112, 192));
		buttonCaja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonCaja);
		
		buttonBoton = new JButton("Botones");
		buttonBoton.setBorderPainted(false);
		buttonBoton.setForeground(Color.WHITE);
		buttonBoton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		buttonBoton.setBackground(new Color(0, 112, 192));
		buttonBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonBoton);
		
		buttonRadio = new JButton("Radios");
		buttonRadio.setBorderPainted(false);
		buttonRadio.setForeground(Color.WHITE);
		buttonRadio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		buttonRadio.setBackground(new Color(0, 112, 192));
		buttonRadio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonRadio);
		
		buttonCheckBox = new JButton("CheckBox");
		buttonCheckBox.setBorderPainted(false);
		buttonCheckBox.setForeground(Color.WHITE);
		buttonCheckBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		buttonCheckBox.setBackground(new Color(0, 112, 192));
		buttonCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(buttonCheckBox);

	}

	public JButton getBotonEtiqueta() {
		return buttonEtiqueta;
	}
	
	public JButton getBotonCaja() {
		return buttonCaja;
	}
	
	public JButton getBotonBoton() {
		return buttonBoton;
	}
	
	public JButton getBotonRadio() {
		return buttonRadio;
	}
	
	public JButton getBotonCheckBox() {
		return buttonCheckBox;
	}
}
