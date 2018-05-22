package com.qibill.xpath;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.xpath.DefaultXPath;

public class DomParser {
	
	public static List<String> parseMethod1() throws DocumentException {
		List<String> result = new ArrayList<String>();

		SAXReader reader = new SAXReader();
		Document document = reader
				.read("D:\\eclipse-workspace\\XMLWebservice\\src\\test\\resources\\target.xml");
		XPath xPath = new DefaultXPath(
				"/resources/product[@name='QQ']/account[@id='987654321']/password");
		List<Element> list = xPath.selectNodes(document.getRootElement());
		for (Element element : list) {
			System.out.println(element.getTextTrim());
			result.add(element.getTextTrim());
		}
		return result;
	}

	public static List<String> parseMethod2() throws DocumentException {
		List<String> result = new ArrayList<String>();

		SAXReader reader = new SAXReader();
		Document document = reader
				.read("D:\\eclipse-workspace\\XMLWebservice\\src\\test\\resources\\target.xml");
		List<Element> products = document.getRootElement().selectNodes("/resources/product");
		Iterator iterator = products.iterator();
		while (iterator.hasNext()) {
			Element product = (Element) iterator.next();
			String name = product.attributeValue("name");
			System.out.println(name);
		}
		return result;
	}

	public static void generate() {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("resources");

		Element product = root.addElement("product");
		product.addAttribute("name", "QQ");

		Element account = product.addElement("account");
		account.addAttribute("id", "123456789");

		Element nickname = account.addElement("nickname");
		nickname.setText("QQ-account-1");

		Element password = account.addElement("password");
		password.setText("123asd21qda");

		Element level = account.addElement("level");
		level.setText("56");

		PrintWriter pWriter = null;
		XMLWriter xWriter = null;
		try {
			pWriter = new PrintWriter("D:\\eclipse-workspace\\XMLWebservice\\src\\test\\resources\\target.xml");
			xWriter = new XMLWriter(pWriter);
			xWriter.write(doc);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				xWriter.flush();
				xWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
