package com.bunhann.gitreview;

public class Data {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int sumValue(int sum1,int sum2){
        int totalSum=sum1+sum2;
        return totalSum;
    }
}
