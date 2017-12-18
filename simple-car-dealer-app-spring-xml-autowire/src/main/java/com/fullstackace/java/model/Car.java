package com.fullstackace.java.model;

public class Car implements Automobile {

	private String stockId;
	private int modelYear;
	private String model;
	private int numberOfSeats;
	private float capacityILitres;
	private float zeroToSixtyInSeconds;
	private int fuelEconomyInMpg;
	private boolean isFourWheelDrive;
	private int marketValueinUsd;

	public Car(String stockId, int modelYear, String model, int numberOfSeats, float capacityILitres,
			float zeroToSixtyInSeconds, int fuelEconomyInMpg, boolean isFourWheelDrive, int marketValueinUsd) {
		super();
		this.stockId = stockId;
		this.modelYear = modelYear;
		this.model = model;
		this.numberOfSeats = numberOfSeats;
		this.capacityILitres = capacityILitres;
		this.zeroToSixtyInSeconds = zeroToSixtyInSeconds;
		this.fuelEconomyInMpg = fuelEconomyInMpg;
		this.isFourWheelDrive = isFourWheelDrive;
		this.marketValueinUsd = marketValueinUsd;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public float getCapacityILitres() {
		return capacityILitres;
	}

	public void setCapacityILitres(float capacityILitres) {
		this.capacityILitres = capacityILitres;
	}

	public float getZeroToSixtyInSeconds() {
		return zeroToSixtyInSeconds;
	}

	public void setZeroToSixtyInSeconds(float zeroToSixtyInSeconds) {
		this.zeroToSixtyInSeconds = zeroToSixtyInSeconds;
	}

	public int getFuelEconomyInMpg() {
		return fuelEconomyInMpg;
	}

	public void setFuelEconomyInMpg(int fuelEconomyInMpg) {
		this.fuelEconomyInMpg = fuelEconomyInMpg;
	}

	public boolean isFourWheelDrive() {
		return isFourWheelDrive;
	}

	public void setFourWheelDrive(boolean isFourWheelDrive) {
		this.isFourWheelDrive = isFourWheelDrive;
	}

	public int getMarketValueinUsd() {
		return marketValueinUsd;
	}

	public void setMarketValueinUsd(int marketValueinUsd) {
		this.marketValueinUsd = marketValueinUsd;
	}

	@Override
	public String toString() {
		return "Car [stockId=" + stockId + ", modelYear=" + modelYear + ", model=" + model + "]";
	}

}
