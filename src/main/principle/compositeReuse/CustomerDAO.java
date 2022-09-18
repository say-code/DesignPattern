package main.principle.compositeReuse;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/18 15:20
 * project: DesignPattern
 * Title: CustomerDAO
 * description: 查询客户信息
 */
public class CustomerDAO {

    private String dbName = "MySql";

    private IDBUtil dbUtil;

    private Logger customerDAOLogger = Logger.getLogger(this.getClass().getName());

    public CustomerDAO(){
        dbUtilInitialize();
    }

    /**
     * 数据库连接对象初始化，默认为mysql，通过 set方法注入来调整
     */
    private void dbUtilInitialize(){

        try {
            //获取当前类所在位置并获取字节码对象
            Class<?> clazz = Class.forName(this.getClass().getPackage().getName()+"."+dbName+"DBUtil");
            //利用字节码创建相应类
            this.dbUtil = (IDBUtil)clazz.newInstance();
            customerDAOLogger.info("2020144131汪亦涵：数据库"+dbName+"连接成功！");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 设置数据库连接方式，并初始化数据库
     * @param dbName 数据库名 目前已支持Oracle，MySql（注意大小写）
     */
    public void setDbName(String dbName){
        this.dbName = dbName;
        dbUtilInitialize();
    }

    /**
     * 添加用户
     */
    public void addCustomer(){
        customerDAOLogger.info("2020144131汪亦涵：用户添加成功！");
    }
}
