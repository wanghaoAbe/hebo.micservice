package com.avatech.edi.hebo.service;

import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.hebo.model.bo.hb.Voucher;
import com.avatech.edi.hebo.service.tools.CertificateService;
import com.avatech.edi.hebo.service.tools.HttpUrl;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Slf4j
public class VoucherService {

    @Autowired
    private CertificateService certificateService;

    @Autowired
    private LoginService loginService;

    public String createVoucher(Voucher voucher) throws Exception {
        String body = null;
        CookieStore cookieStore;
        CloseableHttpClient client;
        HttpPost httpPost;
        try {
            cookieStore = loginService.Login(voucher.getCompanyCode());
            client = certificateService.IgnoreCertificateService(cookieStore);
            httpPost = new HttpPost(HttpUrl.JOURNALURL);
            ObjectMapper mapper = new ObjectMapper();
            String voucherData=  mapper.writeValueAsString(voucher);
            StringEntity entity = new StringEntity(voucherData,"utf-8");
            httpPost.setEntity(entity);
            CloseableHttpResponse response = client.execute(httpPost);
            HttpEntity entitys = response.getEntity();
            body = EntityUtils.toString(entitys,"UTF-8");
            JSONObject jsonObject = JSONObject.parseObject(body);
            String docEntry = null;
            Integer status = response.getStatusLine().getStatusCode();
            if (status ==204){
                docEntry = jsonObject.getString("DocEntry");
            }
            return docEntry;
        }catch (HttpClientErrorException e){
            log.error("创建订单异常",e);
            throw new Exception("创建订单异常",e);
        }

    }
}
