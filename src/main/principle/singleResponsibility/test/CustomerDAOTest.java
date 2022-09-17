package main.principle.singleResponsibility.test;

import main.principle.singleResponsibility.CustomerDAO;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/17 13:31
 * project: SingleResponsibilityPrinciple
 * Title: CustomerDAOTest
 * description: CustomerDAO测试
 */
public class CustomerDAOTest {

    CustomerDAO customerDAO = new CustomerDAO();

    @Test
    public void findCustomersTest(){
        customerDAO.findCustomers();
    }
}
