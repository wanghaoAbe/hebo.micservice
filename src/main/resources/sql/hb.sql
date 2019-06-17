/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-17
 */
        CREATE TABLE AVA_MS_OJDT(
                    "RefDate" DATE(8) ,
                    "DueDate" DATE(8) ,
                    "TaxDate" DATE(8) ,
                    "Remarks" VARCHAR(8) ,
                    "Creator" VARCHAR(155) ,
                    "Approver" VARCHAR(155) ,
                    "SupplCode" VARCHAR(254) ,
                    "U_OaClaiNum" VARCHAR(8) ,
                    "U_Claimatter" VARCHAR(8) 
        );
        CREATE TABLE AVA_MS_JDT1(
                    "AcctCode" VARCHAR(20) ,
                    "ShortName" VARCHAR(15) ,
                    "Debit" DECIMAL(20) ,
                    "CashFlow" INTEGER(8) ,
                    "OcrCode" VARCHAR(8) ,
                    "OcrCode2" VARCHAR(8) ,
                    "LineMemo" VARCHAR(200) ,
                    "VatGroup" VARCHAR(8) ,
                    "U_FeeDate" VARCHAR(8) ,
                    "U_BusiAddress" VARCHAR(8) ,
                    "U_LineRemarks" VARCHAR(8) 
        );
        CREATE TABLE AVA_WM_ODPO(
                    "CardCode" VARCHAR(15) ,
                    "DocDate" DATE(8) ,
                    "TaxDate" DATE(8) ,
                    "DocDueDate" DATE(8) ,
                    "CompCode" VARCHAR(20) ,
                    "U_Submitter" VARCHAR(20) ,
                    "SlpCode" VARCHAR(20) ,
                    "U_Applicant" VARCHAR(20) ,
                    "U_OaPoNum" VARCHAR(50) ,
                    "OcrCoder2" VARCHAR(20) ,
                    "DocCur" VARCHAR(20) ,
                    "U_PRApplReason" VARCHAR(200) ,
                    "OcrCode" VARCHAR(50) ,
                    "U_PoType" VARCHAR(15) ,
                    "Doctotal" DECIMAL(8) ,
                    "U_OaPayUum" VARCHAR(20) ,
                    "DocNum" VARCHAR(50) 
        );
        CREATE TABLE AVA_WM_DPO1(
                    "ItemCode" VARCHAR(20) ,
                    "U_MaterialDetails" VARCHAR(150) ,
                    "PriceAftVat" DECIMAL(8) ,
                    "VatGroup" VARCHAR(8) ,
                    "Quantity" DECIMAL(8) ,
                    "U_OALineNum" INTEGER(20) 
        );
