package fr.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Courses;

public class CoursesDao {
	private Connection connection;
	
	public CoursesDao(Connection connection) {
        this.connection = connection;
   }
	// Méthode qui renvoit tous les produits de la table T_Courses
	public ArrayList<Courses> readAll() {
		ArrayList<Courses> courses = new ArrayList<>();
		String strSql = "SELECT * FROM T_Courses";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsIdCourse = resultSet.getInt(1);
					String rsCourName = resultSet.getString(2);
					String rsCourDescription = resultSet.getString(3);
					int rsDuration = resultSet.getInt(4);
					String rsFormat = resultSet.getString(5);
					double rsPrice = resultSet.getDouble(6);
					int rsIdCategory = resultSet.getInt(7);	
					courses.add((new Courses(rsIdCourse,rsCourName,rsCourDescription,rsDuration,rsFormat,rsPrice,rsIdCategory)));						
				}	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return courses;
	}

	// Méthode qui renvoi tous les articles d'une catégorie
	
	public ArrayList<Courses> readAllByCat(int idCategory) {
		ArrayList<Courses> coursesByCat = new ArrayList<>();
		String strSql = "SELECT * FROM T_Courses where idCategory=" + idCategory;		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsIdCourse = resultSet.getInt(1);
					String rsCourName = resultSet.getString(2);
					String rsCourDescription = resultSet.getString(3);
					int rsDuration = resultSet.getInt(4);
					String rsFormat = resultSet.getString(5);
					double rsPrice = resultSet.getDouble(6);
					int rsIdCategory = resultSet.getInt(7);	
					coursesByCat.add((new Courses(rsIdCourse,rsCourName,rsCourDescription,rsDuration,rsFormat,rsPrice,rsIdCategory)));						
				}	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return coursesByCat;
	}
	
	//Méthode qui renvoi tous les articles par mot-clés
	
	   public ArrayList<Courses> readAllByKeyword(String keyword) {
	        ArrayList<Courses> coursesByKeyword = new ArrayList<>();
	        String strSql = "SELECT * FROM T_Courses WHERE courName LIKE ? OR courDescription LIKE ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(strSql)) {
	            preparedStatement.setString(1, "%" + keyword + "%");
	            preparedStatement.setString(2, "%" + keyword + "%");
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                while (resultSet.next()) {
	                    int rsIdCourse = resultSet.getInt(1);
	                    String rsCourName = resultSet.getString(2);
	                    String rsCourDescription = resultSet.getString(3);
	                    int rsDuration = resultSet.getInt(4);
	                    String rsFormat = resultSet.getString(5);
	                    double rsPrice = resultSet.getDouble(6);
	                    int rsIdCategory = resultSet.getInt(7);
	                    coursesByKeyword.add(new Courses(rsIdCourse, rsCourName, rsCourDescription, rsDuration, rsFormat, rsPrice, rsIdCategory));
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return coursesByKeyword;
	    }
	   
	   // Méthode qui renvoit les articles par format
	   
	    public ArrayList<Courses> readAllByFormat(String format) {
	        ArrayList<Courses> coursesByFormat = new ArrayList<>();
	        String strSql = "SELECT * FROM T_Courses WHERE format = ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(strSql)) {
	            preparedStatement.setString(1, format);
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                while (resultSet.next()) {
	                    int rsIdCourse = resultSet.getInt(1);
	                    String rsCourName = resultSet.getString(2);
	                    String rsCourDescription = resultSet.getString(3);
	                    int rsDuration = resultSet.getInt(4);
	                    String rsFormat = resultSet.getString(5);
	                    double rsPrice = resultSet.getDouble(6);
	                    int rsIdCategory = resultSet.getInt(7);
	                    coursesByFormat.add(new Courses(rsIdCourse, rsCourName, rsCourDescription, rsDuration, rsFormat, rsPrice, rsIdCategory));
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return coursesByFormat;
	    }

}
