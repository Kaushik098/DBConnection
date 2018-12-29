package ConnectDatabase;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;

public class UpdateDataInDB {
     
	Connection conn = ConnectionUtil.getConnection();
	
	public void updatetext(){
		  try{
			  String updatequery = "UPDATE Employee SET empName = 'AmirKhan' WHERE empName='Amir'";
			  Statement statement = conn.createStatement();
			  int resultset = statement.executeUpdate(updatequery);
			  System.out.print(resultset+" row is updated");
		  }
		  catch (Exception ae){
			 System.err.println(ae.getMessage());
		  }
	}
}
