package com.oop_homework21;

public class Car extends Vehicle implements VWGolf, VWPassat, CKlasse, SKlasse    {
	

	private float fuelTankSize;
	private String fuelType;
	private int gears;
	private int currentgear;
	private float consumptionPer100Km;
	private float availableFuel;
	private int tireSize;
	private String chassisNumber;
	
	public Car(int enginestatus, float kmnumber, float fuelTankSize, String fuelType, int gears, int currentgear,
			float consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
		super(enginestatus, kmnumber);
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gears = gears;
		this.currentgear=0;
		this.consumptionPer100Km = consumptionPer100Km;
		this.availableFuel = availableFuel;
		this.tireSize = tireSize;
		this.chassisNumber = chassisNumber;
	}


	
	
	public void gearShift (int gear) {
		currentgear=gear;
	}




	public float getFuelTankSize() {
		return fuelTankSize;
	}




	public void setFuelTankSize(float fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
	}




	public String getFuelType() {
		return fuelType;
	}




	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}




	public int getGears() {
		return gears;
	}




	public void setGears(int gears) {
		this.gears = gears;
	}




	public int getCurrentgear() {
		return currentgear;
	}




	public void setCurrentgear(int currentgear) {
		this.currentgear = currentgear;
	}




	public float getConsumptionPer100Km() {
		return consumptionPer100Km;
	}




	public void setConsumptionPer100Km(float consumptionPer100Km) {
		this.consumptionPer100Km = consumptionPer100Km;
	}




	/* (non-Javadoc)
	 * @see com.oop_homework21.VWGolf#getAvailableFuel()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.VWPassat#getAvailableFuel()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.CKlasse#getAvailableFuel()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.SKlasse#getAvailableFuel()
	 */
	@Override
	public float getAvailableFuel() {
		return availableFuel;
	}




	/* (non-Javadoc)
	 * @see com.oop_homework21.VWGolf#setAvailableFuel(float)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.VWPassat#setAvailableFuel(float)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.CKlasse#setAvailableFuel(float)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.SKlasse#setAvailableFuel(float)
	 */
	@Override
	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}




	public int getTireSize() {
		return tireSize;
	}




	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}




	/* (non-Javadoc)
	 * @see com.oop_homework21.VWGolf#getChassisNumber()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.VWPassat#getChassisNumber()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.CKlasse#getChassisNumber()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.SKlasse#getChassisNumber()
	 */
	@Override
	public String getChassisNumber() {
		return chassisNumber;
	}




	/* (non-Javadoc)
	 * @see com.oop_homework21.VWGolf#setChassisNumber(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.VWPassat#setChassisNumber(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.CKlasse#setChassisNumber(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.SKlasse#setChassisNumber(java.lang.String)
	 */
	@Override
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
}
