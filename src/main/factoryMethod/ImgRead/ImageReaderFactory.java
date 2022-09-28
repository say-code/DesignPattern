package main.factoryMethod.ImgRead;

/**
 * @author sayCode
 * @date 2022/9/28 15:26
 * project: DesignPattern
 * Title: ImageReaderFactory
 * description: 图片读取类工厂 接口
 */
public interface ImageReaderFactory {
    /**
     * 创建图片读取类
     * @return 具体图片读取类实例
     */
    ImageReader createImageReader();
}
