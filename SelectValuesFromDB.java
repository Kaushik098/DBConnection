package ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class SelectValuesFromDB{
       
	   
	  public void selectValue(){
		   
		  Connection conn = ConnectionUtil.getConnection();
		 try{
		   String str_query = "SELECT empName, empDesignation FROM Employee";
           Statement statement = conn.createStatement();
           ResultSet resultset = statement.executeQuery(str_query);
           
        while(resultset.next())
       	  System.out.println(resultset.getString(1)+" "+resultset.getString(2));
	   }
	  catch(Exception ae){
		   System.out.println("Error is existing");
	   }
      
	  }
}
//		   try
//		   {
//			   connection = DriverManager.getConnection(hostname, username, password);
//			   System.out.println("Database Connected");
		      
			 //  if(!connection.isClosed())
		    	   // System.out.print("Database Connected");
		       
		           
//		   }
//		   catch (Exception ae){
//			    System.err.println(ae.getMessage());
//		   }
		   
//		   finally
//		   {
//			   try{
//				   if(connection!= null)
//					   connection.close();
//			   }
//			   catch(SQLException se){}
//		   }
	  
	  
