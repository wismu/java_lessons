package ru.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreationg();
    fillGroupForm(new GroupData("Igor group", "Test 2", "Test 3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
