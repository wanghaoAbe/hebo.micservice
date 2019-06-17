package com.avatech.edi.hebo.service;

import com.avatech.edi.hebo.model.bo.hb.CompanyInfo;
import com.avatech.edi.hebo.service.config.B1Manager;
import com.avatech.edi.hebo.service.tools.CertificateService;
import com.avatech.edi.hebo.service.tools.HttpUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.db.jdbc.Session;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class LoginService {
    @Autowired
    private B1Manager b1Manager;

    @Autowired
    private CertificateService certificateService;

    public CookieStore Login(String companyCode) throws Exception {
        CookieStore cookieStore = new BasicCookieStore();

        //忽略证书
        CloseableHttpClient client = certificateService.IgnoreCertificateService(cookieStore);
        ObjectMapper mapper = new ObjectMapper();
         String companyJson = mapper.writeValueAsString(getCompanyInfo(companyCode));
         try {
             HttpPost httpPost = new HttpPost(HttpUrl.LOGINURL);
             //设置请求体头部信息
             setHttpHeader(httpPost);
             StringEntity entity =new StringEntity(companyJson.toString(), "utf-8");
             CloseableHttpResponse response = client.execute(httpPost);
         }catch (Exception e){
             log.info("登录失败",e);
         }
         return cookieStore;
    }

    public CompanyInfo getCompanyInfo(String companyCode) throws Exception {
        CompanyInfo companyInfo;
        companyInfo = b1Manager.getcompanyInfos(companyCode);
        return companyInfo;
    }

    public void setHttpHeader(HttpPost httpPost){
        HttpHeaders httpHeaders = new HttpHeaders();
        //指定报文头Content-type、User-Agent
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");

        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
        //执行请求操作，并拿到结果（同步阻塞）

    }
}
