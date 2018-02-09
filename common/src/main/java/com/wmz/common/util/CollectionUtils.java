package com.wmz.common.util;

import java.util.Collection;

/**
 * Created by wmz on 2018/2/7.
 * 集合工具类
 * 使用父类/接口
 * 比如,接口传参,arrayList,linkedList都数据Collection则在传参时传Collection
 *
 * @author wmz
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

}
