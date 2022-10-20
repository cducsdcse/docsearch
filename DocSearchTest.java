import java.util.*;
import static org.junit.Assert.*;
import java.net.URI;import java.net.URISyntaxException;

//write start.sh and test.sh
public class DocSearchTest{
    public void testDocSearch() throws URISyntaxException{
        Handler h = new Handler();
        URI increment = new URI("http://localhost/increment");
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handlerRequest());
    }
}
