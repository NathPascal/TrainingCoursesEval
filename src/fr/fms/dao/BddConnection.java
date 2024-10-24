package fr.fms.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BddConnection {
	
	 public static Properties configFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }

	  public static Connection connection() throws IOException, SQLException {
	        Properties prop = configFile("config.properties");
	        String driver = prop.getProperty("db.driver");
	        String url = prop.getProperty("db.url");
	        String user = prop.getProperty("db.login");
	        String password = prop.getProperty("db.password");
	        return DriverManager.getConnection(url, user, password);
	        
	    }
	}