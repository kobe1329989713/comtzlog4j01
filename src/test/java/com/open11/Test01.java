package com.open11;

import org.apache.log4j.Logger;

/**
 * Created by kobe on 2017/8/15.22:32
 * <br/>
 * Description:
 *  log4j 可以百度百科下。
 *  看：https://baike.baidu.com/item/log4j
 */
public class Test01 {

    // 获取 logger 实例。                           记录当前类的一些信息。
    private static Logger logger = Logger.getLogger(Test01.class);

    public static void main(String[] args) {
        logger.info("Info:普通信息");
        logger.debug("调试debug 信息。");
        logger.error("报错信息。");
        logger.warn("警告信息。");

        logger.fatal("严重错误fatal信息。");

        // 以上这些方法都是有重载的方法了，可以直接把异常名加，打印出来。
    }
}
