package main.principle.interfaceSegregation;

/**
 * @author sayCode
 * @date 2022/9/18 14:52
 * project: DesignPattern
 * Title: IChartHandler
 * description: 图表接口类
 */
public interface IChartHandler {

    /**
     * 创建图表
     */
    void createChart();

    /**
     * 展示图表
     */
    void displayChart();

}
