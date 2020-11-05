package Сlasses.TheSimplestClassesAndObjects.Task7;

import java.util.Scanner;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
        System.out.println("There can be no triangle without points");
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public static Triangle buildTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates X and Y for three points of the triangle.");
        System.out.println("Enter the coordinates for point A:");
        System.out.print("x = ");
        int xPointA = scanner.nextInt();
        System.out.print("y = ");
        int yPointA = scanner.nextInt();
        System.out.println("Enter the coordinates for point B:");
        System.out.print("x = ");
        int xPointB = scanner.nextInt();
        System.out.print("y = ");
        int yPointB = scanner.nextInt();
        System.out.println("Enter the coordinates for point C:");
        System.out.print("x = ");
        int xPointC = scanner.nextInt();
        System.out.print("y = ");
        int yPointC = scanner.nextInt();
        Triangle triangle = new Triangle(new Point(xPointA, yPointA), new Point(xPointB, yPointB),
                new Point(xPointC, yPointC));
        return triangle;
    }

    public double distance2points(Point a, Point b){
        double distance = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
        return distance;
    }

    public double perimeter (){
        return distance2points(this.pointA, this.pointB) + distance2points(this.pointB, this.pointC) +
                distance2points(this.pointA, this.pointC);
    }
    public double area (){
        double area = 0.5 * Math.abs((this.pointB.getX() - this.pointA.getX()) *
                (this.pointC.getY() - this.pointA.getY()) - (this.pointC.getX() - this.pointA.getX()) *
                (this.pointB.getY() - this.pointA.getY()));
        return area;
    }
    public Point centroid (){
        Point centroid = new Point((this.pointA.getX() + this.pointB.getX() + this.pointC.getX()) / 3,
                (this.pointA.getY() + this.pointB.getY() + this.pointC.getY()) / 3);
        return centroid;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
