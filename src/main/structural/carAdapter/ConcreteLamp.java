package main.structural.carAdapter;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 10:55
 * @project DesignPattern
 * @Title ConcreteLamp
 * @description 发光具体实现类
 */
public class ConcreteLamp implements Lamp{

    private final Logger lampLogger = Logger.getLogger("ConcreteLamp");

    @Override
    public void twinkle() {
        lampLogger.info("2020144131汪亦涵：俺亮闪闪的");
    }
}
