package main.principle.singleResponsibility;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 13:18
 * project: SingleResponsibilityPrinciple
 * Title: CustomerDataChart
 * description: 获取客户信息并生成相应图表
 */
public class CustomerDataChart {
    private Logger customerDataChartLogger = Logger.getLogger("CustomerDataChart");
    CustomerDAO customerDAO = new CustomerDAO();

    /**
     * 创建图表
     */
    public void createChart(){
        customerDAO.findCustomers();
        customerDataChartLogger.info("2020144131汪亦涵已创建图表。");
    }

    /**
     * 展示图表
     */
    public void displayChart(){
        customerDataChartLogger.info("2020144131汪亦涵已展示图表。");
    }
}
