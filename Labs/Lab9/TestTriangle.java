package Package;

import Package.Triangle;
import Package.GeometricObject;

public class TestTriangle {

    public static void main(String[] args) {

        Triangle t1;
        try {
            t1 = new Triangle(1, 1, 2000);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

    }

}