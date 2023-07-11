package fleetMasterManagement;

public enum TrailerTypes{
	
	INTERMODAL(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 6700;}
		int getMaxCapacity(){return 80000;}
		},
		
	SIDE_COURTAIN(){
		String getCagoType(){return "Consumer goods, lumber";}
		int getWeight(){return 15800;}
		int getMaxCapacity(){return 88000;}
		},
		
	BOX(){
		String getCagoType(){return "Consumer goods, lumber";}
		int getWeight(){return 13800;}
		int getMaxCapacity(){return 650000;}
		},
	REFRIGERATOR(){
		String getCagoType(){return "meat, fish, dairy";}
		int getWeight(){return 6700;}
		int getMaxCapacity(){return 80000;}
		},
	TANKER(){
		String getCagoType(){return "Petrochemicals";}
		int getWeight(){return 12000;}
		int getMaxCapacity(){return 80000;}
		},
	FLATBAD(){
		String getCagoType(){return "Construction materials, industrial & project cargo";}
		int getWeight(){return 4700;}
		int getMaxCapacity(){return 48000;}
		},
		
	LOWBOY(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 7000;}
		int getMaxCapacity(){return 40000;}
		},
		
	STEP_DECK(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 6700;}
		int getMaxCapacity(){return 48000;}
		},
	DOUBLE_DROP(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 7000;}
		int getMaxCapacity(){return 40000;}
		},
	EXTENDABLE(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 10000;}
		int getMaxCapacity(){return 100000;}
		},
	LIVESTOCK(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 10000;}
		int getMaxCapacity(){return 80000;}
		},	
	
	CAR_CARRIER(){
		String getCagoType(){return "Containers";}
		int getWeight(){return 6700;}
		int getMaxCapacity(){return 80000;}
		}
}//enum TrailerTypes