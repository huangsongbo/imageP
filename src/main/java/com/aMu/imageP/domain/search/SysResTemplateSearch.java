package com.aMu.imageP.domain.search;

import java.io.Serializable;

import com.aMu.imageP.domain.SysResTemplate;

public class SysResTemplateSearch extends SysResTemplate implements Serializable{
	
	private static final long serialVersionUID = 7806460607927403925L;

	private Long start;
	
	private Long limit;

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}
	
}
