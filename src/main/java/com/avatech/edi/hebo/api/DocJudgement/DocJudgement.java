package com.avatech.edi.hebo.api.DocJudgement;

import com.avatech.edi.hebo.common.Exception.BaseException;

public class DocJudgement {
    public static Boolean JudgeValue(String valueName,String value){
        Integer length = value.length();
        if (length!=0){
            return  true;
        }
        switch (length){
            case 0:
                default:
                throw new  BaseException(valueName+"不能为空");
        }
    }
}
