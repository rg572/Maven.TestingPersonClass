package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String catchPhrase;
    private String nemesis;
    private Boolean consul;
    private String praetorialProvince;
    private Integer triumphs;

    public Person() {
        // this.name = "Marcus Porcius Cato Major";
        // this.age = 2253;
        // this.catchPhrase = "Ceterum censeo Carthaginem esse delendam";
        // this.nemesis = "Carthage";
        // this.consul = true;
        // this.praetorialProvince = "Sardinia";
        // this.triumphs = 1;
        // System.out.println(this.catchPhrase);

        this.name = "";
        this.age = Integer.MAX_VALUE;

        this.catchPhrase = "";
        this.nemesis = "";
        this.consul = false;
        this.praetorialProvince = "";
        this.triumphs = 0;
    }

    public Person(int age) {
        this.name = "";
        if(age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        if(age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }


    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return this.catchPhrase;
    }


    public void setNemesis(String nemesis){ this.nemesis = nemesis; }

    public String getNemesis(){ return this.nemesis;}


    public void setConsul(Boolean consul) {this.consul = consul;}

    public Boolean getConsul() {return this.consul;}


    public void setPraetorialProvince(String province){this.praetorialProvince = province;}

    public String getPraetorialProvince(){ return this.praetorialProvince;}


    public void setTriumphs(Integer triumphs){
        if(triumphs > 0) {
            this.triumphs = triumphs;
        }
        else {
            this.triumphs = 0;
        }
    }

    public Integer getTriumphs(){ return this.triumphs;}


}
