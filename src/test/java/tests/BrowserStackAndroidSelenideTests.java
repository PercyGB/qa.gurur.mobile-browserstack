package tests;

import annotations.JiraIssue;
import annotations.JiraIssues;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class BrowserStackAndroidSelenideTests extends TestBase {
    @Test
    @DisplayName("Successful search in wikipedia android app")
    @JiraIssues({@JiraIssue("HOM-237")})
    void searchTest() {
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
        });
        step("Verify content found", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Successful navigation to GitHub article")
    @JiraIssues({@JiraIssue("HOM-237")})
    void searchGitHubTest() {
        step("Type github", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("github");
        });
        step("Verify content found", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));

        step("Navigate to first link at search results", () ->
            $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).first().click());
        step("Check the title of the article", () ->
            $(MobileBy.id("org.wikipedia.alpha:id/view_page_title_text")).shouldHave(text("GitHub")));
    }

    @Test
    @DisplayName("Check Login option at menu")
    @JiraIssues({@JiraIssue("HOM-237")})
    void loginOptionCheck() {
        step("Wait while Wikipedia is opened", () ->
            $(MobileBy.AccessibilityId("Search Wikipedia")).shouldBe(visible));
        step("Open menu", () ->
            $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click());
       step("Check Log in to Wikipedia option", () ->
            $(MobileBy.id("org.wikipedia.alpha:id/explore_overflow_account_name")).shouldHave(text("Log in to Wikipedia")));
    }
}
