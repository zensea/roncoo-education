package com.roncoo.education.user.service.api.req;

import com.roncoo.education.common.core.enums.LoginTypeEnum;
import com.roncoo.education.common.core.enums.RegisterSourceEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 微信登录
 *
 * @author fengyw
 */
@Data
@Accessors(chain = true)
public class WxBindingReq implements Serializable {

    private static final long serialVersionUID = -2877781106821535513L;

    /**
     * 手机号码
     */
    @Schema(description = "手机", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mobile;
    /**
     * 手机验证码
     */
    @Schema(description = "手机验证码", requiredMode = Schema.RequiredMode.REQUIRED)
    private String code;
    /**
     * UnionId
     */
    @Schema(description = "UnionId")
    private String unionId;
    /**
     * OpenId
     */
    @Schema(description = "OpenId")
    private String openId;

    @Schema(description = "注册来源")
    private Integer registerSource = RegisterSourceEnum.SYS_PC_WX.getCode();

    @Schema(description = "登录方式")
    private Integer loginType = LoginTypeEnum.WX_WEB_AUTH.getCode();

    @Schema(description = "浏览器")
    private String browser;

    @Schema(description = "操作系统")
    private String os;
}
