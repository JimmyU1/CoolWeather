package com.code.ljn.coolweather.util;

/**
 * Created by ljn19 on 2017/3/22.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
