package com.wmz.common.enums;

/**
 * Created by wmz on 2018/2/7.
 * 枚举类的接口,提供获取值和接口的名称
 *
 * @author wmz
 */
public interface IEnum<T, V> {

    /**
     * 获取枚举值
     *
     * @return
     */
    V getValue();

    /**
     * 获取枚举的类型
     *
     * @return
     */
    T getType();

}
