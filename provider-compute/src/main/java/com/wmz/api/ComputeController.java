package com.wmz.api;

import com.wmz.common.enums.ResponseCodeEnum;
import com.wmz.compute.request.ComputeAddReq;
import com.wmz.compute.response.ComputeAddResp;
import com.wmz.serviceimpl.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@RequestMapping("/service/compute")
@RestController
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ComputeAddResp add(@RequestBody ComputeAddReq computeAddReq) {
        try {
            return computeService.add(computeAddReq);
        } catch (Exception e) {
            return new ComputeAddResp(ResponseCodeEnum.FAIL.getType(), e.toString());
        }
    }


}
