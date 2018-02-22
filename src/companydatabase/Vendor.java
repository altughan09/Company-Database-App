package companydatabase;

public class Vendor extends Account {

	public Vendor(String companyName, String adressCountry, int vatNumber) {
		super(companyName, adressCountry, vatNumber);
		
		accountType = "VENDOR";
		accountNumber = "4" + accountNumber;
		
	}
		
	@Override
	public void setPaymentTerms() { 
		
		paymentTerms = (int) (pTerms() /2);
		
	}
}
