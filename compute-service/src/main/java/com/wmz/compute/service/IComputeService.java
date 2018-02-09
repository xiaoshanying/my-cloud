package com.wmz.compute.service;

import com.wmz.compute.request.ComputeAddReq;
import com.wmz.compute.response.ComputeAddResp;

/**
 * Created by wmz on 2018/2/7.
 * 计算服务的接口
 *
 * @author wmz
 */
public interface IComputeService {

    /**
     * 计算两个数相加
     *
     * @param params
     * @return
     * @throws Exception
     */
    ComputeAddResp add(ComputeAddReq params) throws Exception;

}
