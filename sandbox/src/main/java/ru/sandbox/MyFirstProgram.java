package ru.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    //hello("world");

    //Square s = new Square(5);
    //System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    //Rectangle r = new Rectangle(4,8);
    //System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


    Point p1 = new Point(6.0,6.0);
    Point p2 = new Point (2.0,2.0);
    //System.out.println("Координаты первой точки равны: " +"(" + p1.x +":" + p1.y + ")");
    //System.out.println("Координаты второй точки равны: " +"(" + p2.x +":" + p2.y + ")");
    System.out.println("Расстояние между точками равно:  " + distance(p1,p2));

  }

  //public static void hello(String somewhat) {
   // System.out.println("Hello, " + somewhat + "!");
  //}

    public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    }
  }