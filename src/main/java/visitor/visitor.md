#设计模式19 访问者模式 Visitor Pattern

#### 定义
Represent an operation to be preformed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
封装一些作用于某种数据结构中的各元素操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作


#### 结构

类图
(img)
- Visitor 抽象访问者
	抽象类或者接口，声明访问者可以访问那些元素，具体程序中就是visit方法的参数定义哪些对象是可以被访问的。
- ConcreteVisitor 具体的访问者
	它影响访问者访问到一个类之后怎么处理。
- Element 抽象元素类
	接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的。
- ConcreteElement 具体元素
	实现accept方法，通常是Visitor.visit(this),基本上都形成了一种模式。
- ObjectStructure 结构对象
	元素生产者，一般容纳在多个不同类，不同接口的容器。List 、Set、 Map 等




#### 优点
1. 符合单一职责原则
	具体元素角色负责数据的加载，而Visitor类则负责数据的处理，而两个不同的职责非常明确的分离开来，各自演绎变化。
2. 优秀的扩展性
	由于职责分开，继续增加对数据的操作是非常快捷的。
3. 灵活性非常高
	


#### 缺点
1. 具体元素对访问者公布细节
	访问者要访问一个类就必须要求这个类公布一些方法和数据，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的。
2. 具体元素变更比较困难
	具体元素角色的增加，删除，修改都是比较困难的。增加元素之后visit都需要修改。
3. 违背依赖倒置原则
	访问者依赖的是具体元素，不是抽象元素，这就破坏了依赖倒置原则，特别是在面向对象的编程中，抛弃了对接口的依赖，而直接依赖实现类，扩展比较难。



#### 使用场景
- 一个对象结构包含很多对象，他们有不同的接口，而你想对这些对象实施一些依赖与具体的操作，也就是说用迭代器模式已经不能胜任的情景。
- 需要对一个对象结构中的对象进行很多不同并不相关的操作，而你想避免让这些操作“污染”这些对象的类。
	总结一下，在这种地方你一定要考虑使用访问者模式：业务规则要求遍历多个不同的对象。这本身也就是访问者模式出发点，迭代器模式只能访问类或同接口的数据，而访问者模式是对迭代器模式的扩充，可以遍历不同的对象，然后执行不同的操作，也就是针对访问者的对象不同，执行不同的操作。访问者模式还有一个用途，就是充当拦截器角色。