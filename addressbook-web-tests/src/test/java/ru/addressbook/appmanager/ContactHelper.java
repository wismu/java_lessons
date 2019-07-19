package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

public class ContactHelper {

    protected WebDriver wd;

    public ContactHelper(WebDriver wd) {
        this.wd = wd;
            }

    public void fillBirthdayDataForm(ContactBirthday contactBirthday) {
        bday(contactBirthday);
        bmonth(contactBirthday);
        byear(contactBirthday, By.name("byear"));
        confirm();
    }

    private void confirm() {
        wd.findElement(By.xpath("(//input[21])")).click();
    }

    private void bmonth(ContactBirthday contactBirthday) {
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactBirthday.getMonth());
        wd.findElement(By.xpath("(//option[@value='February'])")).click();
    }

    private void byear(ContactBirthday contactBirthday, By year) {
        wd.findElement(year).click();
        wd.findElement(year).clear();
        wd.findElement(year).sendKeys(contactBirthday.getYear());
    }

    private void bday(ContactBirthday contactBirthday) {
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactBirthday.getDay());
        wd.findElement(By.xpath("(//option[@value='10'])")).click();
        wd.findElement(By.name("bmonth")).click();
    }

    public void fillContactForm(ContactData contactData) {
        firstname(contactData);
        middlename(contactData);
        lastname(contactData);
        nickname(contactData);
        address(contactData);
        mobile(contactData);
        email(contactData);
        birthday();
    }

    private void birthday() {
        wd.findElement(By.name("bday")).click();
    }

    private void email(ContactData contactData) {
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    private void mobile(ContactData contactData) {
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getPhone());
    }

    private void address(ContactData contactData) {
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    }

    private void nickname(ContactData contactData) {
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
    }

    private void lastname(ContactData contactData) {
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    }

    private void middlename(ContactData contactData) {
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    }

    private void firstname(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    }

    public void initNewContact() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void gotoHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }
}
