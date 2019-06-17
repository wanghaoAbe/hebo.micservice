/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.model.bo.hb;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class AdvanceOrderItem{


    /**
     * 物料编码
     */
    @JsonProperty(value = "ItemCode")
    private String itemCode;


    /**
     * 物料详细名称
     */
    @JsonProperty(value = "U_MaterialDetails")
    private String u_MaterialDetails;


    /**
     * 含税单价
     */
    @JsonProperty(value = "PriceAftVat")
    private BigDecimal priceAftVat;


    /**
     * 税码定义
     */
    @JsonProperty(value = "VatGroup")
    private String vatGroup;


    /**
     * 数量
     */
    @JsonProperty(value = "Quantity")
    private BigDecimal quantity;


    /**
     * OA单据行号
     */
    @JsonProperty(value = "U_OALineNum")
    private int u_OALineNum;



     /**
     * 获取物料编码
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编码
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取物料详细名称
     */
    public String getU_MaterialDetails() {
        return u_MaterialDetails;
    }

    /**
     * 设置物料详细名称
     */
    public void setU_MaterialDetails(String u_MaterialDetails) {
        this.u_MaterialDetails = u_MaterialDetails;
    }
     /**
     * 获取含税单价
     */
    public BigDecimal getPriceAftVat() {
        return priceAftVat;
    }

    /**
     * 设置含税单价
     */
    public void setPriceAftVat(BigDecimal priceAftVat) {
        this.priceAftVat = priceAftVat;
    }
     /**
     * 获取税码定义
     */
    public String getVatGroup() {
        return vatGroup;
    }

    /**
     * 设置税码定义
     */
    public void setVatGroup(String vatGroup) {
        this.vatGroup = vatGroup;
    }
     /**
     * 获取数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
     /**
     * 获取OA单据行号
     */
    public int getU_OALineNum() {
        return u_OALineNum;
    }

    /**
     * 设置OA单据行号
     */
    public void setU_OALineNum(Integer u_OALineNum) {
        this.u_OALineNum = u_OALineNum;
    }
}
