package fleetMasterManagement;

public class Vehicle {
	private String maker;
	private String model;
	private String vin;
	private LocalDate productionDate;
	private String plate; //licence plate
	


	public Vehicle(String maker, String model, String vin, LocalDate productionDate, String plate) {
		super();
		this.maker = maker;
		this.model = model;
		this.vin = vin;
		this.productionDate = productionDate;
		this.plate = plate;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

}
