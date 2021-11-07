package ru.zenicko.herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HerokuApp {
    @BeforeAll
    static void setSizeBrowser() {
        Configuration.browserSize = "400x400";
    }
    @Test
    void dragAndDropToRectangles() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("header").shouldHave(text("A"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("header").shouldHave(text("B"));
    }
}
