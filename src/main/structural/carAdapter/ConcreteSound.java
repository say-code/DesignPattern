package main.structural.carAdapter;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 10:52
 * @project DesignPattern
 * @Title ConcreteSound
 * @description 声音具体实现类
 */
public class ConcreteSound implements Sound{

    private final Logger soundLogger = Logger.getLogger("ConcreteSound");

    @Override
    public void phonate() {
        soundLogger.info("2020144131汪亦涵：我在叫！");
    }
}
