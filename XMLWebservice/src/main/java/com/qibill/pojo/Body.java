package com.qibill.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Body {

	private Response response;

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
}
