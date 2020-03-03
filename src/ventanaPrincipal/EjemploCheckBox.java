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
import javax.swing.JCheckBox;

public class EjemploCheckBox extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonOk;
	private JButton buttonCancelar;
	private JCheckBox chckbxAxel;
	private JLabel lblLoremIpsumDolor;

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
	public EjemploCheckBox() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(2, 2, 0, 0));
		{
			lblLoremIpsumDolor = new JLabel("<html><body>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Laborum nemo quam, ipsam vitae porro itaque veniam voluptatum optio earum sequi, maxime, illo et beatae reprehenderit sapiente magni amet ipsa cumque.</body></html>");
			contentPanel.add(lblLoremIpsumDolor);
		}
		{
			chckbxAxel = new JCheckBox("¿Acepta los términos y condiciones?");
			chckbxAxel.setBackground(Color.WHITE);
			contentPanel.add(chckbxAxel);
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