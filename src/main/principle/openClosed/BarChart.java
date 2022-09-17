package main.principle.openClosed;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 14:57
 * project: DesignPattern
 * Title: BarChart
 * description: 柱状图
 */
public class BarChart extends AbstractChart{

    private Logger barChartLogger = Logger.getLogger("BarChart");

    @Override
    public void display() {
        barChartLogger.info("2020144131汪亦涵柱状图已展示");
    }
}
