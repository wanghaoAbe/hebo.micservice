package com.avatech.edi.hebo.service;

import com.avatech.edi.hebo.model.bo.hb.Voucher;
import com.avatech.edi.hebo.model.bo.hb.VoucherItem;
import com.avatech.edi.hebo.repository.VourcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HandleDocumentService {
    @Autowired
    private VoucherService voucherService;

    @Autowired
    private VourcherRepository vourcherRepository;

    public String HandleVourcher(Voucher voucher) throws Exception {
        String docEntry = null;
        for (VoucherItem voucherItem :voucher.getVoucherItems()){
            String acctCode = vourcherRepository.fetchAcctCode(voucherItem.getCostType());
            voucherItem.setAcctCode(acctCode);
        }
        docEntry = voucherService.createVoucher(voucher);
        return docEntry;
    }

}
