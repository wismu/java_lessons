package ru.addressbook.tests;

import org.testng.annotations.*;
import ru.addressbook.model.ContactBirthday;
import ru.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    public void testNewContactCreation() throws Exception {
    app.getContactHelper().initNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Igor", "Andreevich", "Mashkov", "markitu", "Moscow, Kremlin, 3", "+79250000000", "admin@mail.ru", "Igor group"), true);
    app.getContactHelper().fillBirthdayDataForm(new ContactBirthday("11", "February", "1990"));
    app.getContactHelper().gotoHomePage();
    }

}
