package ru.addressbook.tests;

import org.testng.annotations.*;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Igor group", "stroka 1", "stroka 2"));
//    app.getGroupHelper().initGroupCreation();
//    app.getGroupHelper().fillGroupForm(new GroupData("Igor group", "stroka 1", "stroka 2"));
//    app.getGroupHelper().submitGroupCreation();
//    app.getGroupHelper().returnToGroupPage();

  }

}
