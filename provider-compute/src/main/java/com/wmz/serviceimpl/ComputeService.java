package com.wmz.serviceimpl;

import com.wmz.compute.request.ComputeAddReq;
import com.wmz.compute.response.ComputeAddResp;
import com.wmz.compute.service.IComputeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.wmz.common.util.CheckUtils.greaterThanZero;

/**
 * Created by wmz on 2018/2/7.
 *
 * @author wmz
 */
@Service
public class ComputeService implements IComputeService {

    private static final Logger logger = LoggerFactory.getLogger(ComputeService.class);

    @Override
    public ComputeAddResp add(ComputeAddReq params) throws Exception {
        logger.info("compute service,method is add,req params is:" + params.toString());
        greaterThanZero(params.getA() > 0, "参数小于0不合法", params.getA());
        greaterThanZero(params.getB() > 0, "参数小于0不合法", params.getB());
        return new ComputeAddResp(params.getA() + params.getB());
    }
}
