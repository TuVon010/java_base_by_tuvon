package oop.Demo07;
//interface,定义的关键字，接口都需要
//举例，接口实现增删改查
public interface UserService {
    //接口中所有的定义其实都是默认的抽象的public abstract
    public abstract void add(String name);//看这里是灰色的，就是写不写都不影响,修饰符 'abstract' 对于接口方法是冗余的
    void delete();
    void update();
    void query();
}
