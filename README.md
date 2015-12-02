# WifiMapClient
##Wifi地图
用于展示用户附近的Wifi地点和详细信息
##平台
android
##使用的第三方类库
BaiduMapSdk,Volley,Gson.
##serverIp
暂定为202.120.36.190.
##port
目前采用测试端口8080.
##相关API
地址：http://serverIp:port/getWifiLatLng  <br>
调用GET方法返回附近WIFI的位置信息，以JSON格式返回。  <br>
···
{
    "count": 5,
    "location": [
        {
            "latitude": 31.03002,
            "longtitude": 121.443325
        },
        {
            "latitude": 31.029881,
            "longtitude": 121.44316
        },
        {
            "latitude": 31.03042,
            "longtitude": 121.443158
        },
        {
            "latitude": 31.031043,
            "longtitude": 121.442968
        },
        {
            "latitude": 31.030836,
            "longtitude": 121.442402
        }
    ]
}
```
