# 设计模式

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