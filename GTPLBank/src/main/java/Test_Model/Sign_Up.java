package Test_Model;
import org.testng.annotations.Test;

import Base_model.Test_Base;
import Page_Object_Model.POM_for_bank;

public class Sign_Up extends Test_Base {

	
	POM_for_bank X;
	
	
	@Test
	public void SIGN_UP() throws InterruptedException {
		
		X= new POM_for_bank(Driver);
		X.GTPL_bank("mngr431355", "UnazUda", "Joe", "03141970", "15111 st", "Orange", "California", "1234", "929454789", "Joesleep@yahoo.com");
		X.Refresh();
	}
}
