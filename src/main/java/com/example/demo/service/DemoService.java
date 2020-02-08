package com.example.demo.service;

import com.example.demo.model.Extraction;
import com.example.demo.model.Response;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public Response extraction(Extraction extraction){

        Response response=new Response();
        response.setErrMsg("no error");
        response.setIsSuccess("SUCCESS");
        response.setOutputpath("/tmp/kang/");
        return response;
    }
}
