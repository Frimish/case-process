package com.bm.process.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 
* @Package com.bm.process.pojo 
* @Title: UserEntity.java   
* @Description: 用户对象
* @author Frimish  
* @date 2018年6月7日 下午4:56:59
* @version V1.0
 */
@ApiModel(value = "UserEntity", description = "用户信息")
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty("用户id")
	private String id;
	private String name;
	private String pwd;
	private String corpId;
	private String corpName;
	private String loginName;
	private String orgLevCode;
	private String gh;
	private String lineLev1Code;//所属业务条线
	private String lineLev1Name;
	private String lineLev3Code;
	private String lineLev3Name;
	private String depart_code;
	private String depart_name;
	private String jsmc;
	private String sfzh;
	private byte[] zp;
	private String imgPath;
	private String positionId;
	//增加字段证书验证     ysc  2018/4/4
	private String certdn;

	public String getCertdn() {
		return certdn;
	}

	public void setCertdn(String certdn) {
		this.certdn = certdn;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getLineLev3Code() {
		return lineLev3Code;
	}

	public void setLineLev3Code(String lineLev3Code) {
		this.lineLev3Code = lineLev3Code;
	}

	public String getLineLev3Name() {
		return lineLev3Name;
	}

	public void setLineLev3Name(String lineLev3Name) {
		this.lineLev3Name = lineLev3Name;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public byte[] getZp() {
		return zp;
	}

	public void setZp(byte[] zp) {
		this.zp = zp;
	}

	public String getDepart_name() {
		return depart_name;
	}

	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}

	public String getJsmc() {
		return jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getOrgLevCode() {
		return orgLevCode;
	}

	public void setOrgLevCode(String orgLevCode) {
		this.orgLevCode = orgLevCode;
	}

	public String getGh() {
		return gh;
	}

	public void setGh(String gh) {
		this.gh = gh;
	}

	public String getLineLev1Code() {
		return lineLev1Code;
	}

	public void setLineLev1Code(String lineLev1Code) {
		this.lineLev1Code = lineLev1Code;
	}

	public String getLineLev1Name() {
		return lineLev1Name;
	}

	public void setLineLev1Name(String lineLev1Name) {
		this.lineLev1Name = lineLev1Name;
	}

	public String getDepart_code() {
		return depart_code;
	}

	public void setDepart_code(String depart_code) {
		this.depart_code = depart_code;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

}
