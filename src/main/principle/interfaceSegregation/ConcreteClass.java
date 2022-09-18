package main.principle.interfaceSegregation;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/18 14:53
 * project: DesignPattern
 * Title: ConcreteClass
 * description: 实现数据读取与图表展示
 */
public class ConcreteClass implements IDataHandler,IChartHandler{

    private Logger concreteClassLogger = Logger.getLogger(this.getClass().getName());
    @Override
    public void createChart() {
        concreteClassLogger.info("2020144131汪亦涵：已创建图表！");
    }

    @Override
    public void displayChart() {
        concreteClassLogger.info("2020144131汪亦涵：图表已展示！");
    }

    @Override
    public void dataRead() {
        concreteClassLogger.info("2020144131汪亦涵：数据已读取！");
    }
}
