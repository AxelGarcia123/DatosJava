package ventanaPrincipal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.Font;
import javax.swing.JEditorPane;

public class Cajas extends JPanel {
	private JButton buttonVerEjemplo;
	private JEditorPane datosCaja;

	public Cajas() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.SOUTH);
		
		buttonVerEjemplo = new JButton("Ver ejemplo");
		buttonVerEjemplo.setBorderPainted(false);
		buttonVerEjemplo.setBackground(new Color(0, 112, 192));
		buttonVerEjemplo.setForeground(Color.WHITE);
		buttonVerEjemplo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel_1.add(buttonVerEjemplo);
		
		datosCaja = new JEditorPane();
		datosCaja.setContentType("text/html");
		datosCaja.setText("<html>\r\n" + 
        		"<head>\r\n" + 
        		"<title>JTextField de java</title>\r\n" + 
        		"</head>\r\n" + 
        		"<body>\r\n" + 
        		"<center>\r\n" + 
        		"\r\n" + 
        		"<h1>JTextField de Java y sus funciones</h1><br>\r\n" + 
        		"\r\n" + 
        		"<p>Los campos de texto (JTextField) son componentes gráficos muy importantes<br>\r\n" + 
        		" en la construcción de interfaces para cualquier tipo de aplicaci�n en Java, nos permite<br>\r\n" + 
        		" suministrarle al usuario un espacio donde colocar datos, para luego realizar diversas<br>\r\n" + 
        		" actividades con dichos datos ingresados</p><br>\r\n" + 
        		"<h3>Como usar JTextField en Java</h3>\r\n" +  
        		"<p>Primero que todo debemos definir las funcionalidades principales de un JTextField en Java y estas son:<br>\r\n" + 
        		"Obtener datos: Posibilidad para que el usuario escriba un valor solicitado.<br>\r\n" + 
        		"Mostrar datos: Posibilidad de mostrar al usuario un valor.<br>\r\n" + 
        		"Estas son las dos funciones principales para lo cual hacemos uso de los JTextfield, cuando hablamos<br>\r\n" + 
        		" de obtener datos, hacemos referencia a usar los datos que el usuario ingresa en el campo de texto para<br>\r\n" + 
        		" realizar algún procesamiento, etc. Cuando hablamos de mostrar datos hacemos referencia<br>\r\n" + 
        		" a asignarle un valor al campo de texto para informar al usuario, ejemplo cuando tenemos el valor de<br>\r\n" + 
        		" una factura, este puede ser mostrado en un campo de texto para que el usuario sepa su valor.</p><br>\r\n" + 
        		"</center>\r\n" + 
        		"</body>\r\n" + 
        		"</html>");
		add(datosCaja, BorderLayout.CENTER);
	}
	
	public JButton getBotonEjemplo() {
		return buttonVerEjemplo;
	}
}