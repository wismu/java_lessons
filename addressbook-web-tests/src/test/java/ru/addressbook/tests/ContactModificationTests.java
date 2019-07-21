package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification()        {
    app.getContactHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Петрович", "Иванов", "markitu", "Moscow, Kremlin, 3", "+79250000000", "admin@mail.ru"));
    app.getContactHelper().updateContact();
    app.getContactHelper().gotoHomePage();

  }
}