package com.personet.gearbox.fakeData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateData {

    public static List<UserInfo> generateUserList() {
        String[] f = new String[]{"张", "王", "周", "武", "李", "胡", "赵", "陈", "苗", "戴", "习", "毛", "朱", "韩", "陆"};
        String[] s = new String[]{"克", "明", "发", "代发", "犯的", "和", "我", "人", "同", "娟", "娟娟", "丽", "美丽", "利", "陆", "空间", "改", "办法", "航空", "留", "泰", "晨光", "长城", "层层", "莉莉", "胡霍", "娜娜", "大", "光荣"};
        Random random = new Random();
        List<UserInfo> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userList.add(UserInfo.builder()
                    .age(random.nextInt(50))
                    .name(f[random.nextInt(f.length - 1)] + s[random.nextInt(s.length - 1)])
                    .brithday(LocalDate.parse((2019 - random.nextInt(50)) + "-" + (1 + random.nextInt(8)) + "-" + (random.nextInt(20) + 10), DateTimeFormatter.ofPattern("yyyy-M-dd")))
                    .high(random.nextInt(200))
                    .build());
        }
        return userList;

    }
}
