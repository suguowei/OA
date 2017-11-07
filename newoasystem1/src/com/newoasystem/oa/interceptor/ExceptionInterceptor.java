package com.newoasystem.oa.interceptor;

import java.io.IOException;

import java.sql.SQLException;

import org.hibernate.exception.DataException;

import com.newoasystem.oa.util.SystemException;


import com.opensymphony.xwork2.ActionInvocation;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

 

@SuppressWarnings("serial")

public class ExceptionInterceptor extends AbstractInterceptor {

 

    @SuppressWarnings("unchecked")

    public String intercept(ActionInvocation actionInvocation) throws Exception {

       String result = "";

       try {

           result = actionInvocation.invoke();

       } catch (DataException ex) {

           throw new SystemException("数据库操作失败！");

       } catch (NullPointerException ex) {

           throw new SystemException("空指针，调用了未经初始化或者是不存在的对象！");

       } catch (IOException ex) {

           throw new SystemException("IO读写异常！");

       } catch (ClassNotFoundException ex) {

           throw new SystemException("指定的类不存在！");

       } catch (ArithmeticException ex) {

           throw new SystemException("数学运算异常！");

       } catch (ArrayIndexOutOfBoundsException ex) {

           throw new SystemException("数组下标越界！");

       } catch (IllegalArgumentException ex) {

           throw new SystemException("调用方法的参数错误！");

       } catch (ClassCastException ex) {

           throw new SystemException("类型强制转换错误！");

       } catch (SecurityException ex) {

           throw new SystemException("违背安全原则异常！");

       } catch (SQLException ex) {

           throw new SystemException("操作数据库异常！");

       } catch (NoSuchMethodError ex) {

           throw new SystemException("调用了未定义的方法！");

       } catch (InternalError ex) {

           throw new SystemException("Java虚拟机发生了内部错误！");

       } catch (Exception ex) {

           throw new SystemException("程序内部错误，操作失败！");

       }

       return result;

    }

}