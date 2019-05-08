package com.personet.gearbox.util;

import java.net.URLDecoder;

public class Test {
    public static void main(String[] args) {
        try {
            String a = " %5B%7B%22customKey%22%3A %22generalForm%22%7D%5D";
            String aa = "{\"key\":\"value\"}";
            String b = URLDecoder.decode(aa, "UTF-8");
            System.out.println(a);
        } catch (Exception e) {

        }

    }
}
