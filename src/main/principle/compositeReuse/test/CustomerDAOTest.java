package main.principle.compositeReuse.test;

import main.principle.compositeReuse.CustomerDAO;
import main.principle.compositeReuse.OracleDBUtil;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/18 15:33
 * project: DesignPattern
 * Title: CustomerDAOTest
 * description: 用户查询测试类
 */
public class CustomerDAOTest {



    @Test
    public void startTest(){

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.addCustomer();

        customerDAO.setDbName("Oracle");
        customerDAO.addCustomer();
    }
}
