package practicasClasePepe;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelCaptura extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public PanelCaptura() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(6, 4, 0, 0));
		
		JLabel lblCurp = new JLabel("Curp:");
		add(lblCurp);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		add(lblNombre);
		
		textField_1 = new JTextField();
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		add(lblApellidoPaterno);
		
		textField_2 = new JTextField();
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		add(lblApellidoMaterno);
		
		textField_3 = new JTextField();
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		add(lblFechaDeNacimiento);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "G\u00E9nero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel);
		
		ButtonGroup grupo = new ButtonGroup();
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		panel.add(rdbtnMasculino);
		grupo.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		panel.add(rdbtnFemenino);
		grupo.add(rdbtnFemenino);

	}

}
