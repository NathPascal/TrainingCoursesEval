package fr.fms.dao;

import java.util.ArrayList;

import fr.fms.entities.Courses;

public interface Dao {

	public ArrayList<Courses>readAll();
	public ArrayList<Courses> readAllByCat(int idCategory);
	public ArrayList<Courses> readAllByKeyword(String keyword);
    public ArrayList<Courses> readAllByFormat(String format);
}

