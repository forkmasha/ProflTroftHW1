import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortFigures {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cube(1));
        shapes.add(new Cube(2));
        shapes.add(new Cube(3));
        shapes.add(new Ball(1));
        shapes.add(new Ball(2));
        shapes.add(new Ball(3));
        shapes.add(new Cylinder(1, 1));
        shapes.add(new Cylinder(2, 2));
        shapes.add(new Cylinder(3, 3));
        System.out.println(Arrays.toString(sortByVolume(shapes).toArray()));
    }

    static List<Shape> sortByVolume(List<Shape> shapes) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape instanceof Cube) {
                result.add(shape);
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Ball) {
                result.add(shape);
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Cylinder) {
                result.add(shape);
            }
        }
        result.sort(Comparator.comparingDouble(Shape::getVolume));
        return result;
    }

    public static abstract class Shape {
        abstract double getVolume();
    }

    static class Cube extends Shape {
        private double side;

        public Cube(double side) {
            this.side = side;
        }

        @Override
        double getVolume() {
            return side * side * side;
        }

        @Override
        public String toString() {
            return "Cube{" +
                    "side=" + side +
                    '}';
        }
    }

    static class Ball extends Shape {
        private double radius;

        public Ball(double radius) {
            this.radius = radius;
        }

        @Override
        double getVolume() {
            return 4.0 / 3.0 * Math.PI * radius * radius * radius;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "radius=" + radius +
                    '}';
        }
    }

    static class Cylinder extends Shape {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        double getVolume() {
            return Math.PI * radius * radius * height;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "radius=" + radius +
                    ", height=" + height +
                    '}';
        }
    }
}