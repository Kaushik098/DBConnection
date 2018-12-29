package ConnectDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class DeleteDataFromDB {

	Connection conn = ConnectionUtil.getConnection();

	SetAndGet getandset = new SetAndGet();
    Scanner sc = new Scanner (System.in);
    
	public void delete(){
		try{
			String name = sc.next();
	        getandset.setStr(name);
	        String str = getandset.getStr();
	        System.out.println(str+" ");
            String deletequery = "DELETE FROM Employee WHERE empName = 'str' "; 
            Statement statement = conn.createStatement();
           // statement.setString(1,str);

           // statement.setString(1,getandset.getStr());
            int resultset = statement.executeUpdate(deletequery);
		    System.out.print(resultset+" row is deleted");
		}
		catch(Exception ae){
			System.err.println(ae.getMessage());
		}
	}

}
