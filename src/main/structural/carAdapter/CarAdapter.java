package main.structural.carAdapter;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 10:59
 * @project DesignPattern
 * @Title CarAdapter
 * @description 汽车适配器
 */
public class CarAdapter implements CarController{

    private final Logger carAdapterLogger = Logger.getLogger("CarAdapter");

    private Sound sound;

    private Lamp lamp;

    public CarAdapter(Sound sound, Lamp lamp) {
        this.sound = sound;
        this.lamp = lamp;
    }

    public CarAdapter() {
    }

    @Override
    public void move() {
        carAdapterLogger.info("2020144131：我移动了！（原始版）");
    }

    @Override
    public void sound() {
        carAdapterLogger.info("2020144131:我发声了（原始版）");
        sound.phonate();
    }

    @Override
    public void light() {
        carAdapterLogger.info("2020144131:我发光了（原始版）");
    }
}
