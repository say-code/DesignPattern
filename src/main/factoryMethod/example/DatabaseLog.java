package main.factoryMethod.example;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/28 14:23
 * project: DesignPattern
 * Title: DatabaseLog
 * description: 数据库日志
 */
public class DatabaseLog implements Log{

    private Logger databaseLog = Logger.getLogger("DatabaseLog");

    @Override
    public void writeLog() {
        databaseLog.info("2020144131汪亦涵在数据库中输入日志");
    }
}
