package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.utils.ResultCodeEnum;
import com.mybatis.code.demo.utils.ResultUtil;
import com.mybatis.code.demo.utils.UploadFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {

    @Value("${uploadPath}")
    private String uploadPath;

    private String uploadPathTest = "C:/Users/Administrator/AppData/Local/Temp/tomcat-docbase.4264994143425730854.8083/";

    /**
     * 根据类型不同上传到不同的文件夹下
     * SpringMVC 用的是 的MultipartFile来进行文件上传
     * <p>
     * 这里用@RequestParam()来指定上传文件为MultipartFile
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/uploadFile")
    @ResponseBody // 这里upfile是config.json中图片提交的表单名称
    public Map<String, Object> uploadFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "dirName",required = false) String dirName,
           HttpServletRequest request) throws Exception {
//        // 将图片放到tomcat中
//        System.out.println(request.getServletContext().getRealPath("/"));
        Map<String, String> map = new HashMap<String, String>();
        // 获取不同的渠道路径
        if (file == null || file.isEmpty()) {
            log.info("======================上传文件为空========================================");
            return ResultUtil.resultObject(ResultCodeEnum.FAIL.getValue(), "文件为空！").end();
        }
        dirName = dirName == null ? "" : "" + dirName;
        String path = UploadFileUtil.upload(uploadPath, file, dirName);
        // 是否上传成功
        // 文件原名称
        String fileName = file.getOriginalFilename();

        return ResultUtil.resultObject(ResultCodeEnum.SUCCESS.getValue())
                .appendDataToOut("rCode", "success") // 是否上传成功
                .appendDataToOut("original", fileName) // 文件原名称
                .appendDataToOut("type", fileName.substring(file.getOriginalFilename().lastIndexOf(".") + 1)) //文件类型 .+后缀名
                .appendDataToOut("url", path) // 路径
                .appendDataToOut("size", file.getSize() + "") // 文件大小（字节数）
                .end();
    }

    @PostMapping("/testFileSystem")
    @ResponseBody
    public String testFileSystem(
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "dirName",required = false) String dirName) throws Exception {

        System.out.println("文件长度: " + file.getSize());
        System.out.println("文件类型: " + file.getContentType());
        System.out.println("文件名称: " + file.getName());
        System.out.println("文件原名: " + file.getOriginalFilename());
        System.out.println("========================================");

        // 对“.”进行分割，不过存在转意，所以加“\\.”
        String[] originalFileName = file.getOriginalFilename().split("\\.");
        for(int i=0;i<originalFileName.length;i++){
            System.out.print(originalFileName[i] + " ");
        }
        System.out.println("");

        // 获取系统时间戳
        Long nowTime = System.currentTimeMillis();
        System.out.println(nowTime);
        String fileName = nowTime + "." + originalFileName[originalFileName.length - 1];
        System.out.println("fileName:"+fileName);

        return "测试传过来的文件内容~";
    }

    /**
     * 文件下载
     * @param fileUrl fileUrl		文件的url从数据库中获取
     * @param fileName   fileName		文件的name从数据库中获取
     * @param response  response HttpServletResponse
     * @throws Exception
     */
    @GetMapping("/downloadFile")
    @ResponseBody
    public void downloadFile(
            @RequestParam("fileUrl") String fileUrl ,
            @RequestParam("fileName") String fileName,
            HttpServletResponse response) throws Exception {

        File file = new File(fileUrl);
        System.out.println(fileUrl);

        String name = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        response.setHeader("Content-Disposition", "attachment;filename=" + name);
        //文件下载类型--二进制文件
        response.setContentType("application/octet-stream");
        InputStream in = new FileInputStream(file);

        OutputStream out = response.getOutputStream();
        int buffSize = 1024;
        byte[] buff = new byte[buffSize];
        int read;
        while ((read = in.read(buff)) != -1) {
            out.write(buff, 0, read);
        }

        in.close();
        out.close();
    }
}
