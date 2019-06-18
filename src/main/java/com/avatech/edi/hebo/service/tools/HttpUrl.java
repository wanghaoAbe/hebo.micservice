package com.avatech.edi.hebo.service.tools;

public class HttpUrl {
    private static final String BASEURL="https://172.16.30.110:50000/b1s/v1/";

    public static final String LOGINURL=BASEURL+"Login";
    /*
    凭证url
     */
    public static final String JOURNALURL=BASEURL+"JournalVouchersService_Add";
    /*
    预付款url
     */
    private static final  String PURCHASEDOWPAY = BASEURL+"PurchaseDownPayments";
}
