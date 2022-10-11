package main.structural.searchProxy;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 13:51
 * @project DesignPattern
 * @Title RealSearcher
 * @description 真实查找类
 */
public class RealSearcher implements Searcher{

    private final Logger realSearchLogger = Logger.getLogger("RealSearcher");
    @Override
    public void doSearch() {
        realSearchLogger.info("2020144131汪亦涵：我正在进行查找");



    }
}
