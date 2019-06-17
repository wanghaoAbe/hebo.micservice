/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.api;

import com.avatech.edi.hebo.service.hbService;
import com.avatech.edi.hebo.repository.hbRepository;
import com.avatech.edi.hebo.model.bo.hb.Voucher;
import com.avatech.edi.hebo.model.bo.hb.VoucherItem;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrder;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrderItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class hbController {

    private final Logger logger = LoggerFactory.getLogger(hbController.class);

    @Autowired
    private hbService hbService;

    @Autowired
    private hbRepository hbRepository;



}