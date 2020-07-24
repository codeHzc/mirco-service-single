package com.hzc.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;



@Data
public class BaseFieldVo implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8820913334214200448L;
    /**
     * 主键
     */

    private static final int DEFAULT_PAGE_SIZE = 10;
    /**
     * 主键
     */
    @ApiModelProperty(value = "代码生成后默认接口，更新必须传id,删除多个id用英文逗号隔开，其他接口不需要")
    private String id;
    /**
     * 逻辑删除标识
     */
    @ApiModelProperty(hidden = true)
    private String delFlag;
    /**
     * 新增时间
     */
    @ApiModelProperty(hidden = true)
    private Date addTime;
    /**
     * 新增用户id
     */
    @ApiModelProperty(hidden = true)
    private String addUserCode;
    /**
     * 新增备注
     */
    @ApiModelProperty(hidden = true)
    private String addMark;
    /**
     * 更新时间
     */
    @ApiModelProperty(hidden = true)
    private Date updTime;
    /**
     * 更新用户id
     */
    @ApiModelProperty(hidden = true)
    private String updUserCode;
    /**
     * 更新备注
     */
    @ApiModelProperty(hidden = true)
    private String updMark;

}
