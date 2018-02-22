package companydatabase;

public class Customer extends Account {

		public Customer(String companyName, String adressCountry, int vatNumber) {
			super(companyName, adressCountry, vatNumber);

			accountType = "CUSTOMER";
			accountNumber="6" + accountNumber;
			
	}

			@Override
			public void setPaymentTerms() {
				
				paymentTerms = (int) (pTerms() -15);
				
			}
			

}
