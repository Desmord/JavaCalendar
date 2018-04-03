package model;

public class Plant {
	private String name;
	private String spray;
	private int sprayDay;
	private String watering;
	private int wateringDay;
	private String exaggeration;
	private int exaggerationDay;
	private String pruning;
	private int pruningDay;
	private String fertilization;
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

	public String getSpray() {
		return spray;
	}

	public void setSpray(String spray) {
		this.spray = spray;
	}

	public int getSprayDay() {
		return sprayDay;
	}

	public void setSprayDay(int sprayDay) {
		this.sprayDay = sprayDay;
	}

	public String getWatering() {
		return watering;
	}

	public void setWatering(String watering) {
		this.watering = watering;
	}

	public int getWateringDay() {
		return wateringDay;
	}

	public void setWateringDay(int wateringDay) {
		this.wateringDay = wateringDay;
	}

	public String getExaggeration() {
		return exaggeration;
	}

	public void setExaggeration(String exaggeration) {
		this.exaggeration = exaggeration;
	}

	public int getExaggerationDay() {
		return exaggerationDay;
	}

	public void setExaggerationDay(int exaggerationDay) {
		this.exaggerationDay = exaggerationDay;
	}

	public String getPruning() {
		return pruning;
	}

	public void setPruning(String pruning) {
		this.pruning = pruning;
	}

	public int getPruningDay() {
		return pruningDay;
	}

	public void setPruningDay(int pruningDay) {
		this.pruningDay = pruningDay;
	}

	public String getFertilization() {
		return fertilization;
	}

	public void setFertilization(String fertilization) {
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

	public Plant(String name, String spray, int sprayDay, String watering, int wateringDay, String exaggeration,
			int exaggerationDay, String pruning, int pruningDay, String fertilization, int fertilizationDay,
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
