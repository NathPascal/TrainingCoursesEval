package fr.fms.entities;


public class Courses {
	private int idCourses;
	private String courName;
	private String courDescription;
	private int duration;
	private String format;
	private double price;
	private int idCategory;
	
	public Courses(int idCourses, String courName, String courDescription, int duration, String format, double price, int idCategory) {
		this.idCourses = idCourses;
		this.courName = courName;
		this.courDescription = courDescription;
		this.duration = duration;
		this.format = format;
		this.price = price;
		this.idCategory = idCategory;
	}

	public int getIdCourses() {
		return idCourses;
	}

	public void setIdCourses(int idCourses) {
		this.idCourses = idCourses;
	}

	public String getCourName() {
		return courName;
	}

	public void setCourName(String courName) {
		this.courName = courName;
	}

	public String getCourDescription() {
		return courDescription;
	}

	public void setCourDescription(String courDescription) {
		this.courDescription = courDescription;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getIdCategory() {
		return idCategory;
	}
	
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	@Override
	public String toString() {
		return idCourses + "= " + courName + ", Description: " + courDescription
				+ ", Durée: " + duration + ", Format: " + format + ", Tarif: " + price
				+ " , catégorie: " + idCategory;
	}
	
	
}
