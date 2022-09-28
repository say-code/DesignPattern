package main.factoryMethod.ImgRead;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/28 15:18
 * project: DesignPattern
 * Title: GifReader
 * description: Gif图片读取器
 */
public class GifReader implements ImageReader{
    @Override
    public void readImg() {
        Logger gifReaderLogger = Logger.getLogger("GIfReader");
        gifReaderLogger.info("2020144131汪亦涵已读取gif文件");
    }
}
