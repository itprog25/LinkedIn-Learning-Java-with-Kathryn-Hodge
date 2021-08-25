package Classes;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println("Area of Triangle A is " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("Area of Triangle B is "+ triangleBArea);

        System.out.println(triangleA.sideLenOne);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);
    }
}