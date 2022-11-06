package main.behavior.alarmSystem;

import java.util.logging.Logger;

/**
 * @author 汪亦涵
 * @date 2022/11/6 14:09
 * @project DesignPattern
 * @Title ExitGate
 * @description 自动门
 */
public class ExitGate extends Gate implements AlarmListener{

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void alarm() {
        logger.info("2020144131汪亦涵: 自动门开始运作！");
        super.action();
    }

    @Override
    void open() {
        logger.info("2020144131汪亦涵: 逃生门已开启！");
    }

    @Override
    void close() {
        logger.info("2020144131汪亦涵：隔热门已关闭！");
    }
}
