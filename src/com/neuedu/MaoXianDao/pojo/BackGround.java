package com.neuedu.MaoXianDao.pojo;

import com.neuedu.MaoXianDao.utils.GameUtil;

import java.awt.*;

/*
* 创建一个背景图片类   抽离创建出一个背景图片的对象 赋予该有的特征
* */
public class BackGround {
    private Image image;
    private  int x;
    private  int y;
    private  int height;



    //写一个构造方法使调用构造方法时 image有一个值即一张图片并且有自己的位置
    public  BackGround(){
        this.image= GameUtil.getImg("com/neuedu/MaoXianDao/imgs/mod/bgimg.jpg");
       // this.image= GameUtil.getImg("src/com/neuedu/MaoXianDao/imgs/mod/bgimg.jpg");
        this.x=0;
        this.height=image.getHeight(null);
       // System.out.println(height);
        this.y=Constant.GAME_HEIGHT-height ;
    }
    //定义一个画图的方法
    public  void draw(Graphics g ){
        g.drawImage(this.image,x,y,null);
    }
}
