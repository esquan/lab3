import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    @Test
    public void testFilter() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("unicorn");
        list1.add("jump");
        list1.add("garage");
        list1.add("lee");
        list1.add("joe");

        StringChecker sc = new ListExamples();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("jump");
        list2.add("lee");
        list2.add("joe");

        assertEquals(list2, ListExamples.filter(list1, sc));
    }

    @Test
    public void testMerge() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        StringChecker sc = new ListExamples();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("a");
        list3.add("b");
        list3.add("b");
        list3.add("c");
        list3.add("c");
        list3.add("d");
        list3.add("e");

        assertEquals(list3, ListExamples.merge(list1, list2));


    }
}
