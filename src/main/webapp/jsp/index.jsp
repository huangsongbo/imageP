<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>美图WEB开放平台</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="http://open.web.meitu.com/sources/xiuxiu.js"
	type="text/javascript"></script>
<!-- 提示:: 如果你的网站使用https, 将xiuxiu.js地址的请求协议改成https即可 -->
<script type="text/javascript">
	function meituClick() {
		/*第1个参数是加载编辑器div容器，第2个参数是编辑器类型，第3个参数是div容器宽，第4个参数是div容器高*/
		// 默认跳转到文字编辑页面
		xiuxiu.setLaunchVars ("nav", "decorate/text");
		xiuxiu.embedSWF("altContent", 3, "100%", "100%");
		//修改为您自己的图片上传接口
		xiuxiu.setUploadURL("http://web.upload.meitu.com/image_upload.php");
		xiuxiu.setUploadType(2);
		xiuxiu.setUploadDataFieldName("upload_file");
		xiuxiu.onInit = function() {
			xiuxiu.loadPhoto("http://open.web.meitu.com/sources/images/1.jpg");
		}
		xiuxiu.onUploadResponse = function(data) {
			//alert("上传响应" + data);  可以开启调试
			console.log(data);
			alert("");
		} 
	}
</script>
<style type="text/css">
html, body {
	height: 100%;
	overflow: hidden;
}

body {
	margin: 0;
}
</style>
</head>
<body>
	<div>
		<input id="meituButton" type="button" value="meitu" onclick="meituClick()" />
	</div>
	<div id="altContent">
		<h1>美图秀秀</h1>
	</div>
</body>
</html>