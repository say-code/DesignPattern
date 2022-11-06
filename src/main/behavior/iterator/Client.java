package main.behavior.iterator;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author 汪亦涵
 * @date 2022/11/5 22:04
 * @project DesignPattern
 * @Title Client
 * @description 客户端测试
 */
public class Client {

    private final Logger logger = Logger.getLogger("Client");

    IIterator iterator;
    AbstractProductList productList;


    @Test
    public void testProductList(){
        String[] productNames = {"product1","product2","product3","product4"};
        productList = new ProductList(productNames);
        iterator = productList.getIterator();

        while (!iterator.isLast()){
            logger.info(iterator.getNextItem());
            iterator.next();
        }

        while (!iterator.isFirst()){
            logger.info(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
