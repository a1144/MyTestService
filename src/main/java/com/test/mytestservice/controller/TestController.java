package com.test.mytestservice.controller;

import com.test.mytestservice.datasource.dao.TestTable;
import com.test.mytestservice.service.ITestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller()
@RequestMapping("test")
public class TestController {
    @Autowired
    private ITestTableService tableService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<TestTable> selectAll() {
        return tableService.selectAll();
    }

    @RequestMapping("/selectLastThree")
    @ResponseBody
    public List<TestTable> selectLastThree() {
        return tableService.selectLastThree();
    }

}
