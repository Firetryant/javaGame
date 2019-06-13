package com.neuedu.MaoXianDao.client;

import com.neuedu.MaoXianDao.pojo.BackGround;
//import com.neuedu.MaoXianDao.pojo.Constant;
import com.neuedu.MaoXianDao.pojo.Hero;
import com.neuedu.MaoXianDao.utils.GameUtil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MaoXianDaoClient  extends Frame {
    /*写一个loadFrame方法加载窗口
    *
    * */
    //构造一个全局对象BackGround
    private BackGround  backGround =new BackGround();
   private  Hero hero=new Hero();

    private  GameUtil gameUtil=new GameUtil();
    public void  loadFrame(){
        this.setTitle("冒险岛.exe");
        this.setSize(1369,963);
        this.setLocationRelativeTo(null);//设置窗口相对于计算机所显示的位置
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        /*
        * 添加一个窗口监听事件用于关闭窗口
        *new  windowAdapter一个适配器*/
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    /*
    * 通过一个paint方法将GameUtil类中返回的图片画在窗口上
    */

    @Override
    public void paint(Graphics g) {
        //画出背景图片和Hero图
        backGround.draw(g);
        hero.draw(g);

       /* //导入图片路径并且定义图片的位置
        g.drawImage(GameUtil.getImg
                ("src/com/neuedu/MaoXianDao/imgs/mod/bgimg.jpg"),0,518,null);*/
    }

   /* public static void main(String[] args) {
      new MaoXianDaoClient().loadFrame();   }*/
   public static void main(String[] args) {
       new  MaoXianDaoClient().loadFrame();
   }

}
