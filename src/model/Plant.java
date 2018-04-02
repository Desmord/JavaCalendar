package model;

public class Plant {
	private String name;
	private int spray;
	private int sprayDay;
	private int watering;
	private int wateringDay;
	private int exaggeration;
	private int exaggerationDay;
	private int pruning;
	private int pruningDay;
	private int fertilization;
	private int fertilizationDay;
	private String plantingDescrition;
	private String wateringDescription;
	private String requirementsDescription;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpray() {
		return spray;
	}

	public void setSpray(int spray) {
		this.spray = spray;
	}

	public int getSprayDay() {
		return sprayDay;
	}

	public void setSprayDay(int sprayDay) {
		this.sprayDay = sprayDay;
	}

	public int getWatering() {
		return watering;
	}

	public void setWatering(int watering) {
		this.watering = watering;
	}

	public int getWateringDay() {
		return wateringDay;
	}

	public void setWateringDay(int wateringDay) {
		this.wateringDay = wateringDay;
	}

	public int getExaggeration() {
		return exaggeration;
	}

	public void setExaggeration(int exaggeration) {
		this.exaggeration = exaggeration;
	}

	public int getExaggerationDay() {
		return exaggerationDay;
	}

	public void setExaggerationDay(int exaggerationDay) {
		this.exaggerationDay = exaggerationDay;
	}

	public int getPruning() {
		return pruning;
	}

	public void setPruning(int pruning) {
		this.pruning = pruning;
	}

	public int getPruningDay() {
		return pruningDay;
	}

	public void setPruningDay(int pruningDay) {
		this.pruningDay = pruningDay;
	}

	public int getFertilization() {
		return fertilization;
	}

	public void setFertilization(int fertilization) {
		this.fertilization = fertilization;
	}

	public int getFertilizationDay() {
		return fertilizationDay;
	}

	public void setFertilizationDay(int fertilizationDay) {
		this.fertilizationDay = fertilizationDay;
	}

	public String getPlantingDescrition() {
		return plantingDescrition;
	}

	public void setPlantingDescrition(String plantingDescrition) {
		this.plantingDescrition = plantingDescrition;
	}

	public String getWateringDescription() {
		return wateringDescription;
	}

	public void setWateringDescription(String wateringDescription) {
		this.wateringDescription = wateringDescription;
	}

	public String getRequirementsDescription() {
		return requirementsDescription;
	}

	public void setRequirementsDescription(String requirementsDescription) {
		this.requirementsDescription = requirementsDescription;
	}

	public Plant(String name, int spray, int sprayDay, int watering, int wateringDay, int exaggeration,
			int exaggerationDay, int pruning, int pruningDay, int fertilization, int fertilizationDay,
			String plantingDescrition, String wateringDescription, String requirementsDescription) {
		super();
		this.name = name;
		this.spray = spray;
		this.sprayDay = sprayDay;
		this.watering = watering;
		this.wateringDay = wateringDay;
		this.exaggeration = exaggeration;
		this.exaggerationDay = exaggerationDay;
		this.pruning = pruning;
		this.pruningDay = pruningDay;
		this.fertilization = fertilization;
		this.fertilizationDay = fertilizationDay;
		this.plantingDescrition = plantingDescrition;
		this.wateringDescription = wateringDescription;
		this.requirementsDescription = requirementsDescription;
	}
	
}
