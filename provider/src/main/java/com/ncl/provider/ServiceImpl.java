package com.ncl.provider;

import com.ncl.api.IService;
import com.ncl.api.Request;
import com.ncl.api.Response;

public class ServiceImpl implements IService {
    @Override
    public Response test(Request request) {
        System.out.println("曾经来过" + request);
        Response resp = new Response();
        resp.setCode("000000");
        resp.setName("sunjia");
        return resp;
    }
}
