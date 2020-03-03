package ventanaPrincipal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;

public class Radios extends JPanel {
	private JButton buttonVerEjemplo;
	private JEditorPane textRadio;

	public Radios() {
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
		buttonVerEjemplo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(buttonVerEjemplo);
		
		textRadio = new JEditorPane();
		textRadio.setContentType("text/html");
        textRadio.setText("<html>\r\n" + 
        		"<head>\r\n" + 
        		"<title>JRadioButton</title>\r\n" + 
        		"</head>\r\n" + 
        		"<body>\r\n" + 
        		"<center>\r\n" + 
        		"<h1>Utilización de RadioButton</h1>\r\n" + 
        		"<p>Conocido también como botón de opción o botón de radio es un tipo de widget utilizado en interfaces gráficas<br> de usuario que permite elegir una sola opción de un conjunto predeterminado de estas.<br>\r\n" + 
        		"Los botones de opción (botones de radio) se llaman así en referencia a los botones físicos que se usan en los<br> radios para seleccionar estaciones preajustadas - cuando se presionaba uno de los botones, otro de los botones saltaba.<br></p>\r\n" + 
        		"\r\n" + 
        		"<p>Un aspecto interesante de los botones de opción, cuando se utilizan en un formulario HTML, es que si no se<br> marca ningún botón en un grupo, entonces no se pasa ningún par nombre-valor cuando se<br>\r\n" + 
        		" envía el formulario. Por ejemplo, para un grupo de botones de opción llamado Sexo, con las opciones de<br> Masculino y Femenino, la variable Sexo no pasaría, ni siquiera con un valor en blanco.<br></p>\r\n" + 
        		"\r\n" + 
        		"<p>Este es un ejemplo común de un RadioButton en donde sólo se permitirá seleccionar un elemento de la lista definida<br> previamente por el Programador:</p>\r\n" + 
        		"</center>\r\n" + 
        		"\r\n" + 
        		"</body>\r\n" + 
        		"</html>");
		add(textRadio, BorderLayout.CENTER);
	}
	
	public JButton getBotonEjemplo() {
		return buttonVerEjemplo;
	}
}