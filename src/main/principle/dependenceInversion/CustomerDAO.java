package main.principle.dependenceInversion;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/9/17 16:59
 * project: DesignPattern
 * Title: CustomerDAO
 * description: 根据配置文件读取相应参数
 */
public class CustomerDAO {

    private IDataConvertor dataConvertor;

    public CustomerDAO() {
        try {
            //尝试读取xml配置文件并创建相应类
            SAXReader reader = new SAXReader();
            //获取当前类所在路径
            String path = this.getClass().getResource("").getPath();
            //防止路径中含有中文，转换下编码格式
            path = java.net.URLDecoder.decode(path,"utf-8");
            //读取xml文件
            Document document = reader.read(new File(path+"/config.xml"));
            //获取根节点
            Element element = document.getRootElement();
            //从配置文件中获取类名
            String className = element.element("className").getText();
            //获取当前类所在位置并获取字节码对象
            Class<?> clazz = Class.forName(this.getClass().getPackage().getName()+"."+className);
            //利用字节码创建相应类
            this.dataConvertor = (IDataConvertor)clazz.newInstance();
        } catch (ClassNotFoundException | DocumentException | InstantiationException | IllegalAccessException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addCustomers(){
        dataConvertor.readFile(this.getClass().getName());
    }


}
