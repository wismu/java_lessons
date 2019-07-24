package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification()        {
    app.getContactHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Petrovich", "Ivanov", "markitu", "Moscow, Kremlin, 3", "+79250000000", "admin@mail.ru", null), false);
    app.getContactHelper().updateContact();
    app.getContactHelper().gotoHomePage();

  }
}
