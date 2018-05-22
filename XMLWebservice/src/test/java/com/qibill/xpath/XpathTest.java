package com.qibill.xpath;

import org.dom4j.DocumentException;
import org.junit.Test;

public class XpathTest {
	
	@Test
	public void testParseMethod1() throws DocumentException {
		DomParser.parseMethod1();
	}

	@Test
	public void testParseMethod2() throws DocumentException {
		DomParser.parseMethod2();
	}

	@Test
	public void testGenerate() {
		DomParser.generate();
	}
}
