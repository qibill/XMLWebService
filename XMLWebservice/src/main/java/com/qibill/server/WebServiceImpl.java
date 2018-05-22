package com.qibill.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.qibill.pojo.Request;

@WebService(targetNamespace="http://Parameter.qibill.com",
serviceName="XMLWebService",
name="parameter")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class WebServiceImpl implements XMLWebService{

	@Override
	public @WebResult(name="rspXml")String patientDetailInfo(@WebParam(name="requestXml")String clientXml) throws Exception {
        //客户端传过来的是一个xml，条件都在xml里
        Request parameter = parseXml(clientXml);
        //把结果也要转换成一个xml，返回给客户端
        List<Request> parameters = new ArrayList<>();
        return create(parameters);
	}

	
    private String create(List<Request> Parameters) {
        Document rspXml = DocumentHelper.createDocument();
        Element root = DocumentHelper.createElement("result");
        rspXml.setRootElement(root);
        if(Parameters != null && Parameters.size() > 0){
            for (Request temp : Parameters) {
                Element Parameter = root.addElement("Parameter");
                Element amount = Parameter.addElement("amount");
                amount.addText(temp.getHashKey() + "");
                amount.addAttribute("precision", "2");
                Element tax = Parameter.addElement("tax");
                tax.addText(temp.getCardNo() + "");
                tax.addAttribute("precision", "2");
            }
        }
        return rspXml.asXML();
    }

    private Request parseXml(String clientInfo) throws Exception{
        Document doc = DocumentHelper.parseText(clientInfo);
        String hashKey = doc.selectSingleNode("/Parameter/hashKey").getText();
        String cardNo = doc.selectSingleNode("/Parameter/CardNo").getText();
        Request temp = new Request();
        temp.setHashKey(hashKey);;
        temp.setCardNo(cardNo);;
        return temp;
    }
}
