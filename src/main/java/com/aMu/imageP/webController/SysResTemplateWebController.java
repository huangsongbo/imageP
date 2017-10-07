package com.aMu.imageP.webController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aMu.imageP.domain.resultMap.SysResTemplateResultMap;
import com.aMu.imageP.domain.search.SysResTemplateSearch;
import com.aMu.imageP.service.SysResTemplateService;

@Controller
@RequestMapping("/sysResTemplate")
public class SysResTemplateWebController {

	@Autowired
	private SysResTemplateService sysResTemplateService;
	
	@RequestMapping("/list")
	public String jspList(
			HttpServletRequest request
			) {
		SysResTemplateSearch sysResTemplateSearch = new SysResTemplateSearch();
		List<SysResTemplateResultMap> list = sysResTemplateService.getList(sysResTemplateSearch);
		request.setAttribute("list", list);
		return "/jsp/sysResTemplate/sysResTemplate_list.jsp";
	}
	
}