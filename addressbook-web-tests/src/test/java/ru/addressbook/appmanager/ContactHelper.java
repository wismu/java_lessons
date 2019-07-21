package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

public class ContactHelper  extends BaseHelper{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillBirthdayDataForm(ContactBirthday contactBirthday) {
        bday(contactBirthday);
        bmonth(contactBirthday);
        byear(contactBirthday, By.name("byear"));
        confirm();
    }

    private void confirm() {
        click(By.xpath("(//input[21])"));
    }

    private void bmonth(ContactBirthday contactBirthday) {
        click(By.xpath("(//option[@value='February'])"));
    }

    private void byear(ContactBirthday contactBirthday, By year) {
        type(year, contactBirthday.getYear());
    }

    private void bday(ContactBirthday contactBirthday) {
        click(By.xpath("(//option[@value='10'])"));
        click(By.name("bmonth"));
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
        click(By.name("bday"));
    }

    private void email(ContactData contactData) {
        type(By.name("email"), contactData.getEmail());
    }

    private void mobile(ContactData contactData) {
        type(By.name("mobile"), contactData.getPhone());
    }

    private void address(ContactData contactData) {
        type(By.name("address"), contactData.getAddress());
    }

    private void nickname(ContactData contactData) {
        type(By.name("nickname"), contactData.getNickname());
    }

    private void lastname(ContactData contactData) {
        type(By.name("lastname"), contactData.getLastname());
    }

    private void middlename(ContactData contactData) {
        type(By.name("middlename"), contactData.getMiddlename());
    }

    private void firstname(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
    }

    public void initNewContact() {
        click(By.linkText("add new"));
    }

    public void gotoHomePage() {
        click(By.linkText("home page"));
    }
}
