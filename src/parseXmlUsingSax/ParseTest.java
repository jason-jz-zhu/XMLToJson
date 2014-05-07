package parseXmlUsingSax;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import junit.framework.TestCase;
import parseXml.Book;

public class ParseTest extends TestCase{

	public void testSAX() throws Throwable{
		SaxParseService sax = new SaxParseService();
		InputStream input = 
				new FileInputStream(new File("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/parseXml/books.xml"));
				//this.getClass().getClassLoader().getResourceAsStream("book.xml");
		List<Book> books = sax.getBooks(input);
		for(Book book : books){
			System.out.println(book.toString());
		}
	}
}
