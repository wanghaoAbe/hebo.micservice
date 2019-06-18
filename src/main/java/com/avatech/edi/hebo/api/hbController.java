/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.api;

import com.avatech.edi.hebo.model.bo.hb.response.Result;
import com.avatech.edi.hebo.service.HandleDocumentService;
import com.avatech.edi.hebo.service.VoucherService;
import com.avatech.edi.hebo.model.bo.hb.Voucher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
@Slf4j
public class hbController {
    @Autowired
    private HandleDocumentService documentService;

    @PostMapping("voucher")
    public @ResponseBody  Result generateVourcher(@RequestBody Voucher voucher){
            Result result = null;
        try {
            log.info("接收凭单信息"+voucher);
            String docEntry = documentService.HandLeVourcher(voucher);
            result = Result.ok(docEntry);
            log.info("生成凭单成功");
        }catch (Exception e){
            log.error("生成凭单异常",e);
            result = Result.error("1",e.getMessage());
        }
        return result;
    }
}