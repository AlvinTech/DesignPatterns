#设计模式7： 原型模式 Prototype Pattern

#### 定义
Prototype Pattern: Specify the kind of objects to create using a prototypical instance , and create new object by cloning.
用原型实例指定创建的种类，并且通过拷贝这些原型创建新的对象。

原型模式是一种创建型设计模式,它通过复制一个已经存在的实例来返回新的实例,而不是新建实例.被复制的实例就是我们所称的原型,这个原型是可定制的.
原型模式多用于创建复杂的或者耗时的实例, 因为这种情况下,复制一个已经存在的实例可以使程序运行更高效,或者创建值相等,只是命名不一样的同类数据.
原型模式中的拷贝分为"浅拷贝"和"深拷贝":
浅拷贝: 对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象.
深拷贝: 对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制.

#### 结构
原型模式要求对象实现一个可以“克隆”自身的接口，这样就可以通过复制一个实例对象本身来创建一个新的实例。这样一来，通过原型实例创建新的对象，就不再需要关心这个实例本身的类型，只要实现了克隆自身的方法，就可以通过这个方法来获取新的对象，而无须再去通过new来创建。
　　原型模式有两种表现形式：（1）简单形式、（2）登记形式，这两种表现形式仅仅是原型模式的不同实现。
(img)

这种形式涉及到三个角色：
　　（1）客户(Client)角色：客户类提出创建对象的请求。
　　（2）抽象原型(Prototype)角色：这是一个抽象角色，通常由一个Java接口或Java抽象类实现。此角色给出所有的具体原型类所需的接口。
　　（3）具体原型（Concrete Prototype）角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口。


#### 优点
1. 性能优良。
	原型模式是在内存进行二进制的拷贝，要逼new 一个新对象性能要好很多。特别是要在一个循环体内产生大量的对象时，原型模式可以很好的表现这一点。
2. 逃避构造函数的约束。
	这是优点同时也是缺点，直接在内存中进行拷贝，构造函数不会被执行。