import java.util.Objects;

class Ball extends Shape {
    private final double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        return Double.compare(ball.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                '}';
    }
}
