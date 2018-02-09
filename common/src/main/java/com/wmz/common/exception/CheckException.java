package com.wmz.common.exception;

/**
 * Created by wmz on 2018/2/7.
 * 校验异常处理
 *
 * @author wmz
 */
public class CheckException extends RuntimeException {

    private static final long serialVersionUID = -6078748287140027050L;

    public CheckException() {
    }

    public CheckException(String message) {
        super(message);
    }

    public CheckException(Throwable cause) {
        super(cause);
    }

    public CheckException(String message, Throwable cause) {
        super(message, cause);
    }

}
