package com.avatech.edi.hebo.model.bo.hb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyInfo {
    @JsonIgnore
    private String CompCode;
    @JsonProperty(value = "Password")
    private String Password;
    @JsonProperty(value = "UserName")
    private String UserName;
    @JsonProperty(value = "CompanyDB")
    private String CompanyDB;

    @JsonProperty("Password")
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @JsonProperty("UserName")
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @JsonProperty("CompanyDB")
    public String getCompanyDB() {
        return CompanyDB;
    }

    public void setCompanyDB(String companyDB) {
        CompanyDB = companyDB;
    }

    @JsonProperty("CompCode")
    public String getCompCode() {
        return CompCode;
    }
    public void setCompCode(String compCode) {
        CompCode = compCode;
    }
}
