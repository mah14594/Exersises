package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if (age<100 && age>0){
            this.age=age;
        }
        else {
            this.age=0;
        }

    }
    public boolean isTeen(){
        if(this.age>12 && this.age<20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        String fName=this.getFirstName();
        String sName=this.getLastName();
        if (fName.isEmpty() && sName.isEmpty()){
            return "";
        }
        else if (sName.isEmpty()){
            return fName;
        }
        else if(fName.isEmpty()){
            return sName;
        }
        return fName+" "+sName;
    }
}
