package main.factoryMethod.ImgRead;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/9/28 15:30
 * project: DesignPattern
 * Title: ImageReaderTest
 * description: 图片读取测试类
 */
public class ImageReaderTest {

    ImageReaderFactory factory;

    ImageReader imageReader;

    @Test
    public void gifReader(){
        factory = new GifReaderFactory();
        imageReader = factory.createImageReader();
        imageReader.readImg();
    }

    @Test
    public void jpgReader(){
        factory = new JpgReaderFactory();
        imageReader = factory.createImageReader();
        imageReader.readImg();
    }
}
