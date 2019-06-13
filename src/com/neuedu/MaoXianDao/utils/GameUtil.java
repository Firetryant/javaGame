package com.neuedu.MaoXianDao.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/*
* 定义该类的目的（工具类）从某处读取图片然后加载画在窗口上*/
public class GameUtil {
/*定义一个工具类要使用静态方法方便 类名.  调用*/
    //定义一个静态方法getImg通过一个路径找到一张图片将其返回出来
    public  static Image getImg(String imgPath){
        URL url =GameUtil.class.getClassLoader().getResource(imgPath);
        BufferedImage image = null;
        try {
            image= ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  image;
    }


}
