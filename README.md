# 安卓第二次课讲义
## res文件夹初识

![image-20210831221743334](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210831221743334.png)

首先我们介绍下res文件夹，res听名字也能猜出来是resource(资源)的缩写，字如其名，这个文件夹一般就是用来储存我们做一个app所要用到的一些资源文件，比如说要用到的图片啦,要使用的一些颜色值，布局文件等。。。我们介绍下这些文件夹分别用来干些什么

比如下面是微信的一个界面

![image-20210831215735071](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210831215735071.png)

这些图片一般就放在drawable这个目录里面

![image-20210831220138005](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210831220138005.png)

布局文件的编写大家上节课应该已经学习了，布局文件就是放在layout这个文件夹里面

mipmap这个文件夹一般放应用图标，而有这么多"mipmap"开头的目录，是为了兼容各种类型的设备，安卓的机型很多，可能你用华为,我用小米，它用VIVO，或者你的手机屏幕大些，我的小些，我们可以在mipmap中提供同种类型的不同分辨率的图片然后系统就会根据具体机型的不同去这里自动取合适的资源文件



value这个文件夹存放一些值文件，比如字符串值，颜色值。为什么要把字符串值和颜色值等值存放到这个文件夹呢？主要还是和适配有关

大家在写TextView并设置text属性时如果直接写值可能会收到这样的警告

![image-20210901192845196](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901192845196.png)



它提示我们硬编码了，应该要把这个值存放到values文件夹的strings里面去，我们根据它的提示信息进行修改

点击Extract string resource

![image-20210901193713087](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901193713087.png)

为它起一个名字

然后textview的text属性会根据名字去引用对应的string值

![image-20210901193900673](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901193900673.png)

打开strings.xml文件，可以看到我们之前写的字符串信息已经被存放到了这里

![image-20210901193957850](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901193957850.png)

之所以这样做是为了适配不同的语言版本

比如我们现在设置的语言版本是中文，如果我们硬编码了，当我们切换到其它的语言版本打开app显示的还是这个硬编码的字符串

怎么解决文字信息可以适配不同的语言版本呢？我们可以另外提供一个strings.xml，在里面写一个名字一样的资源，内容改成对应语言版本的资源即可

比如把

```
<string name="textview">我是一个TextView</string>
```

换成

```
<string name="textview">I am a TextView</string>
```

由于语言适配不是我们的重点内容(我们大部分人估计都做得是给咱们国人用的app把。。。)，具体怎么做有兴趣的同学可以自己去查询相关资料

但是不要把字符串硬编码我认为还是很有必要得，第一这是一种优秀的编程习惯，第二它可以提高文字的复用性，比如我们把“红岩网校”这个字符串用了一千次，难道我们就创建一千次吗？要知道字符串它是一种数据，会占用手机的内存，我们如果把这个字符串放进strings.xml里，然后其它地方如果要用到这个字符串的就直接到strings.xml里取，当然正常情况下一般不会有哪个字符串会被用这么多次。。。但是我们如果养成了这种习惯，积少成多还是能提升我们程序的性能的



values-night文件夹和我们要讲的黑夜模式适配有关，暂且还放在这不讲，我们接下来再来看drawable文件夹

我们前面说drawable文件夹是用来存放图片的，实际上它的功能不止存放图片

它还可以用来存放shape资源文件和selector资源文件，我们接下来分别讲讲这俩个是干嘛用的



shape资源文件可以用来优化我们写的View的背景，这是一个我写的一个用作登录的button

![image-20210901204955311](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901204955311.png)

它长这个样子

![image-20210901205006673](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901205006673.png)

而掌邮的登录button长这个样子



![image-20210901204941141](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901204941141.png)

接下来我们讲怎么通过shape将我写的button长得和掌邮的button一样把



在drawable文件夹下如图操作

![image-20210901210955357](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901210955357.png)

然后按照命名，根节点填写shape

![image-20210901211057282](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901211057282.png)

点Ok

我们就在drawable中新建了一个shape资源

![image-20210901211237926](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901211237926.png)

然后，我们要指定要绘制一个什么样的图形，有四种图形可以选择

分别是：矩形（rectangle）、椭圆（oval）、线（line）、圆环（ring）

我们选择 矩形（rectangle）

![image-20210901211631388](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901211631388.png)

然后，我们要让这个登录btn有圆角

在shap里加上corners子节点 radius值得大小决定得圆角的大小

然后我们设置绘制得图形得背景颜色

![image-20210901211910003](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901211910003.png)

 先在我们绘制得背景长这个样子

![image-20210901212044493](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901212044493.png)

接下来把这个shape文件和我们的button绑定

设置btn的background属性

![image-20210901212508701](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901212508701.png)

现在我们的button长这个样子

![image-20210901212546771](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901212546771.png)

再修改一下文字颜色就好了

![image-20210901212640957](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901212640957.png)

但是可以发现和掌邮的登录btn还是有些许不一样

![image-20210901214513816](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901214513816.png)

因为掌邮的颜色是从左到右渐变的

我们来看看颜色渐变的效果怎么实现

![image-20210901215830510](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901215830510.png)

再来看看效果

![image-20210901215901023](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901215901023.png)

就和掌邮的登录效果一样了



## 黑夜模式适配



## Material Design入门



## ViewPager入门



## TabLayout入门



## RecyclerView入门







