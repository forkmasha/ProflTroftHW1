import java.util.Objects;

class Cylinder extends Shape {
    private final double radius;
    private final double height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.radius, radius) != 0) return false;
        return Double.compare(cylinder.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }

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
