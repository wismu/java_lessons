package ru.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testContactDeletion() {
    app.getContactHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().deleteContact();
    app.getContactHelper().gotoHomePage();
  }
}
