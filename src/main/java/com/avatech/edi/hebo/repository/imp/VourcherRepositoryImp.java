/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.repository.imp;

import com.avatech.edi.hebo.mapper.VourcherMapper;
import com.avatech.edi.hebo.repository.VourcherRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class VourcherRepositoryImp implements VourcherRepository {
    @Autowired
    private VourcherMapper vourcherMapper;

    @Override
    public String fetchAcctCode(String costType) {
        String acctCode = vourcherMapper.searchAcctCode(costType);
        return acctCode;
    }
}