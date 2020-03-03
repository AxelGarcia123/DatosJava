package ventanaPrincipal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import calculadora.Calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel textTitulo;
	private JPanel panelMenuLateral;
	private LateralMenu menuLateral;
	private Etiquetas etiquetas;
	private Cajas cajas;
	private Botones botones;
	private Calculadora calculadora;
	private Radios radios;
	private CheckBox checkBox;
	private EjemploEtiquetas ejemploEtiquetas;
	private EjemploCajas ejemploCajas;
	private EjemploRadios ejemploRadios;
	private EjemploCheckBox ejemploCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);

		textTitulo = new JLabel("Unidad 1");
		textTitulo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		panel.add(textTitulo);

		panelMenuLateral = new JPanel();
		panelMenuLateral.setBackground(Color.WHITE);
		contentPane.add(panelMenuLateral, BorderLayout.WEST);
		lateralMenu();
	}

	public void lateralMenu() {
		if(menuLateral == null) {
			menuLateral = new LateralMenu();

			//OPCIÓN DEL MENÚ ETIQUETAS
			menuLateral.getBotonEtiqueta().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					opcionEtiqueta();
				}
			});

			//OPCIÓN DEL MENÚ DE BOTONES
			menuLateral.getBotonBoton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					opcionBoton();
				}
			});

			//OPCIÓN DEL MENÚ DE CAJAS
			menuLateral.getBotonCaja().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					opcionCajas();
				}
			});

			//OPCIÓN DEL MENÚ DE RADIOS
			menuLateral.getBotonRadio().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					opcionRadio();
				}
			});

			//OPCIÓN DEL MENÚ DE CHECKBOX
			menuLateral.getBotonCheckBox().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					opcionCheckBox();
				}
			});

			contentPane.add(menuLateral, BorderLayout.WEST);						
			setVisible(true);
		}
	}

	//DESCRIPCIÓN DE ETIQUETA
	public void opcionEtiqueta() {
		contentPane.removeAll();
		checkBox = null;
		radios = null;
		botones = null;
		etiquetas = null;
		cajas = null;
		menuLateral = null;
		lateralMenu();
		repaint();
		
		if(etiquetas == null) {
			etiquetas = new Etiquetas();

			etiquetas.getBotonEjemplo().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ejemploEtiquetas = new EjemploEtiquetas();
					ejemploEtiquetas.setVisible(true);

					ejemploEtiquetas.getBotonCancelar().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploEtiquetas.dispose();
							ejemploEtiquetas = null;
						}
					});

					ejemploEtiquetas.getBotonOk().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploEtiquetas.dispose();
							ejemploEtiquetas = null;
						}
					});
				}
			});

			contentPane.add(etiquetas, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	//OPCIÓN DE LAS CAJAS
	public void opcionCajas() {
		contentPane.removeAll();
		checkBox = null;
		radios = null;
		botones = null;
		etiquetas = null;
		cajas = null;
		menuLateral = null;
		lateralMenu();
		repaint();
		
		if(cajas == null) {
			cajas = new Cajas();

			cajas.getBotonEjemplo().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ejemploCajas = new EjemploCajas();
					ejemploCajas.setVisible(true);

					ejemploCajas.getBotonOk().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploCajas.dispose();
							ejemploCajas = null;
						}
					});

					ejemploCajas.getBotonCancelar().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploCajas.dispose();
							ejemploCajas = null;
						}
					});
				}
			});

			contentPane.add(cajas, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void opcionBoton() {
		contentPane.removeAll();
		checkBox = null;
		radios = null;
		botones = null;
		etiquetas = null;
		cajas = null;
		menuLateral = null;
		lateralMenu();
		repaint();
		
		if(botones == null) {
			botones = new Botones();
			
			botones.getBotonEjemplo().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					calculadora = new Calculadora();
					calculadora.setVisible(true);
					
					calculadora.addWindowListener(new WindowListener() {
						
						@Override
						public void windowOpened(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowIconified(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowDeiconified(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowDeactivated(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowClosing(WindowEvent e) {
							
						}
						
						@Override
						public void windowClosed(WindowEvent e) {
							calculadora.dispose();
							calculadora = null;
						}
						
						@Override
						public void windowActivated(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
				}
			});
			
			contentPane.add(botones, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void opcionRadio() {
		contentPane.removeAll();
		checkBox = null;
		radios = null;
		botones = null;
		etiquetas = null;
		cajas = null;
		menuLateral = null;
		lateralMenu();
		repaint();
		
		if(radios == null) {
			radios = new Radios();
			
			radios.getBotonEjemplo().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ejemploRadios = new EjemploRadios();
					ejemploRadios.setVisible(true);
					
					ejemploRadios.getBotonOk().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploRadios.dispose();
							ejemploRadios = null;
						}
					});
					
					ejemploRadios.getBotonCancelar().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploRadios.dispose();
							ejemploRadios = null;
						}
					});
				}
			});
			
			contentPane.add(radios, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void opcionCheckBox() {
		contentPane.removeAll();
		checkBox = null;
		radios = null;
		botones = null;
		etiquetas = null;
		cajas = null;
		menuLateral = null;
		lateralMenu();
		repaint();
		
		if(checkBox == null) {
			checkBox = new CheckBox();
			
			checkBox.getBotonEjemplo().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ejemploCheckBox = new EjemploCheckBox();
					ejemploCheckBox.setVisible(true);
					
					ejemploCheckBox.getBotonOk().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploCheckBox.dispose();
							ejemploCheckBox = null;
						}
					});
					
					ejemploCheckBox.getBotonCancelar().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							ejemploCheckBox.dispose();
							ejemploCheckBox = null;
						}
					});
				}
			});
			
			contentPane.add(checkBox, BorderLayout.CENTER);
			setVisible(true);
		}
	}
}
