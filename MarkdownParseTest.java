import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void firstTest() throws IOException{
        Path fileName = Path.of("C:\\Users\\Azaka\\Downloads\\Snippet1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(),links);
    }

    @Test
    public void secondTest() throws IOException{
        Path fileName = Path.of("C:\\Users\\Azaka\\Downloads\\Snippet2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(),links);
    }
    
    @Test
    public void thirdTest() throws IOException{
        Path fileName = Path.of("C:\\Users\\Azaka\\Downloads\\Snippet3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(),links);
    }
}