package com.example.coolweather.gson;

/**
 * Created by Administrator on 2017/8/24 0024.
 * 空气质量情况
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
