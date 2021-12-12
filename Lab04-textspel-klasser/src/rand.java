import java.util.Random;

public class rand {
	private int resultat;
	private int number;
	private int nbr;
	private Random rand = new Random();
	

	private int AntalStrings = 2;
	private String[] svar1 = new String[AntalStrings];
	private int[] räknare = new int[AntalStrings];

	public void convert(String s) {// ger sten, sax, påse int värden
		if (s.equals("sten")) {
			number = 0;
		}
		if (s.equals("sax")) {
			number = 1;
		}
		if (s.equals("påse")) {
			number = 2;
		}
		System.out.println(number);

	}

	public void match() {
		nbr = rand.nextInt(2);
		if (number == nbr) { // båda värden samma
			resultat = 3;

		} else {
			if (number + nbr == 1) {// sten mot sax
				resultat = 0; // sten vann

			}
			if (number + nbr == 2) {// sten mot påse
				resultat = 2; // påse vann

			}
			if (number + nbr == 3) {// sax mot påse
				resultat = 1; // sax vann

			}
		}

		System.out.println("resultat " + resultat);
		System.out.println("nbr " + nbr);
	}

	public void stringgenerator(int s) {

		for (int i = 0; i < AntalStrings; i++) {

			if (räknare[i] == 0) {
				if (s == 0) {
					svar1[i] = "sten";
				}

				if (s == 1) {
					svar1[i] = "sax";
				}

				if (s == 2) {
					svar1[i] = "påse";
				}

				if (s == 3) {
					svar1[i] = "lika";
				}
				räknare[i] = 1; // så svar1[] får nytt värde när metoden anropas igen
				i = 1000; // ur ur loop
			}

		}

	}

	public int getResultat() {
		return resultat;
	}

	public int getNbr() {
		return nbr;
	}

	public String getSvarnbr() {
		return svar1[0];
	}

	public String getSvarresultat() {
		return svar1[1];
	}

}
