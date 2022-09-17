package main.principle.openClosed;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 14:51
 * project: DesignPattern
 * Title: PieChart
 * description: 饼状图
 */
public class PieChart extends AbstractChart{

    private Logger pieChartLogger = Logger.getLogger(getClass().getName());

    @Override
    public void display() {
        pieChartLogger.info("2020144131汪亦涵饼状图已展示");
    }
}
