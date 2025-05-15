package view;

import java.io.IOException;
import controller.ArquivosController;
import controller.ArquivosMetodosController;

public class Principal {

	public static void main(String[] args) {
		ArquivosController arqCont = new ArquivosMetodosController();
		String path = "C:\\TEMP\\Aula";
		String nome = "generic_food.csv";
		
		try {
			arqCont.lerArquivo(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
