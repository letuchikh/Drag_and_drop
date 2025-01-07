import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class drag_and_drop  {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        Configuration.pageLoadStrategy = "eager";
    }

    @org.junit.jupiter.api.Test
    void fillFormTest() {
        open("");
        // Наводим курсор на элемент
        actions().moveToElement($("#column-a")).perform();
        //<div class="column" id="column-a" draggable="true"><header>A</header></div>
        // Кликаем на элемент с зажатым Shift
        actions().keyDown(Keys.SHIFT).click($("#column-a")).keyUp(Keys.SHIFT).perform();
        // Перетаскиваем элемент из одной позиции в другую
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();



    }
}
