package com.ledboot.wegirls;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by Administrator on 2015/11/3 0003.
 */
public class Boot extends Application {
    private static Boot app;

    public static final String YI_YUAN_APPID = "5039";
    public static final String YI_YUAN_SECRET = "72d0cdcf30e84e98b6453afd54d15d12";

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
//        CrashReport.initCrashReport(app, "900012201", false);
    }

    public static Boot getInstance(){
        return app;
    }


}
