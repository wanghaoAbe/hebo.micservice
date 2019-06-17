package com.avatech.edi.hebo.service.config;

import com.avatech.edi.hebo.model.bo.hb.CompanyInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
@Slf4j
public class B1Manager {
    public List<CompanyInfo> getCompany() throws Exception {
        try {
            String path = "C:\\avatech\\heboconinfo.json";
            File file = new File(path);

            BufferedReader bufferedReader = null;

            FileReader fileReader = new FileReader(file);
//            InputStream stream = getClass().getClassLoader().getResourceAsStream(path);
//            inputStreamReader = new InputStreamReader(stream); // 建立一个输入流对象reader
            bufferedReader = new BufferedReader(fileReader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine().trim();
            while (line != null) {
                stringBuffer.append(line);
                line = bufferedReader.readLine(); // 一次读入一行数据
            }
            ObjectMapper objectMapper = new ObjectMapper();
            List<CompanyInfo> companyInfos = objectMapper.readValue(stringBuffer.toString(), new TypeReference<List<CompanyInfo>>() {
            });
            return companyInfos;
        } catch (IOException e) {
            log.info("读取配置文件出错", e);
            throw new Exception("20021:读取配置文件出错");
        } finally {

        }
    }
    public CompanyInfo getcompanyInfos (String companyCode) throws Exception {
        for (CompanyInfo companyInfo : getCompany()){
            if (companyCode.equals(companyInfo.getCompCode())){
                return companyInfo;
            }
        }
        throw new Exception("获取公司信息错误");
    }
}
