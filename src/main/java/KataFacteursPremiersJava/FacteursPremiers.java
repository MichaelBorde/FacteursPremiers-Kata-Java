package KataFacteursPremiersJava;

import java.util.List;

import com.google.common.collect.Lists;

public class FacteursPremiers {
	public List<Integer> pour(int nombre) {
		List résultat = Lists.newArrayList();
		for (int i = 2; i <= nombre; ) {
			if (nombre % i == 0) {
				résultat.add(i);
				nombre /= i;
			} else {
				i++;
			}
		}
		return résultat;
	}
}
