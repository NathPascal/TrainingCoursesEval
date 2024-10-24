package fr.fms.entities;

public class Categories {
	private int idCategory;
	private String catName;
	private String catDescription;
	
	public Categories(int idCategory, String catName, String catDescription) {
		super();
		this.idCategory = idCategory;
		this.catName = catName;
		this.catDescription = catDescription;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDescription() {
		return catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	@Override
	public String toString() {
		return idCategory + catName + ", Description: " + catDescription;
	}
	
	
}
