package com.avatech.edi.hebo.mapper;

import com.avatech.edi.hebo.model.bo.hb.AdvanceOrder;
import com.avatech.edi.hebo.model.bo.hb.AdvanceOrderItem;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AdvanceOrderMapper {
    List<AdvanceOrder> searchAdvanceOrder();

    List<AdvanceOrderItem> searchAdvanceOrderItem();
}
