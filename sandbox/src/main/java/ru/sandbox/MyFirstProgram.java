package ru.sandbox;

import javax.xml.transform.Result;

public class MyFirstProgram {

  public static void main(String[] args) {



    check(0,0,0,0,0);
    check(1,0,0,0,1);
    check(0,1,0,0,1);
    check(0,0,1,0,1);
    check(0,0,0,1,1);

    Point p1 = new Point(2.0,2.0);
    Point p2 = new Point (6.0,6.0);

    System.out.println("Расстояние между точками равно:  " + Point.distance(p1,p2));

  }

    //public static double distance(Point p1, Point p2) {
    //return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    //}

    public static void check(double x1, double y1,double x2, double y2, double expected_distance) {

    Point p1 = new Point(x1,y1);
    Point p2 = new Point(x2,y2);

    double dist = Point.distance(p1,p2); //p1.distance(p2);

    if (dist == expected_distance) {
      System.out.println("Тест пройден!");
            }
    else {
      System.out.println("Тест упал!");
    }
    //System.out.println(dist);



    }





  }