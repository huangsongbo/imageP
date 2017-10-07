package com.aMu.imageP.domain.resultMap;

import java.io.Serializable;

import com.aMu.imageP.domain.SysResTemplate;

public class SysResTemplateResultMap extends SysResTemplate implements Serializable{

	private static final long serialVersionUID = -3260349552709735631L;
	
	private String picUrl;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
}
