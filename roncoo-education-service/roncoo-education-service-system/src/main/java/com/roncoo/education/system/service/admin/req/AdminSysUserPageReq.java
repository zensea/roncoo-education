package com.roncoo.education.system.service.admin.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 后台用户信息-分页
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class AdminSysUserPageReq implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 手机
     */
    @Schema(description = "手机")
    private String mobile;
    /**
     * 当前页
     */
    @Schema(description = "当前页", requiredMode = Schema.RequiredMode.REQUIRED)
    private int pageCurrent = 1;
    /**
     * 每页记录数
     */
    @Schema(description = "每页记录数", requiredMode = Schema.RequiredMode.REQUIRED)
    private int pageSize = 20;
}
