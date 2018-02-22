package companydatabase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public abstract  class Account implements pTermsRate {
		
		private String companyName;
		private String adressCountry;
		private int vatNumber;
		protected String accountType;
		protected int paymentTerms;
		protected String accountNumber;
		private static int indexNumber=1000;
		
		
		public Account(String companyName, String adressCountry, int vatNumber ) {
			
				this.companyName=companyName;
				this.adressCountry=adressCountry;
				this.vatNumber=vatNumber;
								
				indexNumber++;
				accountNumber=setAccountNumber();
				setPaymentTerms(); 
		}
		
		
		public abstract  void setPaymentTerms(); 

				
		
		private String setAccountNumber() {
				String vatCode= "";
				int uniqueID = indexNumber;
				return vatCode+uniqueID;
		}
		
		
		
		public void showInfo() throws FileNotFoundException {
			
				System.out.println("COMPANY NAME: " +companyName +
												"\n COUNTRY: " +adressCountry+
												"\n VAT NUMBER " +vatNumber +
												"\n ACCOUNT CREATED: " +accountType +
												"\n ACCOUNT NUMBER CREATED: " +accountNumber+
												"\n PAYMENT TERMS ASSIGNED: " + paymentTerms + " DAYS" 
											
												);
				
				 PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\Altug\\Desktop\\TEXT.CSV", true));
				 out.println("COMPANY NAME: " +companyName +
							"\n COUNTRY: " +adressCountry+
							"\n VAT NUMBER " +vatNumber +
							"\n ACCOUNT TYPE: " +accountType +
							"\n ACCOUNT NUMBER: " +accountNumber+
							"\n PAYMENT TERMS: " + paymentTerms + " DAYS" );				 
				 out.close();				
			
			
			
		}
		
		
		
		
}
