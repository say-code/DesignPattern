package main.principle.openClosed;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 14:42
 * project: DesignPattern
 * Title: ChartDisplay
 * description: 用于客户端展示图表
 */
public class ChartDisplay {
    AbstractChart chart;

    private Logger chartDisplayLogger = Logger.getLogger("ChartDisplay");

    /**
     * 设置图表类型
     * @param abstractChart 传入图表
     */
    public void setChart(AbstractChart abstractChart){
        this.chart = abstractChart;
    }

    public void display(){
        if (chart == null){
            chartDisplayLogger.info("2020144131汪亦涵：请先调用setChart方法设置相应类");
        }
        else {
            chart.display();
        }
    }
}
