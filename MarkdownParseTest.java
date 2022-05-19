import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    /**@Test
    public void testTestFile() throws IOException{
        String fileName = Files.readString(Path.of("MarkdownParseTest.java"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }**/

    @Test
    public void testTest2File() throws IOException{
        String fileName = Files.readString(Path.of("file2.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-page.html");

        assertEquals(expectedLinks, listOfLinks);
    
    }

    @Test
    public void testTest3File() throws IOException{
        String fileName = Files.readString(Path.of("test-file3.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }

    @Test
    public void testTest4File() throws IOException{
        String fileName = Files.readString(Path.of("test-file4.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }

    @Test
    public void testTest5File() throws IOException{
        String fileName = Files.readString(Path.of("test-file5.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }

    @Test
    public void testTest6File() throws IOException{
        String fileName = Files.readString(Path.of("test-file6.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }

    @Test
    public void testTest7File() throws IOException{
        String fileName = Files.readString(Path.of("test-file7.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }

    @Test
    public void testTest8File() throws IOException{
        String fileName = Files.readString(Path.of("test-file8.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        ArrayList<String> expectedLinks = new ArrayList<String>();

        assertEquals(expectedLinks, listOfLinks);
    }
}

