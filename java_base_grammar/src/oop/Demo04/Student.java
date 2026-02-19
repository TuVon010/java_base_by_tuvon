package oop.Demo04;

public class Student {
    /*
    1.提高程序的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口
    **/
    //属性私有
    //名字
    private String name;
    //学号
    private int id;
    //年龄
    private int age;
    //性别
    private char sex;

    //提供一些操作私有属性的方法
    //提供一些public的get ，set方法
    //get获得这个属性
    public String getName(){
        return this.name;
    }

    //set，给这个数据设置值
    public void setName(String name){
        this.name=name;
    }
    // alt+insert 自动生成get/set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<120&&age>0){
            this.age = age;
        }
        else{
            this.age=-1;
            System.out.println("年龄不合法");
        }
    }
    //学习()
    //睡觉()
}
