package main.structural.carAdapter;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/10/11 11:12
 * @project DesignPattern
 * @Title Client
 * @description 终端
 */
public class Client {
    /**
     *  决定声音适配器具体类
     */
    Sound sound = new ConcreteSound();

    /**
     * 决定灯光适配器具体类
     */
    Lamp lamp = new ConcreteLamp();

    /**
     * 创建汽车适配器并传入组件
     */
    CarAdapter carAdapter = new CarAdapter(sound, lamp);

    @Test
    public void clientStart(){
        carAdapter.move();
        carAdapter.light();
        carAdapter.sound();
    }
}
