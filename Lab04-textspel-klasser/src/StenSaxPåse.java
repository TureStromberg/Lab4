import java.util.Scanner;

public class StenSaxPåse {
	private rand r = new rand();

	public static void main(String[] args) {
		while (true) {
			String svar;

			System.out.println("Spela sten sax påse!!");
			System.out.println("skriv antingen sten sax eller påse i raden under och tryck enter");

			Scanner scan = new Scanner(System.in);
			svar = scan.next();

			StenSaxPåse p = new StenSaxPåse();
			p.r.convert(svar); // gör om svar till en int
			p.r.match();

			p.r.stringgenerator(p.r.getNbr());
			p.r.stringgenerator(p.r.getResultat());

			System.out.println("datorn valde " + p.r.getSvarnbr() + " och du valde " + svar);
			System.out.println(p.r.getSvarresultat() + " vann");
			System.out.println();
		}
	}

}
