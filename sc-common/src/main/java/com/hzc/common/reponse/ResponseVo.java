package com.hzc.common.reponse;

public class ResponseVo {
    private String code;
    private String message;
    private Object result;

    // 成功
    public static ResponseVo success(Object result){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(ResponseEnum.SUCCESS.getCode());
        responseVo.setMessage(ResponseEnum.SUCCESS.getMessage());
        if(result!=null){
            responseVo.setResult(result);
        }
        return responseVo;
    }
    //失败
    public static ResponseVo fail(Object result){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(ResponseEnum.FAIL.getCode());
        responseVo.setMessage(ResponseEnum.FAIL.getMessage());
        if(result!=null){
            responseVo.setResult(result);
        }
        return responseVo;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
