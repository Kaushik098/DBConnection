package ConnectDatabase;

import java.sql.Connection;

public class TestConnectionUtil {

	 public static void main(String args[]){
		  
		   Connection conn = ConnectionUtil.getConnection();
		   System.out.println(conn);
		   
//		// To Select Values From Database
//		   
//		   SelectValuesFromDB select = new SelectValuesFromDB();
//		   select.selectValue();
//		   
//		// To Insert Values To Database   
//		   InsertValuesToDB insertrow = new InsertValuesToDB();
//		   insertrow.insert();
		   
		// To Delete Values From Database   
//		   DeleteDataFromDB deleterow = new DeleteDataFromDB();
//		   deleterow.delete();
		   
		   UpdateDataInDB updaterow = new UpdateDataInDB();
		   updaterow.updatetext();
	 }
}
