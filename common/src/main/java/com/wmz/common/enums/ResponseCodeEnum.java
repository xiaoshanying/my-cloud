package com.wmz.common.enums;

/**
 * Created by wmz on 2018/2/7.
 * 返回码
 *
 * @author wmz
 */
public enum ResponseCodeEnum implements IEnum<Integer, String> {

    SUCCESS(0, "成功"),
    FAIL(1, "失败");

    private Integer type;

    private String value;

    ResponseCodeEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public Integer getType() {
        return this.type;
    }
}
