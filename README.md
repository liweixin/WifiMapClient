# WifiMapClient
##Wifi地图
用于展示用户附近的Wifi地点和详细信息

##平台
*  android
*  minSdkVersion 14
*  targetSdkVersion 23

##截图
![附近wifi位置](https://github.com/liweixin/WifiMapClient/raw/master/screenshot/small_1.jpg)
![某处wifi列表](https://github.com/liweixin/WifiMapClient/raw/master/screenshot/small_2.jpg)
![详细wifi信息](https://github.com/liweixin/WifiMapClient/raw/master/screenshot/small_3.jpg)

##使用的第三方类库
BaiduMapSdk：地图接口
Volley：网络处理
Gson：解析Json

##serverIp
202.120.36.190.

##port
目前为8080.

##相关API
格式：http://serverIp:port/  <br>
返回格式均为json，采用GET请求数据  <br>

####1.返回附近WIFI的位置信息
* 地址：http://serverIp:port/wifiLatLng  <br>
* 示例：http://202.120.36.190:8080/wifiLatLng  <br>
```
{
    "count": 6,
    "location": [
        {
            "latitude": 31.028267,
            "longtitude": 121.444008
        },
        {
            "latitude": 31.028342,
            "longtitude": 121.444003
        },
        {
            "latitude": 31.028406,a
            "longtitude": 121.443999
        },
        {
            "latitude": 31.032559,
            "longtitude": 121.443299
        },
        {
            "latitude": 31.030854,
            "longtitude": 121.442549
        },
        {
            "latitude": 31.030724,
            "longtitude": 121.442398
        }
    ]
}
```

####2.查询指定位置的Wifi信息
* 地址：http://serverIp:port/wifiInfos?Latitude=num1&Longtitude=num2  <br>
* num1和num2处分别以需要查询的经纬度代替。  <br>
* 必须保证参数格式正确（服务器端还未加入参数错误的处理方法）。  <br>
* 示例：http://202.120.36.190:8080/wifiInfos?Latitude=31.030854&Longtitude=121.442549  <br>
```
{
    "count": 4,
    "wifiInfos": [
        {
            "signals": 83,
            "security": "[WPA-PSK-CCMP][WPA2-PSK-CCMP][ESS]",
            "ssid": "D18420",
            "bssid": "14:75:90:42:c1:c0",
            "timeString": "2015-12-04 16:50:57"
        },
        {
            "signals": 75,
            "security": "[WPA-PSK-CCMP][WPA2-PSK-CCMP][ESS]",
            "ssid": "d18-120",
            "bssid": "a4:56:02:4b:a6:c7",
            "timeString": "2015-12-04 16:50:47"
        },
        {
            "signals": 75,
            "security": "[WPA-PSK-CCMP][ESS]",
            "ssid": "connect the right man",
            "bssid": "c8:3a:35:50:a5:e8",
            "timeString": "2015-12-04 16:50:57"
        },
        {
            "signals": 71,
            "security": "[WPA-PSK-CCMP][WPA2-PSK-CCMP][ESS]",
            "ssid": "TP-LINK_6870",
            "bssid": "ec:26:ca:26:68:70",
            "timeString": "2015-12-04 16:50:47"
        }
    ]
}
```
*  如果所查询的位置数据库中没有对应的Wifi信息，返回值如下：
```
{
    "count": 0,
    "wifiInfos": []
}
```

##Hint
*  server提供的两个API均不需要认证，所以不需要登陆，请求时也不需要携带cookie  <br>
测试可以用chrome插件postman, 或者直接浏览器访问然后格式化json http://www.bejson.com/
*  程序中使用了百度地图的SDK，之前的AK码会失效（sha1不同），所以调试时需重新申请AK码  <br>
申请地址：http://lbsyun.baidu.com/apiconsole/key
*  第二个API中添加了时间信息，还没更新示例
*  目前只在小米2S上测试没有问题，如果在手机上测试时发现任何BUG欢迎直接在isuue中提交或和我联系
*  Contact me at qq627632598 or email
