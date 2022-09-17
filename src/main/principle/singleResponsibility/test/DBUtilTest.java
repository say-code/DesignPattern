package main.principle.singleResponsibility.test;


import main.principle.singleResponsibility.DBUtil;
import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/17 13:29
 * project: SingleResponsibilityPrinciple
 * Title: DBUtilTest
 * description: DBUtil测试
 */
public class DBUtilTest {

    DBUtil dbUtil = new DBUtil();

    @Test
    public void getConnectionTest(){
        dbUtil.getConnection();
    }
}
