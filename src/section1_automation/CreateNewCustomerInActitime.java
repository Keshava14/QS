package section1_automation;

import java.util.Random;

public class CreateNewCustomerInActitime {
	
public static void main(String[] args)

{
	// Random object for unique OTP generation
	
	Random r = new Random();
	int num = r.nextInt(100000);
	String customerName = "chitti";
	customerName = customerName + num;
	System.out.println(customerName);
}
}
