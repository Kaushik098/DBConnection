package ConnectDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class InsertValuesToDB {
        
	
	public void insert (){
	    Connection conn = ConnectionUtil.getConnection();
	    
			
			try{
		        String insertquery = "INSERT INTO Employee (empId, empName, empdesignation, empphno) VALUES (1010, 'Leo', 'Typist', '9922884466')";	
		        Statement statement = conn.createStatement();
		        int resultset = statement.executeUpdate(insertquery);
		        
		        System.out.print(resultset+ " Added");
			}
			catch(Exception ae){
				System.err.println(ae.getMessage());
			}
		
		}
}
