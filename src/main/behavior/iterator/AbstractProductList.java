package main.behavior.iterator;

/**
 * @author 汪亦涵
 * @date 2022/11/5 21:24
 * @project DesignPattern
 * @Title AbstractProductList
 * @description 抽象产品列表
 */
public abstract class AbstractProductList {

    private final String[] productsName;

    public AbstractProductList(String[] productsName) {
        this.productsName = productsName;
    }

    public String[] getProductsName(){
        return productsName;
    }

    public abstract IIterator getIterator();
}
