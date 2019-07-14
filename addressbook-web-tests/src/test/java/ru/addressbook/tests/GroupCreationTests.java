package ru.addressbook.tests;

import org.testng.annotations.*;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreationg();
    app.fillGroupForm(new GroupData("Igor group", "Test 2", "Test 3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
