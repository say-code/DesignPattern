package main.structural.searchProxy;

import org.junit.Test;

/**
 * @author sayCode
 * @date 2022/10/11 14:10
 * @project DesignPattern
 * @Title ProxySearchTest
 * @description 查找代理测试类
 */
public class ProxySearchTest {

    ProxySearcher proxySearcher = new ProxySearcher();
    @Test
    public void doSearchTest(){
        proxySearcher.doSearch();
    }
}
