package com.mybatis.code.demo.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 上传文件工具类（需要根据上传的name创建一个文件夹来存放文件）
 * @author Administrator
 *
 */
public class UploadFileUtil {

    /**
     * 自定义文件夹上传
     * @param upPath
     * @param myfile
     * @param dirName 文件夹名称
     * @return
     * @throws Exception
     */
    public static String upload(String upPath, MultipartFile myfile, String dirName)throws Exception{

        dirName = dirName == null ? "" : dirName;

        List<String> imgPathList = new ArrayList<String>();

        if(myfile.isEmpty()){
            System.out.println("文件未上传");
        }else{
            System.out.println("文件长度: " + myfile.getSize());
            System.out.println("文件类型: " + myfile.getContentType());
            System.out.println("文件名称: " + myfile.getName());
            System.out.println("文件原名: " + myfile.getOriginalFilename());
            System.out.println("========================================");

            //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中
            //String realPath = request.getSession().getServletContext().getRealPath("/upload");
            //使用自定义文件资源库
            String realPath = upPath+"/"+dirName;
            //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
            try {
                //重置文件名
                Long nowTime = System.currentTimeMillis();
                String[] originalFileName = myfile.getOriginalFilename().split("\\.");
                String fileName = nowTime + "." + originalFileName[originalFileName.length - 1];
                System.out.println("fileName:"+fileName);
                // 将获取到的文件 输入到指定文件夹的指定文件中；
                // 基于Commons IO的实现 copyInputStreamToFile（）方法
                FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));

                //配置文件访问路径
                if (dirName.equals("")) {
                    imgPathList.add(upPath+fileName);
                } else {
                    imgPathList.add(upPath+dirName+"/"+fileName);
                }

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        return imgPathList.get(0);
    }
}

