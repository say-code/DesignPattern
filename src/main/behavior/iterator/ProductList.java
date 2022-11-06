package main.behavior.iterator;

/**
 * @author 汪亦涵
 * @date 2022/11/5 21:58
 * @project DesignPattern
 * @Title ProductList
 * @description AbstractProductList实现
 */
public class ProductList extends AbstractProductList{

    public ProductList(String[] productsName) {
        super(productsName);
    }

    @Override
    public IIterator getIterator() {
        return new MyIterator(this);
    }
}
