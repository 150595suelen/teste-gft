package br.com.teste.gft.util;

public class StringUtils {

	public static String removeCaracteresEspeciais(String texto) {
		return texto.replaceAll("[ãâàáä]", "a").replaceAll("[êèéë]", "e").replaceAll("[îìíï]", "i")
				.replaceAll("[õôòóö]", "o").replaceAll("[ûúùü]", "u").replaceAll("[ÃÂÀÁÄ]", "A")
				.replaceAll("[ÊÈÉË]", "E").replaceAll("[ÎÌÍÏ]", "I").replaceAll("[ÕÔÒÓÖ]", "O")
				.replaceAll("[ÛÙÚÜ]", "U").replace('ç', 'c').replace('Ç', 'C').replace('ñ', 'n').replace('Ñ', 'N')
				.replaceAll("!", "").replaceAll("\\[\\´\\`\\?!\\@\\#\\$\\%\\¨\\*", " ")
				.replaceAll("\\(\\)\\=\\{\\}\\[\\]\\~\\^\\]", " ")
				.replaceAll("[\\.\\;\\-\\_\\+\\'\\ª\\º\\:\\;\\/]", " ");
	}

}
