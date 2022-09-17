package main.principle.singleResponsibility.test;

import main.principle.singleResponsibility.CustomerDataChart;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/17 13:33
 * project: SingleResponsibilityPrinciple
 * Title: CustomerDataChart
 * description: customerDataChart测试
 */
public class CustomerDataChartTest {

    CustomerDataChart customerDataChart = new CustomerDataChart();

    @Test
    public void ChartTest(){
        customerDataChart.createChart();
        customerDataChart.displayChart();
    }
}
