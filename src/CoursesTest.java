import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CoursesTest {
	
	private static final String url = "jdbc:mariadb://localhost:3306/coursesshop"; 
	private static final String login = "root";
	private static final String password = "fms2024";

	public static void main(String[] args) throws Exception {
		
		//ArrayList<Categories> categories = new ArrayList<>();
	
			try(Connection connection = DriverManager.getConnection(url,login,password)) { 
				
				displayReadAllCourses(connection); //affiche toutes les formations
				
				//displayCoursesByCategory(connection); //affiche les formations par catégorie
				
				
			}
				
			catch(SQLException e) {
				e.printStackTrace();
			}
		
	
	//readAll by Category
		//try(Connection connection = DriverManager.getConnection(url,login,password)) {
			//String strSql = "SELECT * FROM T_Articles where idCategory= ";		
				//try(Statement statement = connection.createStatement()){
					//try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
						//while(resultSet.next()) {
							//int rsIdCourse = resultSet.getInt(1);
							//String rsCourName = resultSet.getString(2);
							//String rsCourDescription = resultSet.getString(3);
							//int rsDuration = resultSet.getInt(4);
							//String rsFormat = resultSet.getString(5);
							//double rsPrice = resultSet.getDouble(6);
							//int rsIdCategory = resultSet.getInt(7);
							//courses.add((new Courses(rsIdCourse,rsCourName,rsCourDescription,rsDuration,rsFormat,rsPrice,rsIdCategory)));						
							//}	
						//}
					//} catch (SQLException e) {
					//	e.printStackTrace();
				//}			
				//for(Courses a: courses)
					//System.out.println(a);
			//}
		//}
}
	public static void displayReadAllCourses(Connection connection) throws Exception {
		ArrayList <Courses> courses = new ArrayList<>();
		String strSql = "SELECT * FROM T_Courses";
		try (Statement statement = connection.createStatement()){
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
			
		}
		for(Courses a: courses)
			System.out.println(a);
	}
		
	}
//}
