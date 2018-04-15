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

	public Plant() {
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

	public Plant(Builder builder) {
		this.name = builder.name;
		this.spray = builder.spray;
		this.sprayDay = builder.sprayDay;
		this.watering = builder.watering;
		this.wateringDay = builder.wateringDay;
		this.exaggeration = builder.exaggeration;
		this.exaggerationDay = builder.exaggerationDay;
		this.pruning = builder.pruning;
		this.pruningDay = builder.pruningDay;
		this.fertilization = builder.fertilization;
		this.fertilizationDay = builder.fertilizationDay;
		this.plantingDescrition = builder.plantingDescrition;
		this.wateringDescription = builder.wateringDescription;
		this.requirementsDescription = builder.requirementsDescription;
	}

	public static class Builder {
		
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
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder sprayDate(String date) {
			this.spray = date;
			return this;
		}
		
		public Builder sprayDays(int days) {
			this.sprayDay = days;
			return this;
		}
		
		public Builder wateringDate(String date) {
			this.watering = date;
			return this;
		}
		
		public Builder wateringDays(int days) {
			this.wateringDay = days;
			return this;
		}
		
		public Builder exaggerationDate(String date) {
			this.exaggeration = date;
			return this;
		}
		
		public Builder exaggerationDays(int days) {
			this.exaggerationDay = days;
			return this;
		}
		
		public Builder pruningDate(String date) {
			this.pruning = date;
			return this;
		}
		
		public Builder pruningDays(int days) {
			this.pruningDay = days;
			return this;
		}
		
		public Builder fertilizationDate(String date) {
			this.fertilization = date;
			return this;
		}
		
		public Builder fertilizationDays(int days) {
			this.fertilizationDay = days;
			return this;
		}
		
		public Builder plantingDescription(String description) {
			this.plantingDescrition = description;
			return  this;
		}
		
		public Builder wateringDescription(String description) {
			this.wateringDescription = description;
			return this;
		}
		
		public Builder requirementsDescription(String description) {
			this.requirementsDescription = description;
			return this;
		}
		
		public Plant build() {
			return new Plant(this);
		}
		
	}
}
