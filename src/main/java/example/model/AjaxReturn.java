package example.model;

import java.io.Serializable;

/**
 * @program: test
 * @description: ajax请求返回数据
 * @author: Zhangxike
 * @create: 2018-11-26 16:34
 **/

public class AjaxReturn<T> implements Serializable {

    private static final long serialVersionUID = -2482257140624700476L;
    private boolean ok;

    private String msg;

    private T value;


    public AjaxReturn(boolean ok, String msg, T value) {
        this.ok = ok;
        this.msg = msg;
        this.value = value;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
