package main.factoryMethod.ImgRead;

/**
 * @author sayCode
 * @date 2022/9/28 15:29
 * project: DesignPattern
 * Title: JpgReaderFactory
 * description: jpg读取类工厂
 */
public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
