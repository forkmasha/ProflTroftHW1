import java.util.*;

public class SortFigures {
    static List<Shape> sortByVolume(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::getVolume));
        return shapes;
    }


}