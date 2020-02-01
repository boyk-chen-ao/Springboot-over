package com.mybatis.code.demo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.mybatis.code.demo.entity.Person;
import com.mybatis.code.demo.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@Slf4j
@RestController
public class ExcelController {

    @GetMapping("getExcel")
    public Map<String,Object> getExcel() throws IOException {

        //模拟从数据库获取需要导出的数据
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("路飞","1",new Date());
        Person person2 = new Person("娜美","2", DateUtils.addDayToDate(new Date(),3));
        Person person3 = new Person("索隆","1", DateUtils.addDayToDate(new Date(),10));
        Person person4 = new Person("小狸猫","1", DateUtils.addDayToDate(new Date(),-10));
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("个人信息","个人信息列表"),
                Person.class,personList);

        workbook.write(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\用户.xls"));
        workbook.close();

        Map<String,Object> map = new HashMap<>();
        map.put("code",1);
        map.put("msg","导出excel成功！");

        return map;
    }

    @ResponseBody
    @GetMapping("downExcel")
    public Map<String,Object> downExcel(HttpServletResponse response) throws IOException {

        response.setContentType("application/binary;charset=ISO8859_1");
        ServletOutputStream outputStream = response.getOutputStream();

        String fileName = new String("用户列表".getBytes(), "ISO8859_1");

        // 组装附件名称和格式
        response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");

        //模拟从数据库获取需要导出的数据
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("路飞","1",new Date());
        Person person2 = new Person("路飞","2", DateUtils.addDayToDate(new Date(),3));
        Person person3 = new Person("索隆","1", DateUtils.addDayToDate(new Date(),10));
        Person person4 = new Person("小狸猫","1", DateUtils.addDayToDate(new Date(),-10));
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        // 可见ExcelType默认设置成了ExcelType.HSSF，而xlsx的取值是ExcelType.XSSF，所以设置ExcelType为XSSF就可以实现xlsx文件的导出

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("个人信息","个人信息列表",ExcelType.HSSF),
                Person.class,personList);
//        Workbook workbook =ExcelExportUtil.exportExcel(new ExportParams("个人信息","个人信息列表", ExcelType.XSSF),
//                Person.class,personList);

        workbook.write(outputStream);
        workbook.close();

        Map<String,Object> map = new HashMap<>();
        map.put("code",1);
        map.put("msg","导出excel成功！");

        return map;
    }
}
