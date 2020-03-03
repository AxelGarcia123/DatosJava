package ventanaPrincipal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;

public class Etiquetas extends JPanel {
	private JButton buttonVerEjemplo;
	private JEditorPane textEtiqueta;

	public Etiquetas() {
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
		
		textEtiqueta = new JEditorPane();
		textEtiqueta.setContentType("text/html");
		textEtiqueta.setText("<html>\r\n" + 
         		"<head>\r\n" + 
         		"<title>JLabel</title>\r\n" + 
         		"</head>\r\n" + 
         		"<body>\r\n" + 
         		"<center>\r\n" + 
         		"\r\n" + 
         		"<h1>JLabel de Java y sus funciones</h1>\r\n" + 
         		"\r\n" + 
         		"<p>JLabel es uno de los elementos más simples en modo diseño, se utiliza en múltiples formas<br>\r\n" + 
         		" como etiqueta, para mostrar imágenes, iconos, texto simple, etc.<br>\r\n" + 
         		"Los JLabel son textos que podemos colocar en un Frame, pero además de textos podemos colocar<br>\r\n" + 
         		" imágenes (animadas o no) para darle una buena presentación a nuestra ventana, los JLabel a mi<br>\r\n" + 
         		" parecer son esenciales al momento de crear una interfaz de usuario<br></p>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"<p>¿Cómo se crea un JLabel?<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"JLabel etiqueta=new JLabel();<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"Esto crea una etiqueta vacia, sin texto y sin imagen.<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"JLabel etiqueta=new JLabel(Icon imagen);<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"Esto crea una etiqueta con una imagen especificada.<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"JLabel etiqueta=new JLabel(String texto);<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"Esto crea una etiqueta con un texto especificado.<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"JLabel etiqueta=new JLabel(String texto, Icon imagen, int alineacion);<br>\r\n" + 
         		"\r\n" + 
         		"\r\n" + 
         		"Esto crea una etiqueta con imagen y texto especificado con una alineacion horizontal.</p>\r\n" + 
         		"</center>\r\n" + 
         		"</body>\r\n" + 
         		"</html>");
		add(textEtiqueta, BorderLayout.CENTER);
	}
	
	public JButton getBotonEjemplo() {
		return buttonVerEjemplo;
	}
}
