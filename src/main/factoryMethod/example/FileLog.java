package main.factoryMethod.example;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/28 14:20
 * project: DesignPattern
 * Title: FileLog
 * description: 文件日志
 */
public class FileLog implements Log{

    private Logger fileLog = Logger.getLogger("FileLog");
    @Override
    public void writeLog() {
        fileLog.info("2020144131汪亦涵在文件中输入日志");
    }
}
