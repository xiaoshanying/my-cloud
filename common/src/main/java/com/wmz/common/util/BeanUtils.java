package com.wmz.common.util;

/**
 * Created by wmz on 2018/2/7.
 * bean工具类
 *
 * @author wmz
 */
public class BeanUtils {

    public static void copyAttribute(Object source, Object dest) {
        org.springframework.beans.BeanUtils.copyProperties(source, dest);
    }

}
