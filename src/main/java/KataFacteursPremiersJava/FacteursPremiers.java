package KataFacteursPremiersJava;

import java.util.List;

import com.google.common.collect.Lists;

public class FacteursPremiers {

	public List<Integer> pour(int nombre) {
		List facteurs = Lists.newArrayList();
		for (int i = 2; i <= nombre; i++) {
			for (; nombre % i == 0; nombre /= i) {
				facteurs.add(i);
			}
		}
		return facteurs;
	}
}
