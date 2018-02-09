package com.wmz.common.model.response;

import com.wmz.common.enums.ResponseCodeEnum;
import com.wmz.common.enums.SignType;
import com.wmz.common.model.request.AbstractRequest;

/**
 * Created by wmz on 2018/2/7.
 */
public class BaseResponse extends AbstractRequest {

    private static final long serialVersionUID = 3322402244023592315L;

    /**
     * 响应时间
     */
    private String responseTime;

    /**
     * 签名
     */
    private String sign;

    /**
     * 签名方式
     */
    private SignType signType;

    /**
     * 接口调用结果
     */
    private boolean success;

    /**
     * 备注
     */
    private String memo;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误消息
     */
    private String errorMessage;


    public BaseResponse() {
        this.success = true;
        this.errorCode = ResponseCodeEnum.SUCCESS.getType();
        this.errorMessage = ResponseCodeEnum.SUCCESS.getValue();
    }

    public BaseResponse(boolean success) {
        if (success) {
            this.success = true;
            this.errorCode = ResponseCodeEnum.SUCCESS.getType();
            this.errorMessage = ResponseCodeEnum.SUCCESS.getValue();
        } else {
            this.success = false;
            this.errorCode = ResponseCodeEnum.FAIL.getType();
            this.errorMessage = ResponseCodeEnum.FAIL.getValue();
        }
    }

    public BaseResponse(boolean success, Integer errorCode, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public BaseResponse(Integer errorCode, String errorMessage) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public SignType getSignType() {
        return signType;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
