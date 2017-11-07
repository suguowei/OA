 function validate(f){
        if(!(/^[0-9a-zA-Z]+$/.test(f.userid.value))){
        alert("请输入数字或字母");
        f.userid.value="";
        f.userid.focus();
        return false;
        }
        if(!(/^[\u0391-\uFFE5]+$/.test(f.name.value))){
        alert("请输入真实名字");
        f.name.value="";
        f.name.focus();
        return false;
        }
        if(!(/^[0-9a-zA-Z]+$/.test(f.password.value))){
        alert("请输入数字或字母");
        f.password.value="";
        f.password.focus();
        return false;
        }
        if(!(f.password.value==f.querenmima.value)){
        alert("请重新输入");
        f.querenmima.value="";
        f.querenmima.focus();
        return false;
        }
        if(!(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(f.youxiang.value))){
        alert("请输入正确邮箱格式");
        f.youxiang.value="";
        f.youxiang.focus();
        return false;
        }
		return true;
     }