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
        int i = 0;
        while (i < 10) {

            logger.info("Info:普通信息：====：INFO");
            logger.debug("调试debug 信息。：====：DEBUG");
            logger.error("报错信息。：====：ERROR");
            logger.warn("警告信息。：====：WARN");

            logger.fatal("严重错误fatal信息。====：FATAL");

            // 以上这些方法都是有重载的方法了，可以直接把异常名加，打印出来。
            logger.error("报错信息",new IllegalAccessException("非法参数"));

            // 根据具体的业务逻辑，选择上面 的方法。  就是把这些报错信息加到日志里面去，到时查看日志来定位错误在哪个位置。

            i++;
        }

    }
}
