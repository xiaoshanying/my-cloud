package com.wmz.compute.response;

import com.wmz.common.model.response.BaseResponse;

/**
 * Created by wmz on 2018/2/7.
 * 计算结果
 *
 * @author wmz
 */
public class ComputeAddResp extends BaseResponse {

    private static final long serialVersionUID = 6705362318021527980L;

    private Integer result;

    public ComputeAddResp() {
        super(true);
    }

    public ComputeAddResp(Integer result) {
        super(true);
        this.result = result;
    }

    public ComputeAddResp(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }



    @Override
    public String toString() {
        return "ComputeAddResp{" +
                "result=" + result +
                '}';
    }
}
