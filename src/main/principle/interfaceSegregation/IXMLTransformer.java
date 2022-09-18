package main.principle.interfaceSegregation;

/**
 * @author sayCode
 * @date 2022/9/18 14:59
 * project: DesignPattern
 * Title: IXMLTransformer
 * description: xml数据格式转换接口类
 */
public interface IXMLTransformer {
    /**
     * 将获取的数据转换为xml格式
     */
    void transformerToXML();
}
