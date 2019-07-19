package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.addressbook.appmanager.ApplicationManager;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class TestBase extends ApplicationManager {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
//    wd = app.wd;
  }

//  @BeforeMethod(alwaysRun = true)
//  public void setUp() throws Exception {
//    wd = new FirefoxDriver();
//    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    wd.get("http://localhost/addressbook/");
//    login("admin", "secret");
//  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

//  @AfterMethod(alwaysRun = true)
//  public void tearDown() throws Exception {
//    wd.quit();
//
//  }

}
