package com.aMu.imageP.service;

import java.util.List;

import com.aMu.imageP.domain.resultMap.SysResTemplateResultMap;
import com.aMu.imageP.domain.search.SysResTemplateSearch;

public interface SysResTemplateService {

	/**
	 * 查询列表
	 * 
	 * @author 幕
	 * @param sysResTemplateSearch
	 * @return
	 */
	List<SysResTemplateResultMap> getList(SysResTemplateSearch sysResTemplateSearch);
	
}
