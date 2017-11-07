 function validate(f){
        if(!(/^[0-9a-zA-Z]+$/.test(f.xmima.value))){
            alert("请输入数字或字母");
            f.xmima.value="";
            f.xmima.focus();
            return false;
            }
        if(!(f.xmima.value==f.password.value)){
            alert("确认密码与新密码不符");
            f.password.value="";
            f.password.focus();
            return false;
            }
		return true;
     }