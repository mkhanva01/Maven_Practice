package Page_Object_Model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_for_bank {
	WebDriver Driver;
	
	By Pagetitle= By.tagName("title");
	By Userid= By.xpath("//input[@onkeyup='validateuserid();']");
	By Password= By.xpath("//input[@type='password'][@name='password']");

	By Login= By.xpath("//input[contains(@name, 'btnLo')]");							//Click
	By Newcustomer= By.xpath("//a[starts-with(@href, 'addcustomerpa')]");				//Click
	By Name= By.xpath("//input[starts-with(@name,'na') and (@onkeyup='validatecustomername();')]");
	By Mr= By.xpath("//input[starts-with(@name,'ra') or (@value='1')][1]");				//Click	
	By Mrs= By.xpath("//input[contains(@name, 'rad1')][2]");		
	By Dob= By.xpath(("//tbody/descendant::input[4]"));//Click
	By Address= By.xpath("//textarea[contains(@cols,'20')]");	
	By City= By.xpath("//td/label/preceding::input[@name='city']");
	By State= By.xpath("//input[starts-with(@onkeyup,'validateS')and(@name='state')]");
	By Pin = By.xpath("//input[contains(@onkeyup,'PIN();') or (@name=pinno)]");				//TO find the message $x("//*[@name='pinno']/following-sibling::label")
	By Phone= By.xpath("//input[@name='telephoneno' or @onkeyup='validateTelephone();']");	//TO find Pin using preceding $x("//*[@id='message7']/preceding-sibling::input")
	By Email= By.xpath("//input[contains(@name, 'emai')]");									//TO find Email using ancestor $x("//input[@name='emailid']/ancestor::tr[1]")
	By Submit= By.xpath("//input[@tupe='submit' or @value='Submit']");						//Click




	public POM_for_bank(WebDriver Driver) {
		this.Driver= Driver;
	}

	public String Title() {
		return Driver.getTitle();
	}

	public void Userid(String userid) {
		Driver.findElement(Userid).sendKeys(userid);
	}

	public void Password (String password) {
		Driver.findElement(Password).sendKeys(password);
	}

	public void Login() {
		Driver.findElement(Login).click();
	}

	public void Newcustomer() {
		Driver.findElement(Newcustomer).click();
	}


	public void Name(String name) {
		Driver.findElement(Name).sendKeys(name);
	}

	public void Mr() {
		Driver.findElement(Mr).click();
	}

	public void Mrs() {
		Driver.findElement(Mrs).click();
	}
	public void Dob(String dob) {
		Driver.findElement(Dob).sendKeys(dob);
	}
	public void Address(String address) {
		Driver.findElement(Address).sendKeys(address);
	}

	public void City (String city) {
		Driver.findElement(City).sendKeys(city);

	}

	public void State(String state) {
		Driver.findElement(State).sendKeys(state);
	}

	public void Pin(String pin) {
		Driver.findElement(Pin).sendKeys(pin);
	}

	public void Phone(String phone) {
	Driver.findElement(Phone).sendKeys(phone);
	}

	public void Email (String email) {
		Driver.findElement(Email).sendKeys(email);
	}
	public void Submit() {
		Driver.findElement(Submit).click();
	}

	public void Refresh() {
		Driver.navigate().refresh();
	}

	public void Alert() {
		Driver.switchTo().alert().accept();
	}


	public void GTPL_bank(String userid, String password, String name, String dob, String address, String city, String state, String pin, String phone, String email) throws InterruptedException {
		this.Title();
		this.Userid(userid);
		this.Password(password);
		Thread.sleep(2000);
		this.Login();
		Thread.sleep(2000);
		this.Newcustomer();
		this.Name(name);
		this.Mrs();
		this.Dob(dob);
		this.Address(address);
		this.City(city);
		this.State(state);
		this.Pin(pin);
		this.Phone(phone);
		this.Email(email);
		this.Submit();
		Thread.sleep(3000);
		this.Alert();
	}



	}