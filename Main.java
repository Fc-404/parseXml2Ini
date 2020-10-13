package com.test;

public class Main {

    public static void main(String[] args) {
        String ini = "<爱>没有</爱>" +
                "<qw><er>1212</er><rt>121234</rt><12>qwqw</12></qw>" +
                "<key><id>老王123<id><ID>123loog<ID></key>" +
                "<return></return>";
        parseXml a = new parseXml(ini);
        twoArray b = a.getKeyValue();
        System.out.println(b.getKeyValue("return"));
        System.out.println(b.getKeyValue("爱"));
        System.out.println(b.getKeyValue("id", "key"));
        System.out.println(b.getKeyValue("ID", "key"));
        twoArray c = b;
    }
}
