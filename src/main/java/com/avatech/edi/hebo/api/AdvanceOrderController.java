package com.avatech.edi.hebo.api;

import com.avatech.edi.hebo.model.bo.hb.AdvanceOrder;
import com.avatech.edi.hebo.model.bo.hb.response.Result;
import com.avatech.edi.hebo.service.AdvanceOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/*")
@Slf4j
public class AdvanceOrderController {
    @Autowired
    private AdvanceOrderService advanceOrderService;

    @PostMapping("advanceOrder")
    public @ResponseBody
    Result generateAdvanceOrder(@RequestBody AdvanceOrder advanceOrder) {
        Result result = null;
        try {
            log.info("接收预付款单" + advanceOrder);
            String docEntry = advanceOrderService.createAdvanceOrder(advanceOrder);
            result = Result.ok(docEntry);
            log.info("生成预付款单成功");
        } catch (Exception e) {
            log.error("生成预付款单异常", e);
            result = Result.error("1", e.getMessage());
        }
        return result;
    }
}
