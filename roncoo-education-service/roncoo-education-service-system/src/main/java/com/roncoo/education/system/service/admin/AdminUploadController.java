package com.roncoo.education.system.service.admin;

import com.roncoo.education.common.log.SysLog;
import com.roncoo.education.common.core.base.Result;
import com.roncoo.education.common.base.BaseController;
import com.roncoo.education.system.service.biz.UploadCommonBiz;
import com.roncoo.education.system.service.biz.resp.UploadDocResp;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotNull;

import java.io.File;

/**
 * 上传接口
 *
 * @author wuyun
 */
@Tag(name = "admin-上传接口")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/system/admin/upload")
public class AdminUploadController extends BaseController {

    @NotNull
    private final UploadCommonBiz biz;

    @Operation(summary = "上传图片")
    @Parameter(name = "picFile", description = "图片文件", required = true)
    @SysLog(value = "上传图片")
    @PostMapping(value = "/pic")
    public Result<String> uploadPic(@RequestParam(value = "picFile", required = false) MultipartFile picFile) {
        return biz.uploadPic(picFile);
    }

    @Operation(summary = "上传文档")
    @Parameter(name = "docFile", description = "文档文件", required = true)
    @SysLog(value = "上传文档")
    @PostMapping(value = "/doc")
    public Result<UploadDocResp> uploadDoc(@RequestParam(name = "docFile", required = false) MultipartFile docFile) {
        return biz.uploadDoc(docFile, false);
    }

    @Operation(summary = "上传app")
    @Parameter(name = "appFile", description = "app文件", required = true)
    @SysLog(value = "上传app")
    @PostMapping(value = "/app")
    public Result<UploadDocResp> uploadApp(@RequestParam(name = "appFile", required = false) MultipartFile appFile) {
        return biz.uploadDoc(appFile, true);
    }

}
