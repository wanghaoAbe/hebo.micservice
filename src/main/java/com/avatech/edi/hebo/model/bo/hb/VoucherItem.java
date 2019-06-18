/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.model.bo.hb;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class VoucherItem{


    /**
     * 科目
     */
    @JsonProperty(value = "AcctCode")
    private String acctCode;


    /**
     * 业务伙伴代码
     */
    @JsonProperty(value = "ShortName")
    private String shortName;


    /**
     * 借方
     */
    @JsonProperty(value = "Debit")
    private BigDecimal debit;


    /**
     * 现金流
     */
    @JsonProperty(value = "CashFlow")
    private Integer cashFlow;


    /**
     * 成本中心1部门
     */
    @JsonProperty(value = "OcrCode")
    private String ocrCode;


    /**
     * 成本中心2项目
     */
    @JsonProperty(value = "OcrCode2")
    private String ocrCode2;


    /**
     * 行明细
     */
    @JsonProperty(value = "LineMemo")
    private String lineMemo;


    /**
     * 税收组
     */
    @JsonProperty(value = "VatGroup")
    private String vatGroup;


    /**
     * 费用发生时间
     */
    @JsonProperty(value = "U_FeeDate")
    private String u_FeeDate;


    /**
     * 出差地点
     */
    @JsonProperty(value = "U_BusiAddress")
    private String u_BusiAddress;


    /**
     * 行内备注
     */
    @JsonProperty(value = "U_LineRemarks")
    private String u_LineRemarks;


    private String costType;



     /**
     * 获取科目
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * 设置科目
     */
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }
     /**
     * 获取业务伙伴代码
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置业务伙伴代码
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
     /**
     * 获取借方
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /**
     * 设置借方
     */
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }
     /**
     * 获取现金流
     */
    public Integer getCashFlow() {
        return cashFlow;
    }

    /**
     * 设置现金流
     */
    public void setCashFlow(Integer cashFlow) {
        this.cashFlow = cashFlow;
    }
     /**
     * 获取成本中心1部门
     */
    public String getOcrCode() {
        return ocrCode;
    }

    /**
     * 设置成本中心1部门
     */
    public void setOcrCode(String ocrCode) {
        this.ocrCode = ocrCode;
    }
     /**
     * 获取成本中心2项目
     */
    public String getOcrCode2() {
        return ocrCode2;
    }

    /**
     * 设置成本中心2项目
     */
    public void setOcrCode2(String ocrCode2) {
        this.ocrCode2 = ocrCode2;
    }
     /**
     * 获取行明细
     */
    public String getLineMemo() {
        return lineMemo;
    }

    /**
     * 设置行明细
     */
    public void setLineMemo(String lineMemo) {
        this.lineMemo = lineMemo;
    }
     /**
     * 获取税收组
     */
    public String getVatGroup() {
        return vatGroup;
    }

    /**
     * 设置税收组
     */
    public void setVatGroup(String vatGroup) {
        this.vatGroup = vatGroup;
    }
     /**
     * 获取费用发生时间
     */
    public String getU_FeeDate() {
        return u_FeeDate;
    }

    /**
     * 设置费用发生时间
     */
    public void setU_FeeDate(String u_FeeDate) {
        this.u_FeeDate = u_FeeDate;
    }
     /**
     * 获取出差地点
     */
    public String getU_BusiAddress() {
        return u_BusiAddress;
    }

    /**
     * 设置出差地点
     */
    public void setU_BusiAddress(String u_BusiAddress) {
        this.u_BusiAddress = u_BusiAddress;
    }
     /**
     * 获取行内备注
     */
    public String getU_LineRemarks() {
        return u_LineRemarks;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    /**
     * 设置行内备注
     */
    public void setU_LineRemarks(String u_LineRemarks) {
        this.u_LineRemarks = u_LineRemarks;
    }


}
