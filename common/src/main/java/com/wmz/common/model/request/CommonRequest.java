package com.wmz.common.model.request;

/**
 * Created by wmz on 2018/2/7.
 *
 * @author wmz
 */
public class CommonRequest extends BaseRequest {

    private static final long serialVersionUID = -3056264776343587421L;

    /**
     * 用户标识信息
     */
    private String identityId;

    /**
     * 请求者ip
     */
    private String clientIp;

    /**
     * 扩展信息
     */
    private String extendParam;

}
