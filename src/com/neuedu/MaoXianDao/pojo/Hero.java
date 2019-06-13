package com.neuedu.MaoXianDao.pojo;

import com.neuedu.MaoXianDao.utils.GameUtil;

import java.awt.*;

/*定义一个Hero类  构造方法创建一个Hero对象*/
public class Hero {
    private Image image;
    private  int x;
    private  int y;
    private  int height;
    public Hero(){
        this.image= GameUtil.getImg("com/neuedu/MaoXianDao/imgs/hero/stand_r/stand1_0.png");
        this.x=300;
        this.height=image.getHeight(null);
        this.y=Constant.GAME_HEIGHT-180-height;
    }
    //定义一个画图的方法将Hero画入窗口中
    public  void  draw(Graphics g){
        g.drawImage(image,x,y,null);
    }
}
