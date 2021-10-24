package mascaras;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static String adicionarMascara(String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})");
		Matcher matcher = pattern.matcher(cnpj);

		if(cnpj.length() != 14) {
			System.out.println("Não tem 14 digítos");
			return cnpj;
		}
		else {
			System.out.println("Aplicando máscara:");
			return matcher.replaceAll("$1.$2.$3/$4-$5");
		}
	}

	public static String adicionarMascaraCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);

		if(cpf.length() != 11) {
			System.out.println("Não tem 11 digítos.");
			return cpf;
		}
		else {
			System.out.println("Aplicando máscara:");
			return matcher.replaceAll("$1.$2.$3-$4");
		}

	}

	public static String limpar(String str) {
		str = str.replaceAll("\\.", "");
		str = str.replaceAll("\\-", "");
		System.out.println("Retirando a máscara:");
		return str;
	}
}