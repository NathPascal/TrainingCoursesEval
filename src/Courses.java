
public class Courses {
	private int idCourses;
	private String courName;
	private String courDescription;
	private int duration;
	private boolean format;
	private double price;
	
	public Courses(int idCourses, String courName, String courDescription, int duration, boolean format, double price) {
		super();
		this.idCourses = idCourses;
		this.courName = courName;
		this.courDescription = courDescription;
		this.duration = duration;
		this.format = format;
		this.price = price;
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

	public boolean isFormat() {
		return format;
	}

	public void setFormat(boolean format) {
		this.format = format;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return idCourses + ", " + courName + ", Description=" + courDescription
				+ ", Durée: " + duration + ", Format: " + format + ", Tarif: " + price;
	}
	
	
}
