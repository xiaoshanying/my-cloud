package com.wmz.compute.request;

import com.wmz.common.model.request.CommonRequest;

/**
 * Created by wmz on 2018/2/7.
 * 计算请求
 *
 * @author wmz
 */
public class ComputeAddReq extends CommonRequest {

    private static final long serialVersionUID = -3333677668944101299L;

    private Integer a;

    private Integer b;

    public ComputeAddReq() {
        super();
    }

    public ComputeAddReq(Integer a, Integer b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ComputeAddReq{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
