# GestureViewBinder

支持任意view的平移缩放手势工具

[github：GestureViewBinder](https://github.com/GeniusLiu/GestureViewBinder) 
喜欢的记得给个star呦～有什么问题或者建议也希望能够指点一下，感激不尽！

使用时在app也就是根目录下的build.gradle中添加maven仓库地址
```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
然后在项目的build.grale中添加依赖
```java
implementation 'com.github.GeniusLiu:GestureViewBinder:v1.0.0'
```

最后通过一行代码使用
```java
GestureViewBinder.bind(this, groupView, targetView);
```

如果你想让view充满group且大小不能小于group
```java
gestureViewBinder.setFullGroup(true)
```

<center>![这里写图片描述](https://img-blog.csdn.net/20180604191121813?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3c4NTUyMjc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)   ![这里写图片描述](https://img-blog.csdn.net/20180604191205687?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3c4NTUyMjc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)</center>
