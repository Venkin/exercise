# 策略模式 2019-03-16

## 定义
指的是定义了算法家族，分别封装起来，让他们直接可以相互替换，此模式算法的变化不会影响到使用算法的用户。


## 应用场景
1. 假如系统有很多类，而他们的区别仅仅在于他们的行为不同。
2. 一个系统需要动态的在几种算法中选一个。

## 策略模式重构代码
之前使用了大量的if-else语句，使用策略+单例+工厂模式重构代码，是代码非常简洁
```java
class Test {
    
    public void test() {
        NumberWhite numberWhite = new NumberWhite();
            
        SynModel synModel = new SynModel("Create_NumberWhite",numberWhite);
            
        ConfigurationPushStrategy.getConfigurationPush(synModel).operate(synModel);
    }
}
```


