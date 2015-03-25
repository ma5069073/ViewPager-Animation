# ViewPager-Animation
ViewPager切换动画的几种实现


一、  
1、ViewPager.setPageTransformer实现切换动画  
默认为3.0API
2、修改ViewPager内部代码+使用nineoldandroids代替属性动画实现向下兼容  
3、观察API的规律，自定义我们的切换动画  
二、  
1、自定义ViewPager实现动画切换效果  
Translation Scale   
a、需要拿到当前切换的两个View -> 通过Map存储与获取  
b、我们一个动画的梯度值 ->通过offset , offsetPixels  
