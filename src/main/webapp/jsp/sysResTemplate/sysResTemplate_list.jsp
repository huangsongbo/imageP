<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.aMu.imageP.constant.SysPropertiesConstant" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	    <title>首页</title>
	    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery/jquery-1.9.1.js"></script>
	    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery/jquery.validate.js"></script>
	    <script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap/bootstrap.min.js"></script>
	    <%-- <script type="text/javascript">
	    	var fileDomainPath="<%=Utils.getUrlDomain()%>";
	    </script> --%>
	    <script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap/jquery.bootstrap.teninedialog.v3.js"></script>
	    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css" />
	</head>
	<body>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th style="width: 50px">序号</th>
						<th style="width: 100px">模版图片</th>
						<th style="width: 100px">模版名称</th>
						<th style="width: 100px">创建日期</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var = "item" items = "${list }" varStatus="status">
						<tr>
							<td>${status.count }</td>
							<td><img src="<%=SysPropertiesConstant.urlDomain%>${item.picUrl }" width="100px"></img></td>
							<td>${item.templateName }</td>
							<td><fmt:formatDate value="${item.gmtCreate }" pattern="yyyy年mm月dd日 hh:mm:ss"/></td>
							<!-- <td><a href = "#" onclick= "">编辑</a>&nbsp;&nbsp;</td> -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>