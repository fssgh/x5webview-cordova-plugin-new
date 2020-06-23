 # x5webview-cordova-plugin
x5webview-cordova-plugin 是腾讯浏览服务(TBS)为cordova框架提供的用于android平台的cordova插件，旨在为android平台提供更好的webview浏览体验．

一．接入步骤：
1.向cordiva工程中添加x5webview插件,有如下两种方式：
```
(1)cordova plugin add x5webview-cordova-plugin 
(2)cordova plugin add https://github.com/runner525/x5webview-cordova-plugin.git

```
2.向ionic4,5的cordova工程中添加x5webview插件指引:
>1.修改cordova-plugin-ionic-webview插件中的：
>>IonicWebViewEngine.java：
>>><p>android.webkit.WebResourceRequest  ——> import com.tencent.smtt.export.external.interfaces.WebResourceRequest;</p>
>>><p>android.webkit.WebResourceResponse  ——> import com.tencent.smtt.export.external.interfaces.WebResourceResponse;</p>
>>><p>android.webkit.ServiceWorkerClient  ——> com.tencent.smtt.export.external.interfaces.ServiceWorkerClient;</p>
>>><p>android.webkit.WebSettings ——> import com.tencent.smtt.sdk.WebSettings;</p>
>>><p>android.webkit.WebView ——> import com.tencent.smtt.sdk.WebView;</p>
>>><p>android.webkit.ServiceWorkerController ——> com.tencent.smtt.sdk.ServiceWorkerController;</p>
>>><p>import org.apache.cordova.engine.SystemWebViewClient; ——> import org.apache.cordova.x5engine.X5WebViewClient;</p>
>>><p>import org.apache.cordova.engine.SystemWebViewEngine; ——> import org.apache.cordova.x5engine.X5WebViewEngine;</p>
>>><p>import org.apache.cordova.engine.SystemWebView; ——> import org.apache.cordova.x5engine.X5WebView;</p>
>>WebViewLocalServer.java：
>>><p>android.webkit.WebResourceRequest  ——> import com.tencent.smtt.export.external.interfaces.WebResourceRequest;</p>
>>><p>android.webkit.WebResourceResponse ——> import com.tencent.smtt.export.external.interfaces.WebResourceResponse;</p>
>2.修改x5webview-cordova-plugin-new插件中的plugin.xml
>>注释掉：
>>```
>><preference name="webView" value="org.apache.cordova.x5engine.X5WebViewEngine"/>
>>```
3.App 首次就可以加载 x5 内核：
    把本项目代码中的MainActivity.java文件，修改成自己app的包名后，换掉platform中的原MainActivity.java后打包（目前没有好的办法，只能add android后手动替换）
    
二．熟悉android开发的同学可以参考x5官网来灵活使用x5内核．常用链接如下：

官网(https://x5.tencent.com/tbs/)

常见问题(https://x5.tencent.com/tbs/faq.html)

论坛(http://bbs.mb.qq.com/forum-112-1.html)

内核加载问题检测工具(http://bbs.mb.qq.com/thread-1944983-1-1.html)

