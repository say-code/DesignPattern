package main.principle.dependenceInversion;

/**
 * @author sayCode
 * @date 2022/9/17 17:01
 * project: DesignPattern
 * Title: IDataConvertor
 * description: 数据读取的公有格式
 */
public interface IDataConvertor {
    /**
     * 读取相应路径下的文件
     * @param filePath 文件路径
     */
    void readFile(String filePath);
}
