package main.factoryMethod.example;

/**
 * @author sayCode
 * @date 2022/9/28 14:26
 * project: DesignPattern
 * Title: DatabaseLogFactory
 * description: 数据库日志工厂类
 */
public class DatabaseLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
