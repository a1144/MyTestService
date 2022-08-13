package com.test.mytestservice.datasource.mapper;

import com.test.mytestservice.datasource.dao.TestTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestTableMapper {
    @Select("select * from testtable")
    List<TestTable> selectAll ();
    List<TestTable> selectLastThree();

}
