import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortFiguresTest {

    @Test
    public void sortByVolume() {
        //write unit test here

        List<SortFigures.Shape> test = new ArrayList<>();
        test.add(new SortFigures.Cube(3));
        test.add(new SortFigures.Cube(2));
        test.add(new SortFigures.Cube(1));
        test.add(new SortFigures.Ball(3));
        test.add(new SortFigures.Ball(2));
        test.add(new SortFigures.Ball(1));
        test.add(new SortFigures.Cylinder(3, 3));
        test.add(new SortFigures.Cylinder(2, 2));
        test.add(new SortFigures.Cylinder(1, 1));

        List<SortFigures.Shape> expected = new ArrayList<>();
        expected.add(new SortFigures.Cube(1));
        expected.add(new SortFigures.Cylinder(1, 1));
        expected.add(new SortFigures.Ball(1));
        expected.add(new SortFigures.Cube(2));
        expected.add(new SortFigures.Cylinder(2, 2));
        expected.add(new SortFigures.Cube(3));
        expected.add(new SortFigures.Ball(2));
        expected.add(new SortFigures.Cylinder(3, 3));
        expected.add(new SortFigures.Ball(3));


        assertEquals(expected, SortFigures.sortByVolume(test));

    }
}