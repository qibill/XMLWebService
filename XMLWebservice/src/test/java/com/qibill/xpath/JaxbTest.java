package com.qibill.xpath;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import com.qibill.pojo.Head;
import com.qibill.pojo.Report;
import com.qibill.pojo.Request;

public class JaxbTest {
	
	@Test
	public void beanToXML() {
		
		Report report = new Report();
		Head head = new Head();
		Request request = new Request();
		
		head.setParameter(request);
		report.setHead(head);
		

		request.setHashKey("16a839ed-b5f1-XXXX-b9a3-XXXXXXX72e4");
		request.setCardNo("135403000800151");
		try {
			JAXBContext context = JAXBContext.newInstance(Report.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(report, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
