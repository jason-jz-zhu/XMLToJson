package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;

public class XMLtoJSON {
	
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(new File("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/main/books.xml"));
				
		//InputStream iis = XMLtoJSON.class.getResourceAsStream("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/main/books.xml");
		
		String xml = IOUtils.toString(is);
		System.out.println(xml);

		XMLSerializer xmlSerializer = new XMLSerializer(); 
		
		JSON json = xmlSerializer.read(xml);  
		System.out.println(json.toString(1,1));
		

	}

}
