import javax.swing.*;

public class Ejercicio04 {
    public static void main(String[] args)
    {
        Point2D punto1 = new Point2D(1.0, 3.0);
        Point2D punto2 = new Point2D(5.0, 9.4);
        Line2D linea1 = new Line2D(punto1, punto2, "Rojo");
        System.out.println(linea1.toString());
    }
}

class Point2D
{
    private double x;
    private double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public Point2D getPoint2D()
    {
        return this;
    }

    public void getPoint2D(double x, double y)
    {
         this.x = x;
         this.y = y;
    }
}

class Line2D
{
    private Point2D p1;
    private Point2D p2;
    private String color;

    public Line2D() {
    }

    public Line2D(Point2D p1, Point2D p2, String color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public Line2D(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line2D(double x1, double y1, double x2, double y2, String color)
    {
        this.p1.setX(x1);
        this.p1.setY(y1);
        this.p2.setX(x2);
        this.p2.setY(y2);
        this.color = color;
    }

    public void setP1(double x, double y)
    {
        this.p1.setX(x);
        this.p1.setY(y);
    }

    public void setP2(double x, double y)
    {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String get_P1()
    {
        return p1.toString();
    }

    public String get_P2()
    {
        return p2.toString();
    }

    @Override
    public String toString() {
        return p1.toString() + " - " + p2.toString() + " Color: " + this.color;
    }
}

class Triangle
{
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    private boolean filled;

    public Triangle() {
    }

    public Triangle(Line2D line1, Line2D line2, Line2D line3, boolean filled) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.filled = filled;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, String color, boolean isfilled)
    {
       line1 = new Line2D(x1, y1, x2, y2, color);
       line2 = new Line2D(x1, y2, x3, y3, color);
       line3 = new Line2D(x3, y3, x1, y1, color);
       this.filled = isfilled;
    }

    public Triangle(Point2D a, Point2D b, Point2D c, String color, boolean isfilled)
    {
        line1 = new Line2D(a, b, color);
        line2 = new Line2D(b, c, color);
        line3 = new Line2D(c, a, color);
        this.filled = isfilled;
    }

    public void setLine1(double x1, double y1, double x2, double y2)
    {
        line1.setP1(x1, y1);
        line1.setP2(x2, y2);
    }
    // ...

    public void setLine1(Point2D p1, Point2D p2)
    {
        this.line1.setP1(p1);
        this.line1.setP2(p2);
    }
    // ...

    public String get_Line1()
    {
        return line1.toString();
    }
    // ...

    public Line2D getLine1() {
        return line1;
    }

    public void setLine1(Line2D line1) {
        this.line1 = line1;
    }

    public Line2D getLine2() {
        return line2;
    }

    public void setLine2(Line2D line2) {
        this.line2 = line2;
    }

    public Line2D getLine3() {
        return line3;
    }

    public void setLine3(Line2D line3) {
        this.line3 = line3;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "[" + line1.toString() + "," + line2.toString() + "," +line3.toString() + "]";
    }
}