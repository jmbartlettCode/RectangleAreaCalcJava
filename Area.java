/*
 * Josh Bartlett
 * Assignment 1.4
 * This program displays the area and perimeter of a rectangle that has given 
 * measurements
 */

public class Area {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = (2 * width) + (2 * height);
        System.out.print("Area: ");
        System.out.println(area);
        System.out.print("Perimeter: ");
        System.out.println(perimeter);
    } 
}
