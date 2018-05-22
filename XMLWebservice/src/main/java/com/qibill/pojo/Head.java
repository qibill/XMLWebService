package com.qibill.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Head {
	
	private Request parameter;

	public Request getParameter() {
		return parameter;
	}

	public void setParameter(Request parameter) {
		this.parameter = parameter;
	}
	
}
