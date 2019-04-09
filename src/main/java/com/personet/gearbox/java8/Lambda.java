package com.personet.gearbox.java8;

import com.personet.gearbox.fakeData.GenerateData;
import com.personet.gearbox.fakeData.UserInfo;

import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<UserInfo> userList = GenerateData.generateUserList();
        // 排序
        userList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        Comparator.comparing(UserInfo::getAge);
        Comparator.comparing(UserInfo::getAge).reversed();
        Comparator.comparing(UserInfo::getBrithday);
        System.out.println(userList);
    }


}
