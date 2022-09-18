package main.principle.interfaceSegregation;

/**
 * @author sayCode
 * @date 2022/9/18 15:01
 * project: DesignPattern
 * Title: IReportHandler
 * description: 数据报表接口类
 */
public interface IReportHandler {

    /**
     * 创建数据报表
     */
    void createReport();

    /**
     * 展示数据报表
     */
    void displayReport();
}
