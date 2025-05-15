package controller;

import java.io.IOException;

public interface ArquivosController {
	
	public void lerArquivo(String path, String nome) throws IOException;
}
