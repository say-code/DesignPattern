package main.factoryMethod.ImgRead;

import main.utils.XmlRead;
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

    XmlRead xmlRead = new XmlRead("config.xml", this);

    @Test
    public void imgReader(){
        factory = (ImageReaderFactory) xmlRead.newInstance();
        imageReader = factory.createImageReader();
        imageReader.readImg();
    }
}
