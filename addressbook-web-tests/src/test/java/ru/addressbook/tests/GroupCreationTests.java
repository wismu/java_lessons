package ru.addressbook.tests;

import org.testng.annotations.*;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreationg();
    app.getGroupHelper().fillGroupForm(new GroupData("Igor group", "Test 2", "Test 3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
