package demo;

import org.junit.Test;

import com.github.davidmoten.rtree.RTree;
import com.github.davidmoten.rtree.geometry.Geometries;
import com.github.davidmoten.rtree.geometry.Point;

public class ThingTest {

    @Test
    public void testUseRtree() {
        RTree<String, Point> tree = RTree.<String, Point>create() //
                .add("fred", Geometries.point(5, 10)) //
                .add("john", Geometries.point(5, 10));
        tree.entries().forEach(System.out::println);
    }

}
