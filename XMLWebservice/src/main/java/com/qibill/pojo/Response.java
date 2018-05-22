package com.qibill.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) 
public class Response {

	private String result;
	private String errMsg;
	private List DataTable;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List getDataTable() {
		return DataTable;
	}

	public void setDataTable(List dataTable) {
		DataTable = dataTable;
	}

}

class Patient {
	
	private String Patid;
	private String OutPatiNo;
	private String PatName;
	private String SexName;
	private String LastMense;
	private String Age;
	private String IdCardNo;
	private String Tel;
	private String Mobile;
	private String Height;
	private String Weight;
	private String ChildHistory;
	private String MedicalHistory;
	private String Flag;
	private String Msg;

	public String getPatid() {
		return Patid;
	}

	public void setPatid(String patid) {
		Patid = patid;
	}

	public String getOutPatiNo() {
		return OutPatiNo;
	}

	public void setOutPatiNo(String outPatiNo) {
		OutPatiNo = outPatiNo;
	}

	public String getPatName() {
		return PatName;
	}

	public void setPatName(String patName) {
		PatName = patName;
	}

	public String getSexName() {
		return SexName;
	}

	public void setSexName(String sexName) {
		SexName = sexName;
	}

	public String getLastMense() {
		return LastMense;
	}

	public void setLastMense(String lastMense) {
		LastMense = lastMense;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getIdCardNo() {
		return IdCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		IdCardNo = idCardNo;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getChildHistory() {
		return ChildHistory;
	}

	public void setChildHistory(String childHistory) {
		ChildHistory = childHistory;
	}

	public String getMedicalHistory() {
		return MedicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

}
