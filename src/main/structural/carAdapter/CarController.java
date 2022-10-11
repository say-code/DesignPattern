package main.structural.carAdapter;

/**
 * @author sayCode
 * @date 2022/10/11 10:39
 * project: DesignPattern
 * Title: CarController
 * description: 汽车行为控制类接口
 */
public interface CarController {

    /**
     * 汽车移动
     */
    void move();

    /**
     * 声音提示
     */
    void sound();

    /**
     * 灯光提示
     */
    void light();

}
