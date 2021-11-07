package ru.zenicko.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    @BeforeAll
    static void setSizeBrowser(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void testShouldBeCodeJUnit5OnPageGithubSelenideWikiSoftAssertions(){
        //Откройте страницу Github
        open("https://github.com/selenide/selenide");

        //Откройте страницу Selenide в Github
        //$("[name=q]").setValue("Selenide").pressEnter();
        //$(".repo-list").$("li").$("a").shouldBe(attribute("href", "https://github.com/selenide/selenide")).click();
        //$(".repo-list li a").shouldBe(attribute("href", "https://github.com/selenide/selenide")).click();

        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$(".wiki-rightbar li").last().$("button").click();

        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        //$$("a").filterBy(text("SoftAssertions")).first().click();
        $$("a").findBy(text("SoftAssertions")).click();

        $("body").shouldHave(text("Using JUnit5 extend test class:"));
        $(new ByText("Using JUnit5 extend test class:")).shouldBe(visible);
    }
}
