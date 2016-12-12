#设计模式6： 代理模式 Proxy Pattern

#### 定义
Proxy Pattern: Provide a surrogate or placeholder for another object to control access to it.
为其他对象提供一种代理以控制对这个对象的访问。

#### 类图
如果直接访问对象比较困难，或直接访问会给使用者或系统带来一系列问题。这样对于客户端（调用者）来说，就不需要直接与真实对象进行交互，解除了调用者与真实对象的耦合。
(img)

- **Subject 抽象主题角色**
	 抽象主题类可以是抽象类也可以是接口，是一个最普通的业务类型定义，无特殊要求。
- **RealSubject具体主题角色**
	也叫做被委托角色，带代理角色。它才是业务逻辑的具体执行者。
- **Proxy代理主题角色**
	也叫作委托类，代理类，它负责对真实对象的应用。把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完前后做预处理和善后工作。
#### 优缺点
优点：
	1	代理模式能够将调用用于真正被调用的对象隔离，在一定程度上降低了系统的耦合度；
	2	代理对象在客户端和目标对象之间起到一个中介的作用，这样可以起到对目标对象的保护。代理对象可以在对目标对象发出请求之前进行一个额外的操作，例如权限检查等。
缺点：
	1	由于在客户端和真实主题之间增加了一个代理对象，所以会造成请求的处理速度变慢
	2	实现代理类也需要额外的工作，从而增加了系统的实现复杂度。


#### 使用场景
在需要用比较通用和复杂的对象指针代替简单的指针的时候，使用 Proxy模式。下面是一些可以使用Proxy模式常见情况：
1) 远程代理（Remote  Proxy）为一个位于不同的地址空间的对象提供一个本地的代理对象。这个不同的地址空间可以是在同一台主机中，也可是在另一台主机中，远程代理又叫做大使(Ambassador)
2) 虚拟代理（Virtual Proxy）根据需要创建开销很大的对象。如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，真实对象只在需要时才会被真正创建。 
3) 保护代理（Protection Proxy）控制对原始对象的访问。保护代理用于对象应该有不同的访问权限的时候。
4) 智能指引（Smart Reference）取代了简单的指针，它在访问对象时执行一些附加操作。
5) Copy-on-Write代理：它是虚拟代理的一种，把复制（克隆）操作延迟到只有在客户端真正需要时才执行。一般来说，对象的深克隆是一个开销较大的操作，Copy-on-Write代理可以让这个操作延迟，只有对象被用到的时候才被克隆。

#### 代码
定义抽象类Subject
''public interface Subject {
'' 
''     void login();
'' }
'' 

实现具体的类，并实现具体的接口。
''public class RealSubject implements Subject{
''     @Override
''     public void login() {
''         try {
''             Thread.sleep(200);
''         } catch (InterruptedException e) {
''             e.printStackTrace();
''         }
''         System.out.println("login to the system.");
''     }
'' }
'' 

定义代理类，在代理类中增加预处理：权限检查和善后处理：记录日志。
''public class Proxy implements Subject {
'' 
''     private RealSubject subject = new RealSubject();
'' 
''     @Override
''     public void login() {
''         checkPermission();
''         subject.login();
''         log();
''     }
'' 
''     private void checkPermission(){
''         System.out.println("Proxy Check Access Permission");
''     }
'' a
''     private void log(){
''         System.out.println("Proxy Save Login Log ");
''     }
'' }
'' 

测试
''public class Client {
''     public static void main(String[] args) {
''         Subject subject = new Proxy();
''         subject.login();
''     }
'' }
'' 