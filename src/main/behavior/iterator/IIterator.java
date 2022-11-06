package main.behavior.iterator;

/**
 * @author 汪亦涵
 * @date 2022/11/5 21:25
 * @project DesignPattern
 * @Title IIterator
 * @description 迭代器接口层
 */
public interface IIterator {

    /**
     * 让前指针向后移动一位
     */
    void next();

    /**
     * 判断是否是最后一个元素
     * @return true or false
     */
    boolean isLast();

    /**
     * 让后指针向前移动一位
     */
    void previous();

    /**
     * 判单是否是最开始的一个元素
     * @return true or false
     */
    boolean isFirst();

    /**
     * 获得前指针所在位置的元素
     * @return String
     */
    String getNextItem();

    /**
     * 获得后指针所在位置的元素
     * @return String
     */
    String getPreviousItem();
}
