package main.principle.compositeReuse;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/18 15:14
 * project: DesignPattern
 * Title: OracleDBUtil
 * description: Oracle数据库连接实现
 */
public class OracleDBUtil implements IDBUtil{

    private Logger oracleDBUtil = Logger.getLogger(this.getClass().getName());

    @Override
    public void getConnection() {
        oracleDBUtil.info("2020144131汪亦涵：Oracle数据库已连接");
    }
}
