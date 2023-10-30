package activities.contact;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateContactScreen {

    public TextBox nameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));
    public TextBox phoneTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));

}
