package com.infine.kata;

public class Compressor {

	public static String compress(String in) throws Exception {

		if (in == null) {

			throw new IllegalArgumentException();
		}

		if (in == "") {

			return "";
		}

		String out = "";
		int nb = 1;

		for (int i = 1; i < in.length(); i++) {
			
			if (in.charAt(i) == in.charAt(i - 1)) {
				nb++;
			} else {
				out += String.valueOf(nb) + in.charAt(i - 1);
				nb = 1;
			}
		}

		out += String.valueOf(nb) + in.charAt(in.length() - 1);

		return out;

	}

	public static String uncompress(String in) {
		return "";
	}
}
