package ru.netology.LoginPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashbordPage {
    private final SelenideElement heading = $("[data-test-id='dashboard']");

    public DashbordPage() {
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }
}
