package ru.gazprombank;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distancePoint(Point p1){
        return Math.sqrt(((p1.x - this.x) * (p1.x - this.x))+ ((p1.y - this.y) * (p1.y - this.y)));
    }
}
