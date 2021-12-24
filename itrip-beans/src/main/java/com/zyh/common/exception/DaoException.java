package com.zyh.common.exception;

import com.zyh.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname DaoException
 * @Description TODO
 * @Version 1.0.0
 * @Date 2021/12/24 10:09
 * @Created by Administrator
 */
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends  RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public DaoException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
