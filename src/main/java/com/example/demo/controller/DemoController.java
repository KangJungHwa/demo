package com.example.demo.controller;


import com.example.demo.model.Extraction;
import com.example.demo.model.Response;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value={"extraction"})
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value={"extract"}, method= RequestMethod.POST)
    @ResponseBody
    public Response requestExtract(@Valid @RequestBody Extraction extraction){
        Response response= demoService.extraction(extraction);
        return response;
    }
}

