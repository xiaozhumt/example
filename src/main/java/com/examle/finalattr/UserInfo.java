package com.examle.finalattr;

public class UserInfo {
    private final  String name="myname";
    private final String password=new String("mypassword");
    private final  static int age=defautlValue(1);
    private final static int sex=0;
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    private static <T> T defautlValue(T value){
        return value;
    }
}
