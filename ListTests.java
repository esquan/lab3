import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    @Test
    public void testFilter() {
        ArrayList<String> list1 = new ArrayList<>();
        StringChecker sc = new ListExamples();

        ArrayList<String> list2 = new ArrayList<>();

        assertEquals(list2, ListExamples.filter(list1, sc));
    }

    @Test
    public void testMerge() {

    }
}
