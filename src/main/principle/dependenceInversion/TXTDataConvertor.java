package main.principle.dependenceInversion;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 17:05
 * project: DesignPattern
 * Title: TXTDataConvertor
 * description: txt文件读取
 */
public class TXTDataConvertor implements IDataConvertor{

    Logger txtDataConvertor = Logger.getLogger("TXTDataConvertor");

    @Override
    public void readFile(String filePath) {
        txtDataConvertor.info("2020144131汪亦涵已读取"+filePath+"路径下的txt文件！");
    }
}
