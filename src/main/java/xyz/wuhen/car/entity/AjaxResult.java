package xyz.wuhen.car.entity;

import java.util.HashMap;

public class AjaxResult<T> extends HashMap<String,Object> {
    private String CODE_TAG = "code";
    private String MSG_TAG = "msg";
    private String DATA_TAG = "data";

    public AjaxResult() {

    }

    public AjaxResult(String code,String msg,T data) {
        super.put(this.CODE_TAG,code);
        super.put(this.MSG_TAG,msg);
        super.put(this.DATA_TAG,data);
    }

    public AjaxResult(String code,String msg) {
        super.put(this.CODE_TAG,code);
        super.put(this.MSG_TAG,msg);
    }
}
