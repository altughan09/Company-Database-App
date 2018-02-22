package companydatabase;

import java.io.FileNotFoundException;

public class CompanyDatabaseApp {

	public static void main(String[] args) throws FileNotFoundException  {
			
		  Vendor v1 = new Vendor("ABC Ltd", "Poland", 150098766);
		  Customer c1 = new Customer("Dole Hotel", "UK", 355598764);		
		 
		
		  v1.showInfo();
		  System.out.println("*********************************");
		  c1.showInfo();
			
	}

}
