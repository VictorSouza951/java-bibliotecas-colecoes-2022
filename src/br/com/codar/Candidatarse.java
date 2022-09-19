package br.com.codar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidatarse {

	public void candidatar() throws FileNotFoundException {
		Scanner leitorDeForms = new Scanner(new File("formulario.txt"));

		List<String> respostas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (leitorDeForms.hasNextLine()) {
			System.out.println(leitorDeForms.nextLine());
			respostas.add(sc.nextLine());
		}

		if (Integer.valueOf(respostas.get(2)) < 16) {
			System.out.println("Muito obrigado por se inscrever, mas voce e muito novo para participar");
			System.out.println("Tente novamente qunado tiver 16 anos!");
			return;
		}
		respostas.forEach(System.out::println);

		String nomeDoUsuario = respostas.get(0).toUpperCase() + ".txt";
		PrintWriter salvForm = new PrintWriter("./formulario-usuario/" + nomeDoUsuario);
		respostas.forEach(salvForm::println);

		salvForm.close();
		sc.close();
		leitorDeForms.close();
		
	}

}
