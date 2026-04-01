package com.roncoo.education.system.service.admin.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author fengyw
 */
@Data
@Accessors(chain = true)
@Schema(description = "用户登录")
public class AdminSysUserLoginResp implements Serializable {

    private static final long serialVersionUID = -5227677558610916215L;

    @Schema(description = "登录账号", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mobile;

    @Schema(description = "昵称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String realName;

    @Schema(description = "token", requiredMode = Schema.RequiredMode.REQUIRED)
    private String token;

    @Schema(description = "用户路由", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<AdminSysUserLoginRouterResp> routerList;

    @Schema(description = "用户菜单", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<AdminSysMenuUserResp> menuList;

    @Schema(description = "前端权限", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<String> permissionList;
}
