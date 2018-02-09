package com.wmz.common.enums;

/**
 * Created by wmz on 2018/2/7.
 * 计算服务的url
 *
 * @author wmz
 */
public enum ComputeServiceMethodEnum implements IEnum<String, String> {

    BASE_URL("base", "http://provider-compute1/service/compute"),
    METHOD_ADD("add", "/add");

    private String type;

    private String value;

    ComputeServiceMethodEnum(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
