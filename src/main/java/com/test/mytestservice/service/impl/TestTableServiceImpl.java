package com.test.mytestservice.service.impl;

import com.test.mytestservice.datasource.dao.TestTable;
import com.test.mytestservice.datasource.mapper.TestTableMapper;
import com.test.mytestservice.service.ITestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTableServiceImpl implements ITestTableService {
    @Autowired
    private TestTableMapper testTableMapper;
    @Override
    public List<TestTable> selectAll() {
        return testTableMapper.selectAll();
    }

    @Override
    public List<TestTable> selectLastThree() {
        return testTableMapper.selectLastThree();
    }
}
