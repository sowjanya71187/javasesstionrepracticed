package oop_EncapConcept;

public class B_1BrowserUser {

	public static void main(String[] args) {
		B_1Browser br = new B_1Browser();
		br.lanchBrowser();
		br.setVersion(101);
		int vrs=br.getversion();
		System.out.println(vrs);

	}

}
