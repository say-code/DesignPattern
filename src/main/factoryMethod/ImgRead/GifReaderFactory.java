package main.factoryMethod.ImgRead;

/**
 * @author sayCode
 * @date 2022/9/28 15:28
 * project: DesignPattern
 * Title: GifReaderFactory
 * description: Gif图片读取类工厂
 */
public class GifReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}
