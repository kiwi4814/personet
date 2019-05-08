package com.personet.gearbox.util;

import com.personet.gearbox.fakeData.UserInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineMaps {
    public static void main(String[] args) {
        Map<String, String> defaultMap = new HashMap<>();
        Map<String, Object> executionMap = new HashMap<>();
        Map<String, String> paramsMap = new HashMap<>();
        defaultMap.put("key1", "StringValue1");
        executionMap.put("key2", 1111L);
        executionMap.put("key3", new UserInfo());
        executionMap.put("key7", null);
        executionMap.put(null, null);
        executionMap.put("", "");
        executionMap.put("key1", "StringValue2");
        executionMap.put("key4", 2222L);
        executionMap.put("key5", new UserInfo());
        // Map<String, Object> paramsMap = Stream.of(map1, map2).flatMap(map -> map.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2));
        paramsMap = Stream.of(defaultMap, executionMap).flatMap(map -> map.entrySet().stream())
                //.filter(p -> p.getValue() instanceof String || p.getValue() instanceof Integer)
                .collect(Collectors.toMap(Map.Entry::getKey, map -> String.valueOf(map.getValue()), (v1, v2) -> v2));
        /*Map<String, String> paramsMap = Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .filter(p -> p.getValue() instanceof String || p.getValue() instanceof Integer)
                .collect(Collectors.toMap(Map.Entry::getKey, map -> String.valueOf(map.getValue()), (v1, v2) -> v2));*/
        System.out.println(111);
    }
}
