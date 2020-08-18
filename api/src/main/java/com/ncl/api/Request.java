package com.ncl.api;

import java.io.Serializable;

public class Request implements Serializable {
    private static final long serialVersionUID = -3657455165915065283L;
    private String name ;
    private String code ;
    private Object obj ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", obj=" + obj +
                '}';
    }
}
