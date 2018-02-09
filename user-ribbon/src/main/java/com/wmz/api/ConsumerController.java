package com.wmz.api;

import com.wmz.common.model.ResultBean;
import com.wmz.compute.request.ComputeAddReq;
import com.wmz.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmz on 2018/2/5.
 * 远程调用计算服务
 *
 * @author wmz
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ResultBean<Integer> add(ComputeAddReq computeAddReq) {
        try {
            return computeService.add(computeAddReq);
        } catch (Exception e) {
            return new ResultBean<>(e);
        }
    }

}
