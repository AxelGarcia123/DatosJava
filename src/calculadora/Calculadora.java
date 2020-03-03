package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Eventos;

@SuppressWarnings("serial")
public class Calculadora extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton boton1;
	private JButton botonMasMenos;
	private JButton boton0;
	private JButton boton2;
	private JButton boton3;
	private JButton botonSumar;
	private JButton botonIgual;
	private JButton botonPunto;
	private JButton botonRestar;
	private JButton boton5;
	private JButton boton6;
	private JButton boton4;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton botonBorrar;
	private JButton botonC;
	private JButton CE;
	private JButton botonPorcentaje;
	private JButton botonRaiz;
	private JButton botonEntre1;
	private JButton botonPotencia;
	private JEditorPane cuentas;
	private List<String> cadena;
	private Eventos evento;
	private float n1 = 0;
	private float n2 = 0;
	private float resultado = 0;
	private String signo = "";
	private boolean aux = true;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadora() {
		cadena = new ArrayList<>();
		evento = new Eventos();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		cuentas = new JEditorPane();
		cuentas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cuentas.setPreferredSize(new Dimension(106, 100));
		contentPane.add(cuentas, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 4, 10, 10));

		botonPorcentaje = new JButton("%");
		botonPorcentaje.setForeground(Color.WHITE);
		botonPorcentaje.addActionListener(this);
		botonPorcentaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonPorcentaje.setBackground(Color.CYAN);
		panel.add(botonPorcentaje);

		botonRaiz = new JButton("Raiz");
		botonRaiz.setBackground(Color.CYAN);
		botonRaiz.setForeground(Color.WHITE);
		botonRaiz.addActionListener(this);
		panel.add(botonRaiz);

		botonPotencia = new JButton("x^2");
		botonPotencia.setBackground(Color.CYAN);
		botonPotencia.setForeground(Color.WHITE);
		botonPotencia.addActionListener(this);
		botonPotencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonPotencia);

		botonEntre1 = new JButton("1/x");
		botonEntre1.setBackground(Color.CYAN);
		botonEntre1.setForeground(Color.WHITE);
		botonEntre1.addActionListener(this);
		botonEntre1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonEntre1);

		CE = new JButton("CE");
		CE.setBackground(Color.CYAN);
		CE.setForeground(Color.WHITE);
		CE.addActionListener(this);
		CE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(CE);

		botonC = new JButton("C");
		botonC.setBackground(Color.CYAN);
		botonC.setForeground(Color.WHITE);
		botonC.addActionListener(this);
		botonC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonC);

		botonBorrar = new JButton("Borrar");
		botonBorrar.setBackground(Color.CYAN);
		botonBorrar.setForeground(Color.WHITE);
		botonBorrar.addActionListener(this);
		panel.add(botonBorrar);

		botonDividir = new JButton("/");
		botonDividir.setBackground(Color.CYAN);
		botonDividir.setForeground(Color.WHITE);
		botonDividir.addActionListener(this);
		botonDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonDividir);

		boton7 = new JButton("7");
		boton7.setBackground(Color.CYAN);
		boton7.setForeground(Color.WHITE);
		boton7.addActionListener(this);
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton7);

		boton8 = new JButton("8");
		boton8.setBackground(Color.CYAN);
		boton8.setForeground(Color.WHITE);
		boton8.addActionListener(this);
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton8);

		boton9 = new JButton("9");
		boton9.setBackground(Color.CYAN);
		boton9.setForeground(Color.WHITE);
		boton9.addActionListener(this);
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton9);

		botonMultiplicar = new JButton("x");
		botonMultiplicar.setBackground(Color.CYAN);
		botonMultiplicar.setForeground(Color.WHITE);
		botonMultiplicar.addActionListener(this);
		botonMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonMultiplicar);

		boton4 = new JButton("4");
		boton4.setBackground(Color.CYAN);
		boton4.setForeground(Color.WHITE);
		boton4.addActionListener(this);
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton4);

		boton5 = new JButton("5");
		boton5.setBackground(Color.CYAN);
		boton5.setForeground(Color.WHITE);
		boton5.addActionListener(this);
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton5);

		boton6 = new JButton("6");
		boton6.setBackground(Color.CYAN);
		boton6.setForeground(Color.WHITE);
		boton6.addActionListener(this);
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton6);

		botonRestar = new JButton("-");
		botonRestar.setBackground(Color.CYAN);
		botonRestar.setForeground(Color.WHITE);
		botonRestar.addActionListener(this);
		botonRestar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonRestar);

		boton1 = new JButton("1");
		boton1.setBackground(Color.CYAN);
		boton1.setForeground(Color.WHITE);
		boton1.addActionListener(this);
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton1);

		boton2 = new JButton("2");
		boton2.setBackground(Color.CYAN);
		boton2.setForeground(Color.WHITE);
		boton2.addActionListener(this);
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton2);

		boton3 = new JButton("3");
		boton3.setBackground(Color.CYAN);
		boton3.setForeground(Color.WHITE);
		boton3.addActionListener(this);
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton3);

		botonSumar = new JButton("+");
		botonSumar.setBackground(Color.CYAN);
		botonSumar.setForeground(Color.WHITE);
		botonSumar.addActionListener(this);
		botonSumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonSumar);

		botonMasMenos = new JButton("+\r\n-");
		botonMasMenos.setBackground(Color.CYAN);
		botonMasMenos.setForeground(Color.WHITE);
		botonMasMenos.addActionListener(this);
		botonMasMenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonMasMenos);

		boton0 = new JButton("0");
		boton0.setBackground(Color.CYAN);
		boton0.setForeground(Color.WHITE);
		boton0.addActionListener(this);
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(boton0);

		botonPunto = new JButton(".");
		botonPunto.setBackground(Color.CYAN);
		botonPunto.setForeground(Color.WHITE);
		botonPunto.addActionListener(this);
		botonPunto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonPunto);

		botonIgual = new JButton("=");
		botonIgual.setBackground(Color.CYAN);
		botonIgual.setForeground(Color.WHITE);
		botonIgual.addActionListener(this);
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(botonIgual);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton0) {
			cadena.add("0");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton1) {
			cadena.add("1");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton2) {
			cadena.add("2");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton3) {
			cadena.add("3");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton4) {
			cadena.add("4");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton5) {
			cadena.add("5");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton6) {
			cadena.add("6");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton7) {
			cadena.add("7");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton8) {
			cadena.add("8");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == boton9) {
			cadena.add("9");
			cuentas.setText(evento.pasarCadena(cadena));
		}

		if(e.getSource() == botonPunto) {
			cadena.add(".");
			cuentas.setText(evento.pasarCadena(cadena));
		}
		
		if(e.getSource() == botonPorcentaje) {
			if(!cuentas.getText().isEmpty() && n1 == 0)  {
				n1 = Float.parseFloat(cuentas.getText());
				cuentas.setText(null);
				cadena.clear();
			}
			else if(!cuentas.getText().isEmpty() && n1 != 0) {
				n2 = Float.parseFloat(cuentas.getText());
				resultado = (n1 / 100) * n2;
				cuentas.setText(String.valueOf(resultado));
				resultado = 0;
				n1 = 0;
				n2 = 0;
				cadena.clear();
			}
		}

		if(e.getSource() == botonRaiz) {
			if(!cuentas.getText().isEmpty() && Integer.parseInt(cuentas.getText()) >= 0) {
				resultado = (float) Math.sqrt(Float.parseFloat(cuentas.getText()));
				cuentas.setText(String.valueOf(resultado));
				cadena.clear();
			}
		}
		
		if(e.getSource() == botonPotencia) {
			resultado = (float) Math.pow(Float.parseFloat(cuentas.getText()), 2);
			cuentas.setText(String.valueOf(resultado));
			cadena.clear();
		}
		
		if(e.getSource() == botonEntre1) {
			if(Float.parseFloat(cuentas.getText()) != 0) {
				resultado = 1 / (Float.parseFloat(cuentas.getText()));
				cuentas.setText(String.valueOf(resultado));
				cadena.clear();
			}
			else {
				JOptionPane.showMessageDialog(null, "No puedes dividir entre 0");
				cuentas.setText(null);
				cadena.clear();
			}
		}
		
		if(e.getSource() == CE) {
			cuentas.setText(null);
			cadena.clear();
		}
		
		if(e.getSource() == botonC) {
			cuentas.setText(null);
			resultado = 0;
			n1 = 0;
			n2 = 0;
			cadena.clear();
			signo = "";
		}
		
		if(e.getSource() == botonBorrar) {
			
		}

		if(e.getSource() == botonSumar) {
			if(!signo.equals("-") && !signo.equals("*") && !signo.equals("/")) {
				signo = "+";
				if(!cuentas.getText().isEmpty() && n1 == 0 && n2 == 0 && resultado == 0) {
					n1 = Float.parseFloat(cuentas.getText());
					System.out.println(n1);
					cuentas.setText(null);
					cadena.clear();
					aux = false;
				}
				else if(!cuentas.getText().isEmpty() && n1 != 0 && n2 == 0 && resultado == 0){
					n2 = Float.parseFloat(cuentas.getText());
					System.out.println(n2);
					resultado = n1 + n2;
					n1 = 0;
					n2 = 0;
					cuentas.setText(String.valueOf(resultado));
					cadena.clear();
				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && aux != false) {

				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0 && aux != true) {
					resultado += (Float.parseFloat(cuentas.getText()));
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					cadena.clear();
				}
				else {

				}
			}
			else {
				if(signo.equals("-")) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 - n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					cadena.clear();
					signo = "";
				}
				else if(signo.equals("-") && resultado != 0) {
					n1 = Float.parseFloat(cuentas.getText());
					resultado += n1;
					n1 = 0;
					cadena.clear();
					signo = "";
				}
			}
		}
		if(e.getSource() == botonRestar) {
			if(!signo.equals("+") && !signo.equals("*") && !signo.equals("/")) {
				signo = "-";
				if(!cuentas.getText().isEmpty() && n1 == 0 && n2 == 0 && resultado == 0) {
					n1 = Float.parseFloat(cuentas.getText());
					System.out.println(n1 + "1");
					cuentas.setText(null);
					cadena.clear();
					aux = false;
				}
				else if(!cuentas.getText().isEmpty() && n1 != 0 && n2 == 0 && resultado == 0){
					n2 = Float.parseFloat(cuentas.getText());
					System.out.println(n2);
					resultado = n1 - n2;
					n1 = 0;
					n2 = 0;
					cuentas.setText(String.valueOf(resultado));
					cadena.clear();
				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && aux != false) {

				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0 && aux != true) {
					resultado -= (Float.parseFloat(cuentas.getText()));
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					cadena.clear();
				}
				else {

				}
			}
			else {
				if(signo.equals("+")) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 + n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					cadena.clear();
					signo = "";
				}
				else if(signo.equals("+") && resultado != 0) {
					n1 = Float.parseFloat(cuentas.getText());
					resultado += n1;
					n1 = 0;
					cadena.clear();
					signo = "";
				}
			}
		}
		
		if(e.getSource() == botonMultiplicar) {
			if(!signo.equals("+") && !signo.equals("-") && !signo.equals("/")) {
				signo = "*";
				if(!cuentas.getText().isEmpty() && n1 == 0 && n2 == 0 && resultado == 0) {
					n1 = Float.parseFloat(cuentas.getText());
					System.out.println(n1 + "1");
					cuentas.setText(null);
					cadena.clear();
					aux = false;
				}
				else if(!cuentas.getText().isEmpty() && n1 != 0 && n2 == 0 && resultado == 0){
					n2 = Float.parseFloat(cuentas.getText());
					System.out.println(n2);
					resultado = n1 * n2;
					n1 = 0;
					n2 = 0;
					cuentas.setText(String.valueOf(resultado));
					cadena.clear();
				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && aux != false) {

				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0 && aux != true) {
					resultado *= (Float.parseFloat(cuentas.getText()));
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					cadena.clear();
				}
				else {

				}
			}
			else {
				if(signo.equals("+")) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 + n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					cadena.clear();
					signo = "";
				}
				else if(signo.equals("+") && resultado != 0) {
					n1 = Float.parseFloat(cuentas.getText());
					resultado += n1;
					n1 = 0;
					cadena.clear();
					signo = "";
				}
			}
		}
		
		if(e.getSource() == botonDividir) {
			if(!signo.equals("+") && !signo.equals("-") && !signo.equals("*")) {
				signo = "/";
				if(!cuentas.getText().isEmpty() && n1 == 0 && n2 == 0 && resultado == 0) {
					n1 = Float.parseFloat(cuentas.getText());
					System.out.println(n1 + "1");
					cuentas.setText(null);
					cadena.clear();
					aux = false;
				}
				else if(!cuentas.getText().isEmpty() && n1 != 0 && n2 == 0 && resultado == 0 && Integer.parseInt(cuentas.getText()) != 0){
					n2 = Float.parseFloat(cuentas.getText());
					if(n2 == 0) {
						cuentas.setText("Sintaxys error");
					} else {
						System.out.println(n2);
						resultado = n1 / n2;
						n1 = 0;
						n2 = 0;
						cuentas.setText(String.valueOf(resultado));
						cadena.clear();
					}
				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && aux != false) {

				}
				else if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0 && aux != true && Integer.parseInt(cuentas.getText()) != 0) {
					resultado /= (Float.parseFloat(cuentas.getText()));
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					cadena.clear();
				}
				else {

				}
			}
			else {
				if(signo.equals("+")) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 + n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					cadena.clear();
					signo = "";
				}
				else if(signo.equals("+") && resultado != 0) {
					n1 = Float.parseFloat(cuentas.getText());
					resultado += n1;
					n1 = 0;
					cadena.clear();
					signo = "";
				}
			}
		}

		if(e.getSource() == botonIgual) {
			if(signo == "+") {
				if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0) {
					System.out.println("1");
					resultado += Float.parseFloat(cuentas.getText());
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
				}
				else if(n1 != 0 && n2 == 0 && resultado == 0) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 + n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
					signo = "";
				}
			}
			else if(signo == "-") {
				if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0) {
					resultado -= Float.parseFloat(cuentas.getText());
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
				}
				else if(n1 != 0 && n2 == 0 && resultado == 0) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 - n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
					signo = "";
				}
			}
			
			else if(signo == "*") {
				if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0) {
					resultado *= Float.parseFloat(cuentas.getText());
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
				}
				else if(n1 != 0 && n2 == 0 && resultado == 0) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 * n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
					signo = "";
				}
			}
			
			else if(signo == "/") {
				if(!cuentas.getText().isEmpty() && resultado != 0 && n1 == 0 && Integer.parseInt(cuentas.getText()) != 0) {
					resultado /= Float.parseFloat(cuentas.getText());
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
				}
				else if(n1 != 0 && n2 == 0 && resultado == 0 && Integer.parseInt(cuentas.getText()) != 0) {
					n2 = Float.parseFloat(cuentas.getText());
					resultado = n1 / n2;
					cuentas.setText(String.valueOf(resultado));
					n1 = 0;
					n2 = 0;
					resultado = 0;
					cadena.clear();
					aux = true;
					signo = "";
				}
			}
		}
	}
}
