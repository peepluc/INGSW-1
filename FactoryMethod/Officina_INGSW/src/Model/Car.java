package Model;

public class Car {
	private String cbrand;
	private String cmodel;
	
	public Car() {}
	
	@Override
	public String toString() {
		return "Car [cbrand=" + getCbrand() + ", cmodel=" + getCmodel() + "]";
	}

	public String getCbrand() {
		return cbrand;
	}

	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}

	public String getCmodel() {
		return cmodel;
	}

	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}

	
	

}
