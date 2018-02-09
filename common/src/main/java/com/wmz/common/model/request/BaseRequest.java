package com.wmz.common.model.request;

import com.wmz.common.enums.SignType;

/**
 * Created by wmz on 2018/2/7.
 * 请求基本参数
 *
 * @author wmz
 */
public class BaseRequest extends AbstractRequest {

    private static final long serialVersionUID = -3678789718327278380L;

    /**
     * 接口名称
     */
    private String   service;
    /**
     * 请求时间
     */
    private String   requestTime;
    /**
     * 参数编码字符集
     */
    private String   inputCharset;
    /**
     * 签名
     */
    private String   sign;
    /**
     * 签名方式
     */
    private SignType signType;
    /**
     * 系统异步回调通知地址
     */
    private String   notifyUrl;
    /**
     * 页面跳转同步返回页面路径
     */
    private String   returnUrl;
    /**
     * 备注
     */
    private String   memo;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "service='" + service + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", inputCharset='" + inputCharset + '\'' +
                ", sign='" + sign + '\'' +
                ", signType=" + signType +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
