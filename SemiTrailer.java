package fleetMasterManagement;

public class SemiTrailer extends Vehicle {
	
	private String trailerType;
	private int [] dimensions = new int[3]; //hight width length
	private int weight;
	private int maxCapacity;
				
	private String cargoType; //ex: container
	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public String getTrailerType() {
		return trailerType;
	}

	public void setTrailerType(String trailerType) {
		this.trailerType = trailerType;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(int[] dimensions) {
		boolean check=true;
		for(int i=0; i<dimensions.length; i++) {
			if(dimensions[i]<0)check=false;
		}
		if(check)this.dimensions = dimensions;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight>0)this.weight = weight;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		if(maxCapacity>0)this.maxCapacity = maxCapacity;
	}


	public SemiTrailer() {
		// TODO Auto-generated constructor stub
	}

}
