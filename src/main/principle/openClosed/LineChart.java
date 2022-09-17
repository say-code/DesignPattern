package main.principle.openClosed;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 15:00
 * project: DesignPattern
 * Title: LineChart
 * description: 线状图
 */
public class LineChart extends AbstractChart{

    private Logger lineChartLogger = Logger.getLogger("LineChart");

    @Override
    public void display() {
        lineChartLogger.info("2020144131汪亦涵线状图已展示");
    }
}
