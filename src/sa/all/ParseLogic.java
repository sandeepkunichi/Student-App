package sa.all;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ParseLogic {

	public List<String> getList(String usn) throws ParserConfigurationException, SAXException, IOException {
		File stocks = new File("result.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(stocks);
		doc.getDocumentElement().normalize();
		NodeList nodes = doc.getElementsByTagName("record");
		List<String> sList = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);				
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					if(getValue("USNNO",element).equals(usn)){
						sList.add(getValue("USNNO",element));
						sList.add(getValue("NAME",element));
						sList.add(getValue("ISem",element));
						sList.add(getValue("Grade1",element));
						sList.add(getValue("IISem",element));
						sList.add(getValue("Grade2",element));
						sList.add(getValue("IIISem",element));
						sList.add(getValue("Grade3",element));
						sList.add(getValue("IVSem",element));
						sList.add(getValue("Grade4",element));
					}
				}	
		}
		return sList;
	}

	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}
}
