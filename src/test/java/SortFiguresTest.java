import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortFiguresTest {

    @Test
    public void sortByVolume() {
        //write unit test here

        List<Shape> test = new ArrayList<>();
        test.add(new Cube(3));
        test.add(new Cube(2));
        test.add(new Cube(1));
        test.add(new Ball(3));
        test.add(new Ball(2));
        test.add(new Ball(1));
        test.add(new Cylinder(3, 3));
        test.add(new Cylinder(2, 2));
        test.add(new Cylinder(1, 1));

        List<Shape> expected = new ArrayList<>();
        expected.add(new Cube(1));
        expected.add(new Cylinder(1, 1));
        expected.add(new Ball(1));
        expected.add(new Cube(2));
        expected.add(new Cylinder(2, 2));
        expected.add(new Cube(3));
        expected.add(new Ball(2));
        expected.add(new Cylinder(3, 3));
        expected.add(new Ball(3));

        assertEquals(SortFigures.sortByVolume(test),expected);
    }
}