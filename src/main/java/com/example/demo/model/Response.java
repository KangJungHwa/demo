package com.example.demo.model;

import java.io.Serializable;

public class Response implements Serializable {
    String errMsg;
    String isSuccess;
    String outputpath;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getOutputpath() {
        return outputpath;
    }

    public void setOutputpath(String outputpath) {
        this.outputpath = outputpath;
    }
}
