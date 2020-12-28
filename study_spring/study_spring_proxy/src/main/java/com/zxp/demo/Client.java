package com.zxp.demo;

public class Client {
    public static void main(String[] args) {
        // 真实的角色
        UserImpl user = new UserImpl();
        // 代理角色，不存在
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(user); // 设置要代理的对象
        // 动态生成代理类
        User proxy = (User) handler.getProxy();

        proxy.add();
    }
}
