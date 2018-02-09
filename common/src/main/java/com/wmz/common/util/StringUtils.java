package com.wmz.common.util;

/**
 * Created by wmz on 2018/2/7.
 * 字符串工具类
 * 定义自己的工具类,尽量不要在业务代码里面直接调用第三方的工具类,这事一种解耦的体现
 * str,char 都可以看成CharSequence
 *
 * @author wmz
 */
public class StringUtils {


    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }



}
