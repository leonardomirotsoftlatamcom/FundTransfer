package fundtransfer.test;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.CacheLookup; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;


public class FundTransferPage {

	@FindBy(id = "payee")  
	@CacheLookup
	public WebElement payeeField;

	@FindBy(id = "amount")  
	public WebElement amountField;
 
	@FindBy(id = "transfer")  
	public WebElement transferButton;
 
	@FindBy(id = "message")  
	public WebElement messageLabel;

	public FundTransferPage (WebDriver driver) {
		if(!"Online Fund Transfers".equals(driver.getTitle()))   
			throw new IllegalStateException("This is not Fund Transfer Page");   
		PageFactory.initElements(driver, this);   
	}  
}
