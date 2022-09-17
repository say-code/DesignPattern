package main.principle.singleResponsibility;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 11:12
 * project: SingleResponsibilityPrinciple
 * Title: CustomerDataChart
 * description: 调用连接并查询客户信息
 */
public class CustomerDAO {
    private Logger customerDAOLogger = Logger.getLogger("CustomerDAO");
    DBUtil util = new DBUtil();

    /**
     * 查找相应客户信息
     */
    public void findCustomers(){
        util.getConnection();
        customerDAOLogger.info("2020144131汪亦涵已找到所有客户信息！");
    }
}
