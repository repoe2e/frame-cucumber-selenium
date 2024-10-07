package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class GerenciadorDeArquivos {

	// Método para ler arquivo do txt e retornar o conteúdo
	public String lerArquivoTxt(String arquivo) {
		// StringBuiler é usado para construir o conteúdo do arquivo "linha por linha"
		StringBuilder conteudo = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {
			String linha;
			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");
			}
		} catch (FileNotFoundException e) {
			// arquivo não encontrado
			e.printStackTrace();
		} catch (IOException e) {
			// erros de imprimir o arquivo
			e.printStackTrace();
		}
		return conteudo.toString();
	}

	// Método para ler um arquivo JSON e retornar o conteúdo como String
	public String lerArquivoJson(String arquivo) {
		// Construindo o conteúdo
		StringBuilder conteudo = new StringBuilder();

		// Tenta abrir o arquivo para ler
		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {
			String linha;
			// Mandando percorrer o texto enquanto não encontrar uma linha null
			while ((linha = reader.readLine()) != null) {
				// Adciona cada linha com quebra de linha
				conteudo.append(linha).append("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Retorno do conteúdo
		return conteudo.toString();
	}

	public String lerArquivoXML(String arquivo) {
		StringBuilder conteudo = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/arquivos/" + arquivo))) {

			String linha;
			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conteudo.toString();
	}

	/**
	 * 
	 * @return
	 * @author Anderson Barbosa
	 */
	public String lerArquivoPDF(String arquivoPDF) {

		StringBuilder conteudo = new StringBuilder();

		try (PDDocument documento = PDDocument.load(new File("./src/test/resources/arquivos/" + arquivoPDF))) {

			PDFTextStripper stripper = new PDFTextStripper();

			conteudo.append(stripper.getText(documento));

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erro ao tentar ler pdf");
		}

		return conteudo.toString();

	}


	// Excel

}
