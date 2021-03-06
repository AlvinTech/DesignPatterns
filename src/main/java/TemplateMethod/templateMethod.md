#设计模式4：模板方法模式
#### 定义
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure. 
定义一个操作中的算法的框架，而将一些步骤延迟到子类实现。使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
模板方法模式非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的模式。其中AbstractClass叫做抽象模板，它的方法分为两类。
1. 基本方法
	 基本方法也叫做基本操作，是由子类实现的方法， 并且在模板方法中被调用。
2. 模板方法
	可以又一个或者多个，一般是一个具体方法，也就是一个框架，实现对基本方法的调用，完成固定的逻辑。
(img)

#### 关键特征
**意图** 定义一个操作中算法的骨架，将一些步骤推迟到子类中实现。可以不改变算法的结构而重新定义该算法的步骤。
**问题** 要完成在某一细节层次一致的一个过程或一系列步骤，但其个别步骤在更详细的层次上的实现可能不同.
**解决方案** 允许定义可变的子步骤，同时保持基本过程一致。
**参与者和协作者** Template Method 模式由一个抽象类组成，这个抽象类定义了需要覆盖的基本TemplateMehod方法。每个从这个抽象类派生的具体类将为此模板实现新方法。
**效果** 模板提供了一个很好的代码服用平台，它还有助于确保所需步骤的实现。它将每个Concrete类的覆盖步骤绑定起来，因此只有在这些变化总是并且只能一起发生时，才应该使用Template Method 模式。
**实现** 创建一个抽象类，用抽象方法实现一个过程。这些抽象方法必须在子类中实现，以执行过程的每个步骤。如果这些步骤是独立变化的，那么每个步骤都可以使用Strategy模式实现。

#### 优点
1. 封装了不变的部分，扩展了可变部分。
	吧认为是不变得部分的算法封装到父类中实现，而将可变部分的通过继承来继续扩展。
2. 提取了公共部分代码，便于维护。
3. 行为由父类控制，子类实现。
	 基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则。

#### 缺点
按照我们的习惯，抽象类负责声明最抽象，最一般的事物属性和方法，实现类完成具体的属性和方法。但是模板方法模式却颠倒，抽象类定义了部分抽象方法，由子类实现。子类执行的结构影响了父类的结果，也就是子类对父类产生了影响。在复杂的项目中，会给代码阅读带来困难。

#### 使用场景
1. 多个子类又共有的方法，并且逻辑基本相同。
2. 重要，复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
3. 重构是，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。

代码link Github.

