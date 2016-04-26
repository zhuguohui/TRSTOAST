# 可滑动删除的Toast

#效果
##特点
1.可多次显示
2.可滑动删除，滑动时改变透明度
3.可快速滑动删除。
4.自动显示与消失动画
![这里写图片描述](http://img.blog.csdn.net/20160425180417538)

#使用
很简单模仿的Toast的api，不过没有处理时间参数，默认显示2秒钟， 以后再逐步完善吧。

```
  @Override
    public void onClick(View v) {
        SlideToast.MakeText(this, "第" + n + "次show").show();
        n++;
    }
}
```
详情见[我的csdn博客](http://blog.csdn.net/qq_22706515/article/details/51244191)
