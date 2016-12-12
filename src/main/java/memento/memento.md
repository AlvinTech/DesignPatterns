#设计模式18 备忘录模式 Memento Pattern

#### 定义
Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.

在不破坏封装性的前提下，捕获一个对象的内部状态，并在改对象之外保护这个状态，这样以后就可以将该对象恢复到原先保存的状态。


#### 结构

- Originator 发起人角色
	记录当前时刻的内部状态，负责定义那些属于备份范围内的状态，负责创建和恢复备忘录记录。
- Memento备忘录角色
	负责存储Originator发起人对象的内部状态，在需要的时候提供发起人需要的内部状态
- Caretaker 备忘录管理员角色
	对备忘录进行管理，保存和提供备忘录。



#### 使用场景
- 需要保存和恢复数据的相关状态场景
- 提供一个可回滚的操作。
- 需要监控的副本场景中。


#### 注意事项
- 备忘录的生命期
	备忘录创建出来就要在最近的代码中使用，要主动管理他的生命周期，建立及要使用，在不适用的时候就删除其引用。
- 备忘录的性能
	不要在频繁建立备份的场景中使用备忘录模式，不容易控制备忘录建立的数量，其次大对象的建立是要消耗资源的。