package ru.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("Igor group", "stroka 1", "stroka 2"));
    app.getNavigationHelper().gotoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before +1);


  }

}
