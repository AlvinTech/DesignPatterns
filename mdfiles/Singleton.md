#设计模式1：单例模式

####定义
Singleton： Ensure a class has only one instance, and provide a global point of access to it.
####关键特征
**意图**：希望对象只有一个实例，但没有控制对象实例化的全局对象。还希望确保所有实体使用该对象相同的实例，而无需将引用传给它们。
**问题**：几个不同的客户对象需要引用同一个对象，而且希望确保这种类型的对象数目不超过一个。
**解决方案**：保证一个实例。
**参与者于协作者**：Client 对象只能通过getInstance 方法创建Singleton 实例。
**效果**：Client对象无需操心是否已经存在Singleton对象实例。这是由Singleton自己控制的。
**通用类图**：

￼(img)
			  Singleton 模式通用结构图
####优点
1. 由于单例模式在内存中只有一个实例，减少了内存的开销，特别是一个对象需要频繁地创建、销毁时，而且创建或销毁时性能无法优化，单例模式的优势就非常明显。
2. 由于单例模式只有一个实例，所以减少了系统的系能开销，当一个对象的产生需要较多的资源时，如读取配置、产生其他依赖对象时，则可以总过在应用程序启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。
3. 单例模式可以避免对资源的多重占用，例如一个写文件动作，由于只有一个实例存在内存中，避免对同一个资源文件的同时写操作。
4. 单例模式可以在系统设置全局的访问点，优化和共享资源访问，例如可以设计一个单例类，负责所有数据表的映射处理。
####缺点
- 单例模式一般没有接口，扩展很难。若要扩展，除了修改代码基本没有第二种实现。
- 单例模式对测试是不利的。在并行开发环境中，如果单例模式没有完成，是不能进行测试的。没有接口也不能使用mock的方式虚拟一个对象。
- 单例模式与单一职责原则有冲突。一个类应该只实现一个逻辑，而不关心它是否是单例的，是不是要单例取决于环境，单例模式把要单例和业务逻辑融合在一个类中。

####使用场景
在一个系统中，要求一个类且仅有一个对象，如果出现多个对象就会出现“不良反应”，可以采用单例模式，具体的场景如下：
- 要求生成唯一序列号的环境。
- 在整个项目中需要一个共享访问点或共享数据，例如一个Web页面上的计数。可以不用每次刷新都记录到数据库中，使用单例模式保持计数器的值，并确保是线程安全的。
- 创建一个对象需要消耗的资源过多，如果要访问IO和数据库等资源。
- 需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式。
####饿汉
''package singleton;
''
'' /**
''  * Created by Alvin on 16/10/9.
''  */
'' public class Singleton {
''     private static Singleton instance = new Singleton();
''     private static int singletonDate ;
''
''     private Singleton(){}
''
''     public static Singleton getInstance(){
''         singletonDate++;
''         return instance;
''     }
''
''     public int getSingletonDate(){
''         return singletonDate;
''     }
'' }
''
####懒汉
'' public class SingletonLazy {
''     private static SingletonLazy instance ;
''
''     private SingletonLazy(){}
''
''     public SingletonLazy getInstance(){
''         if(null == instance){
''             instance = new SingletonLazy();
''         }
''         return instance;
''     }
'' }
####多线程问题
对于SingletonLazy 需要注意多线程问题，在系统压力增大的情况下，内存中可能出现两个对象。
''public class DoubleCheckSingleton {
''     private static DoubleCheckSingleton instance;
''
''     private DoubleCheckSingleton(){}
''
''     public static DoubleCheckSingleton getInstance(){
''         if(instance == null){
''             synchronized (DoubleCheckSingleton.class){
''                 if(instance == null){
''                     instance = new DoubleCheckSingleton();
''                 }
''             }
''         }
''         return instance;
''     }
'' }
''
提到在c\+\+单例中广泛使用的double-check locking，在java中是无效的：
    “在Java编译器中，DoubleCheckSingleton类的初始化与instance变量赋值的顺序不可预料。如果一个线程在没有同步化的条件下读取instance引用，并调用这个对象的方法的话，可能会发现对象的初始化过程尚未完成，从而造成崩溃。”也就是Java编译器本身的优化工作会在构造方法实例化对象之前从构造方法返回指向该对象的指针，从而暴露了未构造完整的对象。在jdk1.5 之后，可以采用volatile 来使其生效。在Java5之后，有一个所谓的“happens-before”的概念，在每一个构造函数结束的地方都有一个freeze动作，在构造函数返回前，所有的final成员变量都要完成初始化。
In JVMs prior to 1.5, volatile would not ensure that it worked (your mileage may vary). Under the new memory model, making the instance field volatile will "fix" the problems with double-checked locking, because then there will be a happens-before relationship between the initialization of the Something by the constructing thread and the return of its value by the thread that reads it."
[]
####Initialization On Demand Holder idiom
JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。在执行类的初始化期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化。
基于这个特性，可以实现另一种线程安全的延迟初始化方案（这个方案被称之为Initialization On Demand Holder idiom）：
''public class SingletonClass {
''     private static class InstanceHolder{
''          static final SingletonClass instance = new SingletonClass();
''     }
''     private SingletonClass(){}
''
''     public static SingletonClass getInstance(){
''         return InstanceHolder.instance;
''     }
'' }
''
这个方案之所奏效，是因为内部类 InstanceHolder 将只被装载一次，所以只会创建一个instance对象。

参考文献：
1. [http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization]
2. [http://www.javaworld.com/article/2074979/java-concurrency/double-checked-locking--clever--but-broken.html]
3. 秦小波. 设计模式之禅\[M\]. 机械工业出版社, 2014.
4. (美)沙洛维(Shalloway, A. ), (美)特罗特(Trott,等. 设计模式解析: 第2版 : 修订版\[\M]. 人民邮电出版社, 2012.
