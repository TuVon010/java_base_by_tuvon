package oop.Demo04;
//人类
//在java中所有类都默认直接或间接继承object类
public class Person {
    //public
    //protected
    //default
    //private
   public  Person(){
       System.out.println("person无参执行了");
   }

    private int money=10_000;
    protected String name ="junan";
    public  void say(){
        System.out.println("hello说了一句话");
    }

    //private 类型的方法也不能被继承，就是私有的都不能被继承,
    // 如果私有不能在子类中super.print(）
    public void print(){
        System.out.println("Student");
    }
    //通过公共方法来访问私有变量
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
