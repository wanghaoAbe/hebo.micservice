/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.model.bo.hb;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdvanceOrder{


    /**
     * 供应商编码
     */
    @JsonProperty(value = "CardCode")
    private String cardCode;


    /**
     * 过账日期
     */
    @JsonProperty(value = "DocDate")
    private Date docDate;


    /**
     * 单据日期
     */
    @JsonProperty(value = "TaxDate")
    private Date taxDate;


    /**
     * 到期日
     */
    @JsonProperty(value = "DocDueDate")
    private Date docDueDate;


    /**
     * 公司代码
     */
    @JsonProperty(value = "CompCode")
    private String compCode;


    /**
     * OA采购订单提交人
     */
    @JsonProperty(value = "U_Submitter")
    private String u_Submitter;


    /**
     * 采购员
     */
    @JsonProperty(value = "SlpCode")
    private String slpCode;


    /**
     * OA采购订单申请人
     */
    @JsonProperty(value = "U_Applicant")
    private String u_Applicant;


    /**
     * OA采购订单单号
     */
    @JsonProperty(value = "U_OaPoNum")
    private String u_OaPoNum;


    /**
     * 项目
     */
    @JsonProperty(value = "OcrCoder2")
    private String ocrCoder2;


    /**
     * 币种
     */
    @JsonProperty(value = "DocCur")
    private String docCur;


    /**
     * 申请原因
     */
    @JsonProperty(value = "U_PRApplReason")
    private String u_PRApplReason;


    /**
     * 需求部门
     */
    @JsonProperty(value = "OcrCode")
    private String ocrCode;


    /**
     * 采购订单类型
     */
    @JsonProperty(value = "U_PoType")
    private String u_PoType;


    /**
     * 到期付款总计
     */
    @JsonProperty(value = "Doctotal")
    private BigDecimal doctotal;


    /**
     * OA预付款单号
     */
    @JsonProperty(value = "U_OaPayUum")
    private String u_OaPayUum;


    /**
     * SAP预付款单号
     */
    @JsonProperty(value = "DocNum")
    private String docNum;


    private List<AdvanceOrderItem> advanceOrderItems;


     /**
     * 获取供应商编码
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置供应商编码
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
     /**
     * 获取过账日期
     */
    public Date getDocDate() {
        return docDate;
    }

    /**
     * 设置过账日期
     */
    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }
     /**
     * 获取单据日期
     */
    public Date getTaxDate() {
        return taxDate;
    }

    /**
     * 设置单据日期
     */
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }
     /**
     * 获取到期日
     */
    public Date getDocDueDate() {
        return docDueDate;
    }

    /**
     * 设置到期日
     */
    public void setDocDueDate(Date docDueDate) {
        this.docDueDate = docDueDate;
    }
     /**
     * 获取公司代码
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * 设置公司代码
     */
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }
     /**
     * 获取OA采购订单提交人
     */
    public String getU_Submitter() {
        return u_Submitter;
    }

    /**
     * 设置OA采购订单提交人
     */
    public void setU_Submitter(String u_Submitter) {
        this.u_Submitter = u_Submitter;
    }
     /**
     * 获取采购员
     */
    public String getSlpCode() {
        return slpCode;
    }

    /**
     * 设置采购员
     */
    public void setSlpCode(String slpCode) {
        this.slpCode = slpCode;
    }
     /**
     * 获取OA采购订单申请人
     */
    public String getU_Applicant() {
        return u_Applicant;
    }

    /**
     * 设置OA采购订单申请人
     */
    public void setU_Applicant(String u_Applicant) {
        this.u_Applicant = u_Applicant;
    }
     /**
     * 获取OA采购订单单号
     */
    public String getU_OaPoNum() {
        return u_OaPoNum;
    }

    /**
     * 设置OA采购订单单号
     */
    public void setU_OaPoNum(String u_OaPoNum) {
        this.u_OaPoNum = u_OaPoNum;
    }
     /**
     * 获取项目
     */
    public String getOcrCoder2() {
        return ocrCoder2;
    }

    /**
     * 设置项目
     */
    public void setOcrCoder2(String ocrCoder2) {
        this.ocrCoder2 = ocrCoder2;
    }
     /**
     * 获取币种
     */
    public String getDocCur() {
        return docCur;
    }

    /**
     * 设置币种
     */
    public void setDocCur(String docCur) {
        this.docCur = docCur;
    }
     /**
     * 获取申请原因
     */
    public String getU_PRApplReason() {
        return u_PRApplReason;
    }

    /**
     * 设置申请原因
     */
    public void setU_PRApplReason(String u_PRApplReason) {
        this.u_PRApplReason = u_PRApplReason;
    }
     /**
     * 获取需求部门
     */
    public String getOcrCode() {
        return ocrCode;
    }

    /**
     * 设置需求部门
     */
    public void setOcrCode(String ocrCode) {
        this.ocrCode = ocrCode;
    }
     /**
     * 获取采购订单类型
     */
    public String getU_PoType() {
        return u_PoType;
    }

    /**
     * 设置采购订单类型
     */
    public void setU_PoType(String u_PoType) {
        this.u_PoType = u_PoType;
    }
     /**
     * 获取到期付款总计
     */
    public BigDecimal getDoctotal() {
        return doctotal;
    }

    /**
     * 设置到期付款总计
     */
    public void setDoctotal(BigDecimal doctotal) {
        this.doctotal = doctotal;
    }
     /**
     * 获取OA预付款单号
     */
    public String getU_OaPayUum() {
        return u_OaPayUum;
    }

    /**
     * 设置OA预付款单号
     */
    public void setU_OaPayUum(String u_OaPayUum) {
        this.u_OaPayUum = u_OaPayUum;
    }
     /**
     * 获取SAP预付款单号
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * 设置SAP预付款单号
     */
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public List<AdvanceOrderItem> getadvanceOrderItems() {
        if(advanceOrderItems == null){
            advanceOrderItems = new ArrayList<>();
        }
        return advanceOrderItems;
    }

    public void setAdvanceOrderItems(List<AdvanceOrderItem> advanceOrderItems) {
        this.advanceOrderItems = advanceOrderItems;
    }
}
