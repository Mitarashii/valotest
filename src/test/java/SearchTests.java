import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void SelenideSearchTests() {
        // Открыть https://google.com
        open("https://google.com");

        // Ввести "Valorant" в поле поиска
        $("[name=q]").setValue("Valorant").pressEnter();

        // Проверить, что "playvalorant.com" появилось в результатах поиска
        $("#search").shouldHave(text("https://playvalorant.com"));
    }
}
