package com.infine.kata;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {

	/*
	 * implementer plusieurs version de la méthode qui retourne une map contenant le
	 * nombre de stations par ligne v1) compatible java 7 v2) en utilisant les
	 * lambda v3) faire une version parallèle
	 */
	Map<String, Long> countStationsGroupByLineId() {

		Trafic[] tab = Trafic.trafic;

		Map<String, Long> result = new HashMap<String, Long>();

		for (int i = 0; i < tab.length; i++) {
			String ligne = tab[i].getLine();
			if (result.containsKey(ligne)) {
				result.put(ligne, result.get(ligne) + 1);
			} else {
				result.put(ligne, 1L);
			}
		}

		return result;
	}
}
