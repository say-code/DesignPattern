package main.utils;

import main.factoryMethod.example.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 * @author sayCode
 * @date 2022/10/5 20:07
 * project: DesignPattern
 * Title: XmlRead
 * description: 读取XML文件
 */
public class XmlRead {

    public final String XML_NAME;
    private Class<?> clazz;

    /**
     * 实例化
     * @param xmlName 文件名
     * @param object 用于获取创建对象所在位置，默认传入this即可
     */
    public XmlRead(String xmlName, Object object){
        this.XML_NAME = xmlName;

        try {
            //尝试读取xml配置文件并创建相应类
            SAXReader reader = new SAXReader();
            //获取当前类所在路径

            String path = object.getClass().getResource("").getPath();
            //防止路径中含有中文，转换下编码格式
            path = java.net.URLDecoder.decode(path,"utf-8");
            //读取xml文件
            Document document = reader.read(new File(path+"/"+this.XML_NAME));
            //获取根节点
            Element element = document.getRootElement();
            //从配置文件中获取类名
            String className = element.element("className").getText();
            //获取当前类所在位置并获取字节码对象
            this.clazz = Class.forName(object.getClass().getPackage().getName()+"."+className);
        } catch (ClassNotFoundException | DocumentException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public Class<?> getClazz(){
        return clazz;
    }

    public Object newInstance(){
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


}
