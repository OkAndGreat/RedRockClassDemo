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

然后我们设置绘制得图形得背景颜色，注意，这里的color值我没有使用硬编码，而是引用了value文件夹里color.xml的值

![image-20210901211910003](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210901211910003.png)

 现在我们绘制得背景长这个样子

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

接下来我们再来学习selector资源文件



## 黑夜模式适配

首先我们看看掌上重邮一般状态下的外观和开启黑夜模式下的外观

![image-20210902215031662](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210902215031662.png)

![image-20210902215024783](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210902215024783.png)

可以发现开启黑夜模式后整体外观颜色明显是更加适合晚上观看，那这是怎么做到的呢？

其实就是让开启黑夜模式后相应的View的颜色改变

那怎么做到让开启黑夜模式后相应的View的颜色改变呢？

还记不记得之前我们在res文件夹里有一个values-night文件夹没有讲，这个文件夹就是用来黑夜适配的

看到下面这个界面以及它的对应的xml文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".NightAdaptActivity">

    <LinearLayout
        android:layout_width="300dp"
        android:layout_height="50dp"
        android:layout_centerInParent="true"
        android:background="@color/ll_color"
        android:gravity="center">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/tv_color"
            android:text="@string/tv_night_adapt" />

    </LinearLayout>

</RelativeLayout>
```

![image-20210902221854329](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210902221854329.png)

这个页面我们开启黑夜模式后是这个样子

![image-20210902221854329](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210902221854329.png)

可以发现没有任何变化

要实现黑夜适配就要做到view的颜色值不要硬编码，应该把颜色值存入values文件夹内的colors.xml中

![image-20210902222250956](C:\Users\wzt\AppData\Roaming\Typora\typora-user-images\image-20210902222250956.png)

然后我们在values-night中创建colors.xml文件夹

将要在黑夜模式下更改颜色值的颜色属性复制粘贴到values-night文件夹中的colors.xml中

然后将颜色属性改为黑夜模式下适合的颜色即可(这个颜色该怎么选用我们开发者不用担心，视觉小姐姐会帮我们安排好)

## Material Design入门

什么是Material Design?由于之前Android标准的界面设计风格不统一，导致很多公司自己去设计界面导致各种app的界面风格不统一，基于这种情况，谷歌就提出了Material Design，它是一种设计原则，旨在统一Android平台界面风格，而谷歌官方基于Material Design的设计原则为我们提供了一系列的控件，今天我们就来学习它们中的部分



## ViewPager入门



## TabLayout入门



## RecyclerView入门

首先，什么是RecyclerView？

请看下面几张图片

![](https://gitee.com/wangzhongtai/blog-picture/raw/master/img/20210903162916.jfif)



用红框圈住的就是RecyclerView，可以发现，一个RecyclerView是由很多整体结构相同(这里放图)的但数据不同的View所组成的，我们自己手动去写布局毕竟是有缺陷的，（这里后期改成先掏出问题）比如说邮问，有1000条动态，难道我们是去在布局文件里写1000个View吗？显然是不可能的，不难发现，其实动态结构是一样的，只是数据不同罢了，我们可以把RecyclerView看成一个工厂，我们给这个工厂提供布局文件的模板和数据，然后它就根据数据和模板去生产View，然后把它逐条展示出来，这样就不用我们去手动去一个个写了。

如果上面的话没听懂没关系，我们可以先记住RecyclerView的应用场景和使用方法，知道在什么场景下用RecyclerView以及怎么用就好了，其实使用RecyclerView是有一套模板的，大家可以现阶段可以跟着这个模板去模仿着写，写着写着或者随着你对Android开发的进一步理解在某一天就会恍然大悟(相信这一天并不会远)，RecyclerView的使用场景也很简单，就是当你发现你要实现的是一种结构相同，数据不同的布局时就可以使用RecyclerView。说了这么多，我们下面展示编写一个简单的RecyclerView界面：









第一步当然是把RecyclerView添加到布局文件中：

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RecyclerViewActivity">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</LinearLayout>
```



第二步我们在代码中给RecyclerView提供模板布局文件

（这里放图）

在layout文件夹下新建一个item_rv的布局文件，然后按照这个结构写一个布局文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/tv_fruit_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp" />

    <TextView
        android:id="@+id/tv_fruit_price"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="50dp" />


