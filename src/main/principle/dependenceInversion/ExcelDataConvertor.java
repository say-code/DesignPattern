package main.principle.dependenceInversion;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 17:08
 * project: DesignPattern
 * Title: ExcelDataConvertor
 * description: excel文件读取
 */
public class ExcelDataConvertor implements IDataConvertor{

    Logger excelDataConvertor = Logger.getLogger("ExcelDataConvertor");

    @Override
    public void readFile(String filePath) {
        excelDataConvertor.info("2020144131汪亦涵已读取"+filePath+"下的Excel文件");
    }
}
