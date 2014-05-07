package main;


import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;
import main.XMLToJSON;
import main.XMLToJSONException;

public class Test_1 {

	public static void main(String[] args) throws JSONException, 
			SAXException, IOException, XMLToJSONException{
		String jsonStr = XMLToJSON.convert(new File("C:/Users/Jason/Documents/Eclipse Workspace/XmlToJson/src/main/books.xml"));
		/*
		 * JSONObject 是一个JSON对象的java实现
		 * 可以通过用一个有效的JSON字符串来构造JSON对象
		 * 下面的两行代码通过转换而来的JSON字符串构造了一个JSON对象,
		 * 并且打印出了这个JSON对象的带有缩进的字符串表示
		 */
		JSONObject jsonObj = new JSONObject(jsonStr);
		System.out.println(jsonObj.toString(2));
	}
}