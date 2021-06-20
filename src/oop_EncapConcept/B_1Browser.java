package oop_EncapConcept;

public class B_1Browser {
	private int version;
	public void setVersion(int version) {
		this.version = version;
		
	}
	public int getversion() {
		return version;
	}
	public void lanchBrowser() {
		System.out.println("getting browser lounch");
		checkBrowserVertion();
		checkRam();
		OsCompatable();
		checkBrowserUpdate();
		System.out.println("browser is lounched");
		int vr=version = 10;
		System.out.println(vr);
	}
	private void checkBrowserVertion() {
		System.out.println("check Browser Vertion");
	}
	private void checkRam() {
		System.out.println("check ram");
	}
	private void OsCompatable() {
		System.out.println("Os Compatable");
	}
	private void checkBrowserUpdate() {
		System.out.println("Check Browser Update");
	}

}
