import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{
    @Test
    public void filter(){
        List<String> testList = new ArrayList<>();
        testList.add("baseball");
        testList.add("volleyball");
        testList.add("soccer");
        List<String> expected = new ArrayList<>();
        expected.add("baseball");
        expected.add("volleyball");
        StringChecker s = new Checker();
        assertEquals(expected,ListExamples.filter(testList,s));
    }

    @Test
    public void merge(){
        
    }    
}