package entradas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws IOException{
		String path = "./src/teste.txt";
		File arquivo = new File(path);
		
		Scanner sc = new Scanner(arquivo);
		int i = 0;
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			i++;
		}
		
		System.out.println("Número de linhas: " + i);
		sc.close();
	}
}