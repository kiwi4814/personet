package com.personet.gearbox.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJava {
    public static void main(String[] args) {
        //System.out.println(transferExpression( "(D01&D03)||D99&D76"));
       // String rex = "[&)|]?D[0-9]{2}[&)|]?";
        String rex = "(?<=[&)|]?)D[0-9]{2}(?=[&)|]?)";
        String str = "(D01&D03)||D99&D76";
        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(">>>>> replace sequence : " + matcher.group(0));
            str = StringUtils.replace(str, matcher.group(0), "{" + matcher.group(0) + "}");
        }
        System.out.println(str);
        String rex1 = "[{]D[0-9]{3}[}]";
        Pattern pattern1 = Pattern.compile(rex1);
        Matcher matcher1 = pattern1.matcher(str);
        str = pattern1.matcher(str).find() ? str : "";
        while (matcher1.find()) {
            System.out.println(">>>>> replace sequence : " + matcher1.group(0));
            str = StringUtils.replace(str, matcher1.group(0), "==========");
        }
        System.out.println(str);
    }


    public static String transferExpression(String expression) {
        expression = StringUtils.replace(expression, "and", "&");
        expression = StringUtils.replace(expression, "or", "||");
        expression = StringUtils.replace(expression, "（", "(");
        expression = StringUtils.replace(expression, "）", ")");
        String regex = "D[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        expression = pattern.matcher(expression).find() ? expression : "";
        while (matcher.find()) {
            expression = StringUtils.replace(expression, matcher.group(0), "{" + matcher.group(0) + "}");
        }
        return expression;
    }
}
