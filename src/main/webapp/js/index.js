var featherEditor = new Aviary.Feather({
	apiKey : '2582737667@qq.com',// apikey可以免费申请，https://creativesdk.adobe.com/docs/web/#/index.html
	apiVersion : 3,
	theme : 'light', // Check out our new 'light' and 'dark' themes!
	tools : 'text',// 这里设置为all，可以显示所有的工具
	initTool : 'text',// 默认展开的工具
	language : 'zh_HANS',// 简体中文
	appendTo : '',
	onSave : function(imageID, newURL) {
		alert("success");
	},
	onError : function(errorObj) {
		alert(errorObj.message);
	}
});

function launchEditor(id, src) {
	featherEditor.launch({
		image : id,
		url : src
	});
	return false;
}