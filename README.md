# 设计模式

GitHub:https://github.com/say-code/DesignPattern

## 传送锚点

- [常用面向对象设计原则](#常用面向对象设计原则)
- [创建型模式](#创建型模式)

## 代码环境

jdk 1.8

JUnit 4.13.1

dom4j 2.1.3 (在lib文件夹中，可直接导入项目)

## 常用面向对象设计原则

- 单一职责原则

  一个对象应该只包含单一的职责，并且该职责被完整的封装在一个类中

  [代码位置](./src/main/principle/singleResponsibility)

- 开闭原则

  软件实体应该对扩展开放，对修改关闭

  [代码位置](./src/main/principle/openClosed)

- 里氏代换原则

  所有引用基类的地方必须能透明地使用其子类对象

  [代码位置](./src/main/principle/richterSubstitution)

- 依赖倒转原则

  高层模块不应该依赖底层模块，他们都应该依赖抽象。抽象不应该依赖于细节，细节应该依赖于抽象。

  [代码位置](./src/main/principle/dependenceInversion)	

- 接口隔离原则

  客户端不应该依赖那些不需要的接口

  [代码位置](./src/main/principle/interfaceSegregation)	

- 合成复用原则

  优先使用对象组合，而不是继承来达到复用的目的

  [代码位置](./src/main/principle/compositeReuse)	

## 创建型模式

- 简单工厂模式

  定义一个类，根据参数的不同给返回不同类的实例，这些类具有公共的父类和一些公共的方法，简单工厂模式不属于GoF设计模式，他是最简单的工厂模式。

- 工厂方法模式

  定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式使一个类的实例化延迟到其子类。

- 抽象工厂模式

  提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类

- 建造者模式

  将一个复杂对象的构建与它的表示分离，使得同样的构建过曾可以创建不同的表示

- 原型模式

  用原型实例指定创建对象的种类，并且通过拷贝这个原型来创建新的对象

- 单例模式

  保证一个类仅有一个实例，并提供一个访问它的全局访问点

- 工厂方法模式实例之日志记录器 [代码位置](./src/main/factoryMethod/example)

- 简单计算器 [代码位置](./src/main/factoryMethod/simpleCalculator)

- 图片读取器 [代码位置](./src/main/factoryMethod/ImgRead)

