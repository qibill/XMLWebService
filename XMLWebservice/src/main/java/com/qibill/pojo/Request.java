package com.qibill.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Request {

	//系统识别码(固定值) 16a839ed-b5f1-4148-b9a3-dab942a072e4
	private String hashKey;
	//卡号 
	private String CardNo;

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

}
