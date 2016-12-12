#设计模式3：抽象工厂 Abstract Factory Pattern

#### 定义
Abstract Factory Pattern: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
为创建一组相关或者相互依赖的对象提供一个接口，而且无需指定他们的具体类。
有时候，几个对象需要以一种协调的方式实现实例化。例如，在处理用户界面时，系统可能需要在一个操作系统上用一组对象，在另外一个操作系统上用另外一组对象。Abstract Factory 模式能够确保系统总是根据情况获得正确的对象。

#### 关键特征

**意图** 需要为特定的客户提供对象组

**问题** 需要实例化一组相关的对象

**解决方案** 协调对象的创建。提供一种方式，将如何执行对象实例化的规则从使用这些对象的客户对象提取出来。

**参与者和协作者** AbstractFactory 为如何创建对象组的每个成员定义接口。一般每个组都是由独立的ConreteFactory进行创建。

**效果** 这个模式将“使用哪些对象”的规则与“如何使用这些对象”的逻辑分离开来。

**实现** 定义一个抽象类来制定创建哪些对象，然后为每个组实现一个具体类。可以用表或者文件完成相同的任务。
(img)

#### 优点
1. 封装性，每个产品的实现不是高层模块要关系的，它要关系的是接口，抽象类，它并不关心对象是如何创建出来的。 工厂类负责对象的创建，而且工厂类只需要知道需要创建的东西有哪些，无需关心怎么使用这些东西。
2. 产品族内的约束为非公开状态。假设有这样的一个约束，没生产一个A，就需要生成2个B。这样的生产约束对调用工厂类的上层模块来说是透明的。它不需要知道这个约束，具体的产品族内的约束由工厂控制。

#### 缺点
1. 抽象工厂模式最大的缺点就是产品族扩展非常困难.我们以通用代码为例，如果要增加一个产品C，也就是说产品族由原来的2个增加到了3个。抽闲类AbstractCreator 需要增加一个方法CreateProductC，然后两个实现类都需要修改，则严重违反了开闭原则。

#### 使用场景
抽象工厂模式的使用场景定义非常简单：一个对象族都有相同的约束，则可以使用抽象工厂模式。在抽象工厂模式的缺点中，我们提到抽象工厂模式的产品族扩展比较困难，但是产品等级扩展则非常容易。增加一个产品等级，只要增加一个工厂类负责新增加出来的产品的生产任务即可。也就是说横向扩展很容易，但是纵向扩展困难。

#### 案例
设计一个计算机系统，显示并打印取自数据库的几何图形。用来显示和打印形状的分辨率类型取决于当前运行系统的计算机：CPU的速度和内存。系统必须留意自己对计算机的要求。难点在于，系统必须控制使用哪种驱动程序：低配置及其使用低分辨率驱动程序，高配置机器使用高分辨率驱动程序。
低分辨率组：LRDD 和LRPD ，这些驱动程序系统提出的要求较低。
高分辨率组：HRDD 和 HRPD， 这些驱动程序对系统的要求较高。
解决方案1. 可以使用switch语句来控制驱动程序的选择。
'' class ApControl{
''     public void doDraw(){
'' 		switch(Resolution)
'' 			case LOW: use lrdd
'' 			case HIGH: use hrdd
''     }
'' 	public void doPrint(){
'' 		switch(Resolution)
'' 			case LOW: use lrpd
'' 			case HIGH: use hrpd
'' 	}
'' }
虽然这样能满足设计需求，但是决定使用哪个驱动程序的规则和驱动程序的使用混杂在一起。因此耦合度和内聚性上都存在问题。

''public abstract  class DisplayDriver {
''     String text = "This is ${resolution} display  driver";
''     public abstract void display();
'' }

'' 
'' public abstract class PrintDriver {
''     String text = "This is ${resolution} print driver";
''     public abstract void print();
'' }

'' public abstract  class DisplayDriver {
''     String text = "This is ${resolution} display  driver";
''     public abstract void display();
'' }

'' public class HRDisplayDriver extends DisplayDriver {
''     private String resolution = "HIGH Resolution";
''     @Override
''     public void display() {
''         System.out.println(text.replace("${resolution}",resolution));
''     }
'' }
 
'' public class HRPrintDriver extends PrintDriver {
''     private  String resolution = "HIGH Resolution";
''     @Override
''     public void print() {
''         System.out.println(text.replace("${resolution}",resolution));
''     }
'' }

'' public class LRDisplayDriver extends DisplayDriver {
''     private  String resolution = "LOW Resolution";
''     @Override
''     public void display() {
''         System.out.println(text.replace("${resolution}",resolution));
''     }
'' }

'' public abstract class AbstractFactory {
''     public abstract DisplayDriver getDisplayDriver();
''     public abstract PrintDriver getPrintDriver();
'' }
 
'' public class LRFactory extends AbstractFactory {
''     public LRFactory(){
''         System.out.println("=================== User LOW Resolution Factory =================");
''     }
''     @Override
''     public DisplayDriver getDisplayDriver() {
''         return new LRDisplayDriver();
''     }
'' 
''     @Override
''     public PrintDriver getPrintDriver() {
''         return new LRPrintDriver();
''     }
'' }

'' public class HRFacoty extends AbstractFactory {
'' 
''     public HRFacoty(){
''         System.out.println("================= User HIGH Resolution Factory=================== ");
''     }
'' 
''     @Override
''     public DisplayDriver getDisplayDriver() {
''         return  new HRDisplayDriver();
''     }
'' 
''     @Override
''     public PrintDriver getPrintDriver() {
''         return new HRPrintDriver();
''     }
'' }

'' public class Client {
''     public static void main(String[] args) {
''         AbstractFactory factory = null;
''         DisplayDriver displayDriver = null;
''         PrintDriver printDriver = null;
''         factory = new LRFactory();
''         displayDriver = factory.getDisplayDriver();
''         printDriver = factory.getPrintDriver();
''         displayDriver.display();
''         printDriver.print();
'' 
''         factory = new HRFacoty();
''         displayDriver = factory.getDisplayDriver();
''         printDriver = factory.getPrintDriver();
''         displayDriver.display();
''         printDriver.print();
''     }
'' }

'' =================== User LOW Resolution Factory 
'' This is LOW Resolution display  driver
'' This is LOW Resolution print driver
'' ================= User HIGH Resolution Factory
'' This is HIGH Resolution display  driver
'' This is HIGH Resolution print driver
'' 




















