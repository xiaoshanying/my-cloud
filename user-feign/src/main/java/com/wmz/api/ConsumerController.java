package com.wmz.api;

import com.wmz.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }


}