# BeautyProgressBar
强大漂亮的条形带数字、圆形带数字、仿IOS圆形进度条、两端圆滑的条形progressBar

[![](https://jitpack.io/v/kjt666/BeautyProgressBar.svg)](https://jitpack.io/#kjt666/BeautyProgressBar)

使用
-----
要在您的构建中获得Git项目：<br>

步骤1.将JitPack存储库添加到构建文件中<br>

将其添加到存储库末尾的根build.gradle中：<br>

```Java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
步骤2.添加依赖项<br>

```Java
dependencies {
	        implementation 'com.github.kjt666:BeautyProgressBar:v1.0'
	}
```
演示
-----
![](https://github.com/kjt666/ImageCache/blob/master/BeautyProgressBar.gif)<br>
属性说明
-----

>NumberProgressBar
>>progressbar_reach_color：
进度条完成部分颜色<br>
>>progressbar_unreach_color：
进度条未完成部分颜色<br>
>>progressbar_reach_height：
进度条完成部分高度<br>
>>progressbar_unreach_height：
进度条未完成部分高度<br>
>>progressbar_text_color：
进度条数字字体颜色<br>
>>progressbar_text_size：
进度条数字字体大小<br>
>>progressbar_text_offset：
进度条数字偏移距离，相当于数字左右两端的margin<br>

-----
>BeautyProgressBar
>>reach_color：
进度条完成部分颜色<br>
>>unreach_color：
进度条未完成部分颜色<br>
>>progressbar_height：
进度条高度<br>

-----
>RoundNumberProgressBar<br>
>继承自NumberProgressBar，有它的所有属性，不过progressbar_text_offset没有作用
>>progressbar_radius：
圆形进度条的半径，半径越大，进度条越大。

-----
>IOSProgressBar<br>
>继承自NumberProgressBar，有它的所有属性，不过progressbar_text_offset没有作用
>>progressbar_radius：
圆形进度条的半径，半径越大，进度条越大。
