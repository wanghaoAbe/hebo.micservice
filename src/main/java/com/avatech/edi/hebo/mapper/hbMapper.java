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
public interface hbMapper{

    void insertVoucher(Voucher Voucher);

    List<Voucher> searchVoucher();

    void insertVoucherItem(VoucherItem VoucherItem);

    List<VoucherItem> searchVoucherItem();

    void insertAdvanceOrder(AdvanceOrder AdvanceOrder);

    List<AdvanceOrder> searchAdvanceOrder();

    void insertAdvanceOrderItem(AdvanceOrderItem AdvanceOrderItem);

    List<AdvanceOrderItem> searchAdvanceOrderItem();
}