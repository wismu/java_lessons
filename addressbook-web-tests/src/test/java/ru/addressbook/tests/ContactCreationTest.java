package ru.addressbook.tests;

import org.testng.annotations.*;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testNewContactCreation() throws Exception {
    app.getContactHelper().initNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Igor", "Andreevich", "Mashkov", "markitu", "Moscow, Kremlin, 3", "+79250000000", "admin@mail.ru"));
    app.getContactHelper().fillBirthdayDataForm(new ContactBirthday("10", "February", "1990"));
    app.getContactHelper().gotoHomePage();
  }

}
