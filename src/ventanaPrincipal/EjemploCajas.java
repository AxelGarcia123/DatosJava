package ventanaPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EjemploCajas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonOk;
	private JButton buttonCancelar;
	private JLabel lblNombre;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
	public EjemploCajas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(3, 2, 0, 0));
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			contentPanel.add(lblNombre);
		}
		{
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			lblApellidoPaterno = new JLabel("Apellido paterno");
			lblApellidoPaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			contentPanel.add(lblApellidoPaterno);
		}
		{
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblApellidoMaterno = new JLabel("Apellido materno");
			lblApellidoMaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			contentPanel.add(lblApellidoMaterno);
		}
		{
			textField_2 = new JTextField();
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
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
