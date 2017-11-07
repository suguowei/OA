 function validate(f){
        if(!(/^[0-9a-zA-Z]+$/.test(f.ymima.value))){
        alert("请输入数字或字母");
        f.ymima.value="";
        f.ymima.focus();
        return false;
        }
        if(!(f.fankui.value==1)){
        alert("请重新输入原密码");
        f.fankui.value="";
        f.fankui.focus();
        return false;
        }
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