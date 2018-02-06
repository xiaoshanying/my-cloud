package com.wmz.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmz on 2018/2/6.
 * 获取配置
 *
 * @author wmz
 */
@RefreshScope
@RestController
public class FetchConfigController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String env() {
        return this.from;
    }

}
