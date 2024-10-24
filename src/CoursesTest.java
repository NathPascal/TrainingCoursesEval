import java.sql.Connection;
import java.util.ArrayList;

import fr.fms.dao.BddConnection;
import fr.fms.dao.CoursesDao;
import fr.fms.entities.Courses;

public class CoursesTest {
	
	
	public static void main(String[] args) throws Exception {
		
		Connection connection = BddConnection.connection();
		CoursesDao coursesDao = new CoursesDao(connection); 
		
		//Afficher toutes les formations
		ArrayList<Courses> courses = coursesDao.readAll();
		
		System.out.println("Toutes les formations diponibles: \n");
	    for (Courses cour : courses) System.out.println(cour);		
		System.out.println("\n-----------------------------------------\n");		
		//Afficher les formations par catégorie
	    
		int categoryId = 1;  // exemple
		ArrayList<Courses> coursesByCategory = coursesDao.readAllByCat(categoryId);
		
		System.out.println("Les formations diponibles selon la catégorie choisie: \n");
		for (Courses course : coursesByCategory) System.out.println(course);
		System.out.println("\n-----------------------------------------\n");
				
		// Afficher les formations contenant un mot clé
		
		 String keyword = "Java";  // exemple
		 ArrayList<Courses> coursesByKeyword = coursesDao.readAllByKeyword(keyword);
		 
		 System.out.println("Les formations diponibles selon le mot-clé recherché: \n");
	     for (Courses course : coursesByKeyword) System.out.println(course);
	     System.out.println("\n-----------------------------------------\n");

	     // Afficher les formations en présentiel
	       
	     String format = "Presentiel";  // exemple
	     ArrayList<Courses> coursesByFormat = coursesDao.readAllByFormat(format);
	        
	     System.out.println("Les formations diponibles selon le format choisi: \n");
	     for (Courses course : coursesByFormat) System.out.println(course);
	     System.out.println("\n-----------------------------------------");
	        
	}
}
	       	         

	            
	           
							
	

		
