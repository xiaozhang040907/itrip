package com.zyh.common.exception;

import com.zyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname ServiceException
 * @Description TODO
 * @Version 1.0.0
 * @Date 2021/12/24 10:10
 * @Created by Administrator
 */
@Data
@ApiModel(value = "自定义service层异常")
public class ServiceException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public ServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
