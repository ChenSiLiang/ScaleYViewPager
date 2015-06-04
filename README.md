# ScaleYViewPager
## a ViewPager with a scaleY animator

#Setup
* In Eclipse, just import the library as an Android library project. Project > Clean to generate the binaries you need, like R.java, etc.
* Then, just add SlidingMenu as a dependency to your existing project and you're good to go!

#XML Usage
` <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:scaleyviewpager="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    <com.usst.csl.viewpagergallery.ui.ScaleYViewPager
       android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        scaleyviewpager:offscreenPageLimit="3"
        scaleyviewpager:paddingLeft="130"
        scaleyviewpager:paddingRight="130"
        scaleyviewpager:pagerMargin="-350" />
        

</RelativeLayout> `

NOTE:
* `offscreenPageLimit` : the offscreen page number, can simply **not** specify.
* `pageMargin`:the margin between pages,can simply **not** specify.
* `paddingLeft`:set the left padding of center pager,according to your device.
* `paddingRight`:set the right padding of center pager,according to your device.

#Developed By
* ChenSL
 
#LOOK
![how it looks like](https://github.com/ChenSiLiang/ScaleViewPager/blob/master/ViewPagerGallery/show/show.gif)


