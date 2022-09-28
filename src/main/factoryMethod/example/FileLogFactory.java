package main.factoryMethod.example;

/**
 * @author sayCode
 * @date 2022/9/28 14:25
 * project: DesignPattern
 * Title: FileLogFactory
 * description: 文件日志工厂类
 */
public class FileLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
