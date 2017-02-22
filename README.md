##首先感谢原作者  鸿洋_
* [博客地址：http://blog.csdn.net/lmj623565791/article/details/51854533](http://blog.csdn.net/lmj623565791/article/details/51854533)

##对RecyclerView的扩展
* 1、提供AddHeadView
* 2、提供AddFootView
* 3、提供OnItemClickListener


##Java文件介绍
* 1、BasicAdapter，适配基类，内部提供了 setOnItemClickListener
* 2、BasicViewHolder,ViewHolder基类
* 3、HomeAdapter，介绍用Adapter,这个文件大家看看就好，不用下载到本地

##各位小主可以直接点击Java文件，注释我已添加，慢慢阅读！

* 请注意，请在onCreateViewHolder时，使用如下布局填充方法，不然会导致显示的结果与布局不同！！！

```Java
LayoutInflater.from(context).inflate(id,parent,false) 

```

##如果你觉得还不错，请Start一下！谢谢，谢谢！！！
