package com.personet.gearbox.java8;

import com.personet.gearbox.fakeData.GenerateData;
import com.personet.gearbox.fakeData.UserInfo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<UserInfo> userList = GenerateData.generateUserList();
        /*
        排序
         */
        //  userList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        // Collections.sort(userList, Comparator.comparing(UserInfo::getAge));
        userList.sort(Comparator.comparing(UserInfo::getAge));
        userList.sort(Comparator.comparing(UserInfo::getAge).reversed());
        userList.sort(Comparator.comparing(UserInfo::getBrithday));

        /*
           线程
         */
        //Thread thread = new Thread(() -> System.out.println("Hello Man!"));

        /*
        遍历
         */
        List<String> list = Arrays.asList("A", "B", "C", "D");
        forEach(list, str -> System.out.println(str));
        // 也可以写成
        forEach(list, System.out::println);

    }

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
