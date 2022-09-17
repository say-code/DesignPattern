package main.principle.openClosed.test;

import main.principle.openClosed.BarChart;
import main.principle.openClosed.ChartDisplay;
import main.principle.openClosed.LineChart;
import main.principle.openClosed.PieChart;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/17 15:06
 * project: DesignPattern
 * Title: ChartDisplayTest
 * description: 测试图表展示类
 */
public class ChartDisplayTest {

    ChartDisplay chartDisplay = new ChartDisplay();

    @Test
    public void barChartTest(){
        BarChart barChart = new BarChart();
        chartDisplay.setChart(barChart);
        chartDisplay.display();
    }

    @Test
    public void pieChartTest(){
        PieChart pieChart = new PieChart();
        chartDisplay.setChart(pieChart);
        chartDisplay.display();
    }

    @Test
    public void lineChartTest(){
        LineChart lineChart =  new LineChart();
        chartDisplay.setChart(lineChart);
        chartDisplay.display();
    }
}
