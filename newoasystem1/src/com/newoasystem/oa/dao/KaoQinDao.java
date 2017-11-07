package com.newoasystem.oa.dao;
import java.util.Date;
import java.util.List;
import com.newoasystem.oa.modle.Kaoqinxinxi;
public interface KaoQinDao {
public boolean addKaoqin(Kaoqinxinxi kaoqinxinxi);//添加考勤信息
public List selectKaoQin(Date date,int pagenow,int pagesize);//分页查询指定年月的所有的考勤信息
public int selectKaoQin(Date date);//查询指定年月的所有考勤信息的总数
public List selectKaoqinByXaiozuId(int zubie,Date date,int pagenow,int pagesize);
public int selectKaoqinByXaiozuId(int zubie,Date date);
public boolean updateKaoQin(Kaoqinxinxi kaoqinxinxi);
public boolean deleteKaoQin(int kaoqinId);
}
