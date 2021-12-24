package com.zyh.common.exception;

import com.zyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname SysException
 * @Description TODO
 * @Version 1.0.0
 * @Date 2021/12/24 10:11
 * @Created by Administrator
 */
@Data
@ApiModel(value = "自定义系统异常")
public class SysException extends RuntimeException {
    @ApiModelProperty(value = "异常编码")
    private String errorCode;
    public SysException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
