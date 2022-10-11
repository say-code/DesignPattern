package main.structural.searchProxy;

import java.util.logging.Logger;

/**
 * @author sayCode
 * @date 2022/10/11 14:03
 * @project DesignPattern
 * @Title ProxySearcher
 * @description 查找代理
 */
public class ProxySearcher implements Searcher{

    RealSearcher realSearcher = new RealSearcher();

    AccessValidator validator = new AccessValidator();

    Logger logger = Logger.getLogger("ProxySearcher");

    @Override
    public void doSearch() {
        if (validate()){
            realSearcher.doSearch();
        }
        else {
            logger.info("2020144131汪亦涵：您无权限查找该信息");
        }
    }

    public boolean validate(){
        return validator.validate();
    }
}
