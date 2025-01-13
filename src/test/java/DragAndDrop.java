import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Keys;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("");
        actions().moveToElement($("#column-a")).perform();
        actions().keyDown(Keys.SHIFT).click($("#column-a")).keyUp(Keys.SHIFT).perform();
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();



    }
}
