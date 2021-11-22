import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import org.testng.asserts.SoftAssert;

public class SelenideBasics2Test {

    @Test
    public void firstTest() {
        open("https://demoqa.com/books");

        ElementsCollection Elements = $$(".rt-tr-group").
                filterBy(Condition.and("Book Name", Condition.text("O'Reilly Media"), Condition.text("Javascript")));


        SoftAssert softAssert = new SoftAssert();
        int ElSize = Elements.size();
        System.out.println(ElSize);
        softAssert.assertEquals(ElSize, 10);
    }

}