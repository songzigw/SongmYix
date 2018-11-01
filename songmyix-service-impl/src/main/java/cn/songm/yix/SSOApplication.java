package cn.songm.yix;

import cn.songm.common.service.AppBoot;

/**
 * 单点登入应用
 * 
 * @author zhangsong
 *
 */
public class SSOApplication {

    public static void main(String[] args) throws InterruptedException {
        // JsonUtilsInit.initialization();
        AppBoot.start("application-sso.xml", args);
    }
}
