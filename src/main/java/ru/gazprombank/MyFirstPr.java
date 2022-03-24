package ru.gazprombank;

public class MyFirstPr {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(-2, -2);

        System.out.println("Расстояние между точкой p1(" + p1.x + "," + p1.y + ")" + " и " + "точкой p2(" + p2.x + "," + p2.y + ") = " + distance(p1, p2));
        System.out.println("Расстояние между точкой p1(" + p1.x + "," + p1.y + ")" + " и " + "точкой p2(" + p2.x + "," + p2.y + ") = " + p1.distancePoint(p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }
}

