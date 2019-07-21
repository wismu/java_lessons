package ru.sandbox;

public class Equation {

  private double a;
  private double b;
  private double c;

  private double n;

  public Equation(double a, double b, double c) {

    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

    if (a != 0) {
      if (d > 0) {
        n = 2;
      } else if (d == 0) {
        n = 1;
      } else {
        n = 0;
      }
    } else
      if (b != 0) {
        n = 1; }
      else if (c != 0) {
      n = 0;
    } else {
      n = -1;
      }

  }

    public int rootNubmer () {
      return (int) n;
    }
  }

