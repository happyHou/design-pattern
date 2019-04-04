#装饰器模式
- 常见的有java中的io
DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("java.txt")));
- 在head first中列举
- 类应该对修改关闭，对扩展开放。（开放关闭-原则）

如果不用装饰器模式设计java中的io类，那就会使用到继承。根据原则，应该使用组合，少用继承。
装饰器是继承的一个替代

装饰器模式
- 装饰着和被装饰对象有相同的超类型
- 装饰者可以在所委托的行为前/后,加上特定的行为。

定义
- 装饰者模式动态的将责任附加到对象身上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

demo
- 我们使用星巴克的咖啡做例子，咖啡+牛奶+拿铁
    
    


