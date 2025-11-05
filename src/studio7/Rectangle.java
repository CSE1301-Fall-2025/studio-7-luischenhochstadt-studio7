package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    // instance variables
    private int length;
    private int height;
    private int area;

    // constructors
    public Rectangle(int initLength, int initHeight) {
        length = initLength;
        height = initHeight;
        area = initLength * initHeight;
    }

    // methods
    // square? & draw
    public int area() {
        return area;
    }

    public boolean isOtherSmaller(Rectangle other) {
        if (other.area() > area) {
            return false;
        } else {
            return true;
        }
    }

    public boolean square() {
        if (length == height) {
            System.out.println("True");
            return true;
        }
        return false;
    }

    public void drawRectangle() {
        StdDraw.rectangle(0.5, 0.5, length / 2, height / 2);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 4);
        r1.square();

    }

}
