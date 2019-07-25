package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() {
        app.getContactHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Igor", "Andreevich", "Mashkov", "markitu", "Moscow, Kremlin, 3", "+79250000000", "admin@mail.ru", "Igor group"), true);
           }
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContact();
        app.getContactHelper().gotoHomePage();
    }
}