</LinearLayout>
```

这样我们模板就写好了

第三步，创建一个适配器

适配器可以就看作将模板和数据结合的一个玩意，以冰红茶生产工厂举个例子，适配器相当于生产冰红茶的机器，我们为它提供冰红茶瓶子(模板)和饮料(数据)然后它就会给我们生产出具体的产品出来

来看看怎么编写一个适配器

新建一个类adapter继承自RecyclerView.Adapter然后先按照这个模板来写

```java
public class adapter extends RecyclerView.Adapter<adapter.InnerHolder> {
    @NonNull
    @Override
    public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class InnerHolder extends RecyclerView.ViewHolder{
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
```

接下来我们根据具体情况再来完善这个adapter

①

```java
public static class InnerHolder extends RecyclerView.ViewHolder{
    //第一步：在这里把一个item里面的View找到方便我们后面对它设置数据
    TextView tvFruitName;
    TextView tvFruitPrice;
    public InnerHolder(@NonNull View itemView) {
        super(itemView);
        tvFruitName = (TextView) itemView.findViewById(R.id.tv_fruit_name);
        tvFruitPrice = (TextView) itemView.findViewById(R.id.tv_fruit_price);
    }
}
```

②

```java
public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
}
```

这里只需要把inflate里的布局文件改成具体情况下的布局文件就好了，至于其它的参数和写法是什么意思可以暂时不用去深究

③

为adapter设置数据

我们让adapter被创建的时候把数据传进来

```java
private ArrayList<fruit> data;

public adapter(ArrayList<fruit> data) {
    this.data = data;
}
```

这个fruit是我写的一个用来存储数据的数据类

```java
public class fruit {
    private String fruitName;
    private Float fruitPrice;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public Float getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(Float fruitPrice) {
        this.fruitPrice = fruitPrice;
    }
}
```

④

绑定数据

在onBindViewHolder这个方法里，我们进行绑定数据的操作

```java'
@Override
public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {
    holder.tvFruitName.setText(data.get(position).getFruitName());
    holder.tvFruitPrice.setText(data.get(position).getFruitPrice().toString());
}
```

然后在getItemCount返回数据的总量(要生产冰红茶的总数量)

```java
//这个方法返回总共要生产多少个View的数量
@Override
public int getItemCount() {
    return data.size();
}
```

好了，这样一套下来我们的adapter就编写完成了，我们对其一览

```java
public class adapter extends RecyclerView.Adapter<adapter.InnerHolder> {
    private ArrayList<fruit> data;

    public adapter(ArrayList<fruit> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {
        holder.tvFruitName.setText(data.get(position).getFruitName());
        holder.tvFruitPrice.setText(data.get(position).getFruitPrice().toString());
    }

    //这个方法返回总共要生产多少个View的数量
    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder {
        //第一步：在这里把一个item里面的View找到方便我们后面对它设置数据
        TextView tvFruitName;
        TextView tvFruitPrice;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvFruitName = (TextView) itemView.findViewById(R.id.tv_fruit_name);
            tvFruitPrice = (TextView) itemView.findViewById(R.id.tv_fruit_price);
        }
    }
}
```

接着我们去给recyclerView去设置这个适配器并在创建这个适配器的时候把数据传进来就OK了

一般我们做开发都是从服务器上取具体的数据，但是现在我们简单起见就直接自己在本地编写假数据

```java
//生成假数据
ArrayList<fruit> data = new ArrayList<>();
for(int i=0;i<100;i++){
    fruit myFruit = new fruit();
    myFruit.setFruitName("水果"+i);
    myFruit.setFruitPrice((float)i);
    data.add(myFruit);
}
```

为RecyclerView设置适配器

```java
recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
adapter myAdapter = new adapter(data);
recyclerView.setAdapter(myAdapter);
```

但是这样写还不够，还有最后一步，为RecyclerView设置布局管理器

```java
recyclerView.setLayoutManager(new LinearLayoutManager(this));
```

我们暂时为它设置LinearLayoutManger，稍后我们再来介绍另一种布局管理器GridLayoutManger

现在运行下，看效果应该就和我们最开始展示的那张图片一样了

（放图）



我们再来讲讲GridLayoutManger

