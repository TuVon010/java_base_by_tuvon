package oop.Demo07;
//抽象类：extends
//类 可以实现接口 implements 接口
//实现了接口的类，就要实现接口中的方法
//伪多继承，利用接口实现伪多继承（多实现）
public class UserServiceImpl implements TimeService,UserService{
    @Override
    public void timer() {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void query() {

    }
}
