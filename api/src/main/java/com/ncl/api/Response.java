package com.ncl.api;

import java.io.Serializable;

public class Response implements Serializable {
    private static final long serialVersionUID = -9080770622464922808L;
    private String name ;
    private String code ;

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

    @Override
    public String toString() {
        return "Response{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
