/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.mapper;


import com.avatech.edi.hebo.model.bo.hb.Voucher;
import com.avatech.edi.hebo.model.bo.hb.VoucherItem;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrder;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrderItem;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface VourcherMapper {

    List<Voucher> searchVoucher();

    List<VoucherItem> searchVoucherItem();


    String searchAcctCode(String costType);
}