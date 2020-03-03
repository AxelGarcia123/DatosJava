package ventanaPrincipal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class EjemploEtiquetas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonOk;
	private JButton buttonCancelar;
	private JLabel lblEjemploDeEtiqueta;
	private JLabel lblVeracruz;
	private JLabel lblMorelia;
	private JLabel lblCancn;
	private JLabel lblGuadalajara;
	private JLabel lblSinaloa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EjemploEtiquetas dialog = new EjemploEtiquetas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EjemploEtiquetas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			lblEjemploDeEtiqueta = new JLabel("Ejemplo de etiqueta");
			lblEjemploDeEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			lblEjemploDeEtiqueta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			contentPanel.add(lblEjemploDeEtiqueta);
		}
		{
			lblVeracruz = new JLabel("1.- Veracruz");
			lblVeracruz.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
			contentPanel.add(lblVeracruz);
		}
		{
			lblMorelia = new JLabel("2.- Morelia");
			lblMorelia.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
			contentPanel.add(lblMorelia);
		}
		{
			lblCancn = new JLabel("3.- Cancún");
			lblCancn.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
			contentPanel.add(lblCancn);
		}
		{
			lblGuadalajara = new JLabel("4.- Guadalajara");
			lblGuadalajara.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
			contentPanel.add(lblGuadalajara);
		}
		{
			lblSinaloa = new JLabel("5.- Sinaloa");
			lblSinaloa.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
			contentPanel.add(lblSinaloa);
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
