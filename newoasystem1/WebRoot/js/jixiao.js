 function validate(f){
        if(!(/^([0-9.]+)$/.test(f.jxxishu.value))){
        alert("请输入数字");
        f.jxxishu.value="";
        f.jxxishu.focus();
        return false;
        }
       
        if(!(/^([0-9.]+)$/.test(f.jxfenzhi.value))){
            alert("请输入数字");
            f.jxfenzhi.value="";
            f.jxfenzhi.focus();
            return false;
            }
		return true;
     }