jQuery(document).ready(function($) {
	var asd = {
            corpName: '山东省院',
            name: '王体功',
            pwd: '753qaZ$bm'
        };
	
    $('.login-middle').click(function(event) {
        jQuery.ajax({
            url: '/user/login',
            type: 'POST',
            dataType: 'json',
            data: { corpName: '山东省院',
            		corpId: '370000',
            		orgLevCode: '1',
		            name: '王体功',
		            pwd: '753qaZ$bm',
		            remember: '0'},
            complete: function(xhr, textStatus) {
            },
            success: function(data, textStatus, xhr) {
            	if(eval(data.data)==0){
        			alert("账号或密码错误！");
        		}else if(eval(data.data)>0){
        			alert("登录成功");
        		}
            },
            error: function(xhr, textStatus, errorThrown) {
                //called when there is an error
            }
        });
    });
});
