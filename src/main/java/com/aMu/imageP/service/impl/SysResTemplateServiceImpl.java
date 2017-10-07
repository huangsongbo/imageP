package com.aMu.imageP.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aMu.imageP.dao.SysResTemplateMapper;
import com.aMu.imageP.domain.SysResTemplate;
import com.aMu.imageP.domain.resultMap.SysResTemplateResultMap;
import com.aMu.imageP.domain.search.SysResTemplateSearch;
import com.aMu.imageP.service.SysResTemplateService;

@Service("SysResTemplateService")
public class SysResTemplateServiceImpl implements SysResTemplateService{

	@Autowired
	private SysResTemplateMapper sysResTemplateMapper;
	
	@Override
	public List<SysResTemplateResultMap> getList(SysResTemplateSearch sysResTemplateSearch) {
		
		// 参数验证 ->start
		if(sysResTemplateSearch == null) {
			return null;
		}
		// 参数验证 ->end
		
		return sysResTemplateMapper.getList(sysResTemplateSearch);
		/*List<SysResTemplate> list = new ArrayList<SysResTemplate>();
		list.add(sysResTemplateMapper.selectByPrimaryKey(1L));
		return list;*/
	}
	
}
