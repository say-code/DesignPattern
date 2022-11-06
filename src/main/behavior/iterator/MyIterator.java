package main.behavior.iterator;

/**
 * @author 汪亦涵
 * @date 2022/11/5 21:46
 * @project DesignPattern
 * @Title MyIterator
 * @description IIterator实现
 */
public class MyIterator implements IIterator{

    private final String[] productsName;

    private int index1;

    private int index2;

    public MyIterator(AbstractProductList list) {
        this.productsName = list.getProductsName();
        this.index1 = 0;
        this.index2 = productsName.length-1;
    }

    @Override
    public void next() {
        index1 ++;
    }

    @Override
    public boolean isLast() {
        return index1 == productsName.length;
    }

    @Override
    public void previous() {
        index2 --;
    }

    @Override
    public boolean isFirst() {
        return index2 == -1;
    }

    @Override
    public String getNextItem() {
        return productsName[index1];
    }

    @Override
    public String getPreviousItem() {
        return productsName[index2];
    }


}
