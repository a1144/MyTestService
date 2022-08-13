package com.test.mytestservice.service;

import com.test.mytestservice.datasource.dao.TestTable;

import java.util.List;

public interface ITestTableService {
    List<TestTable> selectAll();

    List<TestTable> selectLastThree();
}
