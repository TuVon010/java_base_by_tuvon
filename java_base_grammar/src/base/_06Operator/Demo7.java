package base._06Operator;

public class Demo7 {
    public static void main(String[] args) {
        //二元运算符
        int a=10;
        int b=20;
        a+=20;
        System.out.println(a);
        //字符串连接符  +  ，String
        System.out.println("string"+a+b);//都转换成String进行连接
        System.out.println(""+a+b);//3020
        System.out.println(a+b+"");//50
        System.out.println(a+b+"啊啊啊啊");//50啊啊啊啊
        //注意这个细节，数字放前面是先运算再拼接


        //三元运算符
        //X:a?b
        //为真则取值a,为假则取值b
        int score=50;
        String type = score<60?"不及格":"及格";
        System.out.println(type);

    }


}
