package practicasClasePepe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class CapturaClientes extends JFrame {

	private JPanel contentPane;
	private JPanel panelEncabezado;
	private JLabel textoEncabezado;
	private PanelCaptura panelCaptura;
	private PanelOpciones panelOpciones;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CapturaClientes frame = new CapturaClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CapturaClientes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelEncabezado = new JPanel();
		panelEncabezado.setBackground(Color.WHITE);
		contentPane.add(panelEncabezado, BorderLayout.NORTH);
		
		textoEncabezado = new JLabel("Captura de datos personales de clientes");
		panelEncabezado.add(textoEncabezado);
		
		panelCaptura = new PanelCaptura();
		contentPane.add(panelCaptura, BorderLayout.CENTER);
		
		panelOpciones = new PanelOpciones();
		contentPane.add(panelOpciones, BorderLayout.SOUTH);
	}

}
