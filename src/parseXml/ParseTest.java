package parseXml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import junit.framework.TestCase;

public class ParseTest extends TestCase{

	public void testDom() throws Exception{
		InputStream input = 
				new FileInputStream(new File("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/parseXml/books.xml"));
				//this.getClass().getClassLoader().getResourceAsStream("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/parseXml/books.xml");
		DomParseService dom = new DomParseService();
		List<Book> books = dom.getBooks(input);
		for(Book book : books){
			System.out.println(book.toString());
		}
	}
}