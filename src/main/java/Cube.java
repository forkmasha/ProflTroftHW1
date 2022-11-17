import java.util.Objects;

class Cube extends Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;

        Cube cube = (Cube) o;

        return Double.compare(cube.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

}
