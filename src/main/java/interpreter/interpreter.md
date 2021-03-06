# 设计模式21 解释器模式 Interpreter Pattern


#### 定义
Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
给定一门语言，定义它的文法的一种表示，并定义一个解释器，改解释器使用该表示来解释语言中的句子。

#### 结构
(img)
  在GOF的书中指出：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。而且当文法简单、效率不是关键问题的时候效果最好。
这也就是解释器模式应用的环境了。
解释器模式组成的。
- 抽象表达式角色：声明一个抽象的解释操作，这个接口为所有具体表达式角色（抽象语法树中的节点）都要实现的。
什么叫做抽象语法树呢？《Java与模式》中给的解释为：抽象语法树的每一个节点都代表一个语句，而在每个节点上都可以执行解释方法。这个解释方法的执行就代表这个语句被解释。由于每一个语句都代表这个语句被解释。由于每一个语句都代表一个常见的问题的实例，因此每一个节点上的解释操作都代表对一个问题实例的解答。
-  终结符表达式角色：具体表达式。
	 实现与文法中的终结符相关联的解释操作,而且句子中的每个终结符需要该类的一个实例与之对应
- 非终结符表达式角色：文法中的每条规则对应于一个非终结表达式, 非终结表达式根据逻辑的复杂程度而增加,原则上每个文法规则都对应一个非终结符表达式.
- 上下文（环境）角色：包含解释器之外的一些全局信息。
- 客户角色：
	构建（或者被给定）表示该文法定义的语言中的一个特定的句子的抽象语法树
调用解释操作


#### 优点
解释器是一个简单语法分析工具，它最显著的优点就是扩展性，修改语法规则只要修改相应的非终结符表达式就可以了，若扩展语法，则只要增加非终结符类就可以了。

#### 缺点
1. 解释器模式会引起类膨胀，每个语法都要产生一个非终结符表达式，语法规则比较复杂时，可能产生大量的类文件，难以维护。
2. 解释器模式采用递归调用方法，它导致调试非常复杂。
3. 解释器由于使用了大量的循环和递归，所以当用于解析复杂、冗长的语法时，效率是难以忍受的