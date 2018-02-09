package com.wmz.common.util;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wmz on 2018/2/7.
 * 文件工具类
 * 学会使用重载编写衍生函数组
 *
 * @author wmz
 */
public class FailUtils {

    private static final String DEFAULT_CHARSET = "UTF-8";

    public static List<String> readFile2List(String filename) throws IOException {
        return readFile2List(filename, DEFAULT_CHARSET);
    }

    public static List<String> readFile2List(String filename, String charset) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        return readFile2List(fileInputStream, charset);
    }

    public static List<String> readFile2List(File file) throws IOException {
        return readFile2List(file, DEFAULT_CHARSET);
    }

    public static List<String> readFile2List(File file, String charset) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return readFile2List(fileInputStream, charset);
    }

    public static List<String> readFile2List(InputStream inputStream) throws IOException {
        return readFile2List(inputStream, DEFAULT_CHARSET);
    }


    public static List<String> readFile2List(InputStream inputStream, String charset) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(inputStream, charset));
            String s = null;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
        } finally {
            IOUtils.closeQuietly(br);
        }
        return list;
    }

}
