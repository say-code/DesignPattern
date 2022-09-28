package main.factoryMethod.ImgRead;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/28 15:24
 * project: DesignPattern
 * Title: JpgReader
 * description: jpg图片读取器
 */
public class JpgReader implements ImageReader{
    @Override
    public void readImg() {
        Logger jpgReaderLogger = Logger.getLogger("JpgReader");
        jpgReaderLogger.info("2020144131汪亦涵已读取jpg文件");
    }
}
