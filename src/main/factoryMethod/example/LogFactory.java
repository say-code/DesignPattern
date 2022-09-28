package main.factoryMethod.example;

/**
 * @author sayCode
 * @date 2022/9/28 14:16
 * project: DesignPattern
 * Title: LogFactory
 * description: Log工厂
 */
public interface LogFactory {
    /**
     * 创建日志类
     * @return 日志
     */
    Log createLog();
}
