# 设计模式9： 命令模式 Command Pattern

#### 定义
Encapsulate a request as an object , thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。

命令模式比较简单，但是在项目中非常频繁的使用，因为他的封装性非常好，吧请求和执行方分开了，扩展性也有非常好的保障。用于“行为请求者”与“行为实现者”解耦，可实现二者之间的松耦合，以便适应变化。分离变化与不变的因素。

#### 结构
类图
(img)
- Command
	定义命令的接口，声明执行的方法。
- ConcreteCommand
	命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
- Receiver
	接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
- Invoker
	要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
- Client
	创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，或许，把这个Client称为装配者会更好理解，因为真正使用命令的客户端是从Invoker来触发执行。

协作：
1. client创建一个ConcreteCommand对象并指定它的Receiver对象
2. 某Invoker对象存储该ConcreteCommand对象
3. 该Invoker通过调用Command对象的execute操作来提交一个请求。若该命令是可撤销的，ConcreteCommand在执行execute操作前存储当前状态以用于取消该命令
4. ConcreteCommand对象调用它的Receiver的操作以执行该请求命令对象将动作和接受者包进对象中，这个对象只暴露出一个execute()方法，当此方法被调用的时候，接收者就会进行这些动作。从外面来看，其他对象不知道究竟哪个接收者进行了哪些动作，只知道如果调用execute()方法，请求的目的就能达到。 
#### 优点
1. 类间解耦
	调用者角色与接受者角色之间没有任何依赖关系，调用者实现功能时只需要调用Command抽象类的execute方法就可以，不需要了解到底是哪个接受者执行。
2. 可扩展性
	Command的子类可以非常容易的扩展，而调用者Invoker和高层的模块Client不产生严重的代码耦合。
3. 命令模式和其他模式结合会更优秀
	命令模式可以结合责任链模式，实现命令足解析任务；结合模板方法模式，则可以减少Command子类的膨胀。


#### 缺点
Command膨胀问题。如果有N个命令，Command就是N个子类，这个类会膨胀的非常大。