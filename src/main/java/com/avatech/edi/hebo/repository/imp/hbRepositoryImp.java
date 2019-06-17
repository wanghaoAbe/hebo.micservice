/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.repository.imp;

import com.avatech.edi.hebo.model.bo.hb.Voucher;
import com.avatech.edi.hebo.model.bo.hb.VoucherItem;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrder;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrderItem;
import com.avatech.edi.hebo.mapper.hbMapper;
import com.avatech.edi.hebo.repository.hbRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class hbRepositoryImp implements hbRepository{
    @Autowired
    private hbMapper hbMapper;



}