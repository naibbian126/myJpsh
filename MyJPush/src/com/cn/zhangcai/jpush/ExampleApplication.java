package com.cn.zhangcai.jpush;

import android.app.Application;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;

/**
 * 
 * @author qubian
 *一般建议在自定义 Application 类里初始化。也可以在主 Activity 里。
 */
public class ExampleApplication extends Application {
    private static final String TAG = "JPush";

    @Override
    public void onCreate() {
         super.onCreate();
      // 设置开启日志,发布时请关闭日志
         JPushInterface.setDebugMode(true); 
      // 初始化 JPush
         JPushInterface.init(this);     		
    }
}
