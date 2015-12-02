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
目前采用测试端口8090.

##相关API
格式：http://serverIp:port/  <br>
返回格式均为json，采用GET请求数据  <br>

####1.返回附近WIFI的位置信息
* 地址：http://serverIp:port/getWifiLatLng  <br>
* 示例：http://202.120.36.190:8090/getWifiLatLng  <br>
```
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

####2.查询指定位置的Wifi信息
* 地址：http://serverIp:port/getWifiInfos/Latitude=?Longtitude=?  <br>
* ?处分别以需要查询的经纬度代替。  <br>
* 示例：http://202.120.36.190:8090/getWifiInfos/Latitude=31.022508Longtitude=121.4353897  <br>
```
{
    "count": 4,
    "wifiInfos": [
        {
            "signals": 89,
            "security": "[ESS]",
            "ssid": "CMCC-WEB",
            "bssid": "00:11:b5:25:00:32"
        },
        {
            "signals": 77,
            "security": "[ESS]",
            "ssid": "CMCC-WEB",
            "bssid": "00:11:b5:25:14:40"
        },
        {
            "signals": 89,
            "security": "[WPA-PSK-CCMP][WPA2-PSK-CCMP][WPS][ESS]",
            "ssid": "Doubi323",
            "bssid": "9c:21:6a:14:28:d2"
        },
        {
            "signals": 89,
            "security": "[WPA2-PSK-CCMP][ESS]",
            "ssid": "xskz",
            "bssid": "e2:df:9a:96:45:a7"
        }
    ]
}
```
