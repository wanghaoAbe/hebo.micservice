/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
package com.avatech.edi.hebo.model.bo.hb;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Voucher{


    /**
     * 过账日期
     */
    @JsonProperty(value = "RefDate")
    private Date refDate;


    /**
     * 到期日
     */
    @JsonProperty(value = "DueDate")
    private Date dueDate;


    /**
     * 单据日期
     */
    @JsonProperty(value = "TaxDate")
    private Date taxDate;


    /**
     * 备注
     */
    @JsonProperty(value = "Remarks")
    private String remarks;


    /**
     * 创建者
     */
    @JsonProperty(value = "creator")
    private String creator;


    /**
     * 批准者
     */

    /**
     * 补充代码
     */
    @JsonProperty(value = "SupplCode")
    private String supplCode;


    /**
     * OA单号
     */
    @JsonProperty(value = "U_OaClaiNum")
    private String u_OaClaiNum;


    /**
     * 报销事由
     */
    @JsonProperty(value = "U_Claimatter")
    private String u_Claimatter;

    private String companyCode;

    private List<VoucherItem> voucherItems;


     /**
     * 获取过账日期
     */
    public Date getRefDate() {
        return refDate;
    }

    /**
     * 设置过账日期
     */
    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }
     /**
     * 获取到期日
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * 设置到期日
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
     * 获取备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
     /**
     * 获取创建者
     */
     /**
     * 获取批准者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置批准者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
     /**
     * 获取补充代码
     */
    public String getSupplCode() {
        return supplCode;
    }

    /**
     * 设置补充代码
     */
    public void setSupplCode(String supplCode) {
        this.supplCode = supplCode;
    }
     /**
     * 获取OA单号
     */
    public String getU_OaClaiNum() {
        return u_OaClaiNum;
    }

    /**
     * 设置OA单号
     */
    public void setU_OaClaiNum(String u_OaClaiNum) {
        this.u_OaClaiNum = u_OaClaiNum;
    }
     /**
     * 获取报销事由
     */
    public String getU_Claimatter() {
        return u_Claimatter;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * 设置报销事由
     */
    public void setU_Claimatter(String u_Claimatter) {
        this.u_Claimatter = u_Claimatter;
    }

    public List<VoucherItem> getVoucherItems() {
        if(voucherItems == null){
            voucherItems = new ArrayList<>();
        }
        return voucherItems;
    }

    public void setVoucherItems(List<VoucherItem> voucherItems) {
        this.voucherItems = voucherItems;
    }
}
