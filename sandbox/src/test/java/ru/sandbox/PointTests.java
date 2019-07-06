package ru.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint() {
    Point p1 = new Point(2,2);
    Point p2 = new Point(6,6);

   assert p2.distance(p1) == 5.656854249492381;
    Assert.assertEquals(p1.distance(p2), 5.656854249492381);

  }
}
