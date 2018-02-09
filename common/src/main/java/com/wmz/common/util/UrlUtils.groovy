package com.wmz.common.util

import com.wmz.common.enums.ComputeServiceMethodEnum

/**
 * Created by wmz on 2018/2/7.
 * url工具类
 * @auth wmz
 */
class UrlUtils {

    static String getComputeAddUrl(){
        return getUrl(ComputeServiceMethodEnum.BASE_URL.getValue(),ComputeServiceMethodEnum.METHOD_ADD.getValue())
    }

    static String getUrl(serviceBaseUrl, serviceMethodUrl) {
        return serviceBaseUrl + serviceMethodUrl
    }

}
