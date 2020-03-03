package ventanaPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;

public class EjemploRadios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonOk;
	private JButton buttonCancelar;
	private JPanel panel;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFemenino;
	private JPanel panel_1;
	private JRadioButton rdbtnCasado;
	private JRadioButton rdbtnSoltero;
	private JPanel panel_2;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EjemploCajas dialog = new EjemploCajas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EjemploRadios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(3, 2, 0, 0));
		ButtonGroup grupo = new ButtonGroup();
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBorder(new TitledBorder(null, "G\u00E9nero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			{
				rdbtnMasculino = new JRadioButton("Masculino");
				panel.add(rdbtnMasculino);
				grupo.add(rdbtnMasculino);
			}
			{
				rdbtnFemenino = new JRadioButton("Femenino");
				panel.add(rdbtnFemenino);
				grupo.add(rdbtnFemenino);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Estado civil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBackground(Color.WHITE);
			contentPanel.add(panel_1);
			{
				rdbtnCasado = new JRadioButton("Casado");
				panel_1.add(rdbtnCasado);
				grupo1.add(rdbtnCasado);
			}
			{
				rdbtnSoltero = new JRadioButton("Soltero");
				panel_1.add(rdbtnSoltero);
				grupo1.add(rdbtnSoltero);
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Edad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBackground(Color.WHITE);
			contentPanel.add(panel_2);
			{
				radioButton = new JRadioButton("+18");
				panel_2.add(radioButton);
				grupo2.add(radioButton);
			}
			{
				radioButton_1 = new JRadioButton("-18");
				panel_2.add(radioButton_1);
				grupo2.add(radioButton_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonOk = new JButton("OK");
				buttonOk.setBorderPainted(false);
				buttonOk.setBackground(new Color(0, 112, 192));
				buttonOk.setForeground(Color.WHITE);
				buttonOk.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
				buttonOk.setActionCommand("OK");
				buttonPane.add(buttonOk);
				getRootPane().setDefaultButton(buttonOk);
			}
			{
				buttonCancelar = new JButton("Cancel");
				buttonCancelar.setBorderPainted(false);
				buttonCancelar.setBackground(new Color(0, 112, 192));
				buttonCancelar.setForeground(Color.WHITE);
				buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
				buttonCancelar.setActionCommand("Cancel");
				buttonPane.add(buttonCancelar);
			}
		}
	}

	public JButton getBotonOk() {
		return buttonOk;
	}
	
	public JButton getBotonCancelar() {
		return buttonCancelar;
	}
}
