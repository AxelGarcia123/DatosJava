package ventanaPrincipal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;

public class CheckBox extends JPanel {
	private JButton buttonVerEjemplo;
	private JEditorPane textCheckBox;

	public CheckBox() {
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
		
		textCheckBox = new JEditorPane();
		textCheckBox.setContentType("text/html");
		textCheckBox.setText("<html>\r\n" + 
        		"<head>\r\n" + 
        		"<title>JCheck Box de java</title>\r\n" + 
        		"</head>\r\n" + 
        		"<body>\r\n" + 
        		"<center>\r\n" + 
        		"\r\n" + 
        		"<h1>JCheck Box de Java y sus funciones</h1><br>\r\n" + 
        		"<h3>¿Qué es un checkbox?</h3><br>\r\n" + 
        		"\r\n" + 
        		"<p>que son Casillas de verificación que permiten al usuario seleccionar una o mas <br>\r\n" + 
        		"de las opciones propuestas, ideales en aplicaciones con preguntas de selección múltiple<br>\r\n" + 
        		" con múltiples respuestas (Api de Java).</p><br>\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"<p>Los CheckBox (botones de comprobación) se utilizan generalmente como botones de estado.<br>\r\n" + 
        		" Es decir proporcionan información del tipo Sí o No. El estado del botón se devuelve en el argumento<br>\r\n" + 
        		" Object de los eventos Checkbox; el argumento es de tipo booleano: verdadero (true) si la caja se ha<br>\r\n" + 
        		" seleccionado y falso (false) en otro caso.<br>\r\n" + 
        		"Tanto el nombre como el estado se devuelven en el argumento del evento, aunque se <br>\r\n" + 
        		"pueden obtener a través de los métodos getLabel() y getState() del objeto Checkbox.<br></p>\r\n" + 
        		"</center>\r\n" + 
        		"</body>\r\n" + 
        		"</html>");
		add(textCheckBox, BorderLayout.CENTER);
	}
	
	public JButton getBotonEjemplo() {
		return buttonVerEjemplo;
	}
}