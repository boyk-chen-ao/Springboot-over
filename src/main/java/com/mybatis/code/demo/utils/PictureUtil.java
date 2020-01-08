package com.mybatis.code.demo.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 改变图片尺寸
 */
public class PictureUtil {
    public static void main(String[] args) throws IOException {
        zoomImage("C:\\Users\\Administrator\\Desktop\\微信图片_20191216095849.jpg", "C:\\Users\\Administrator\\Desktop\\test.jpg", 800, 800);
        System.out.println("=============图片转换成功！==================");
    }
    /**
     * 改变图片尺寸
     * @param srcFileName 源图片路径
     * @param tagFileName 目的图片路径
     * @param width 修改后的宽度
     * @param height 修改后的高度
     */
    public static void zoomImage(String srcFileName,String tagFileName,int width,int height){
        try {
            BufferedImage bi = ImageIO.read(new File(srcFileName));
            BufferedImage tag=new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(bi, 0, 0, width, height, null);
            ImageIO.write(tag, "jpg", new File(tagFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
