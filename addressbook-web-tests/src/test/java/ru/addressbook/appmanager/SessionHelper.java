package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

  public SessionHelper(WebDriver wd) {

    super(wd);
    this.wd = wd;
  }

  public void login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
