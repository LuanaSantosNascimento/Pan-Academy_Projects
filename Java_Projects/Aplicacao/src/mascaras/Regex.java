package mascaras;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static String adicionarMascara(String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})");
		Matcher matcher = pattern.matcher(cnpj);

		if(cnpj.length() != 14) {
			System.out.println("N�o tem 14 dig�tos");
			return cnpj;
		}
		else {
			System.out.println("Aplicando m�scara:");
			return matcher.replaceAll("$1.$2.$3/$4-$5");
		}
	}

	public static String adicionarMascaraCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);

		if(cpf.length() != 11) {
			System.out.println("N�o tem 11 dig�tos.");
			return cpf;
		}
		else {
			System.out.println("Aplicando m�scara:");
			return matcher.replaceAll("$1.$2.$3-$4");
		}

	}

	public static String limpar(String str) {
		str = str.replaceAll("\\.", "");
		str = str.replaceAll("\\-", "");
		System.out.println("Retirando a m�scara:");
		return str;
	}
}