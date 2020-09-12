package Hafta_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {

		File urunler = new File("urunler.txt");
		Scanner scanner = null;
		HashMap<String, Urun> map = new HashMap<String, Urun>();
		try {
			scanner = new Scanner(urunler);
			String tekSatir;
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				tekSatir = scanner.nextLine();
				String[] parca = tekSatir.split("-");
				Urun urun = new Urun(parca[0], parca[1], Integer.parseInt(parca[2]));
				if (!map.containsKey(parca[0])) {
					map.put(parca[0], urun);
				} else if (urun.getFiyat() < map.get(parca[0]).getFiyat()) {
					map.put(parca[0], urun);
				}
			}
			for (String k : map.keySet()) {
				System.out.println(map.get(k));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}

}
