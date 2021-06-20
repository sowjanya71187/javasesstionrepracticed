package oop_Interface;

public class FortlizeHospital extends CentalHospital implements UsMedical ,UkMedicals,IndianMedical{
	
	
	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardoServices() {
		System.out.println("ss");
		
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doctors(int count) {
		System.out.println("print count"+count);
		
	}

	@Override
	public String getHospInfo() {
		
		return "fortizeHospita";
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gynecServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extedWho() {
		// TODO Auto-generated method stub
		
	}
	

}
