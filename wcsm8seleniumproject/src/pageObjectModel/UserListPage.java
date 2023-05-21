package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	public static void main(String[] args) {
		@FindBy(xpath= "//input[@value=Creat new User") private WebElement createUser;
	}

}
