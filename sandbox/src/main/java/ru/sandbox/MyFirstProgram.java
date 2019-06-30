package ru.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");
    hello("igoryan");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,8);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somewhat) {
    System.out.println("Hello, " + somewhat + "!");
  }
}