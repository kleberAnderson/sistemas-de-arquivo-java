package controller;

import java.io.*;

public class ArquivosMetodosController implements ArquivosController {

	public ArquivosMetodosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lerArquivo(String path, String nome) throws IOException {

		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("Tropical fruits")) {
					String[] line = linha.split(",");
					System.out.println(line[0]+"   \t   "+line[1]+"    \t    "+line[3]);
				}

				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido!");
		}
	}

}
