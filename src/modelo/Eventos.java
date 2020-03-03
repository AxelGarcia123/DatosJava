package modelo;

import java.util.List;
public class Eventos {
	public String pasarCadena(List<String> lista) {
		String list = "";
		for (String string : lista) 
			list += string;
		return list;
	}
}