package com.roncoo.education.system.service.admin.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 后台用户信息-添加
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class AdminSysUserSaveReq implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 手机
     */
    @Schema(description = "手机", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mobile;
    /**
     * 登录密码
     */
    @Schema(description = "密码", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mobilePwdEncrypt;
    /**
     * 真实姓名
     */
    @Schema(description = "真实姓名", requiredMode = Schema.RequiredMode.REQUIRED)
    private String realName;
    /**
     * 备注
     */
    @Schema(description = "备注")
    private String remark;

}
