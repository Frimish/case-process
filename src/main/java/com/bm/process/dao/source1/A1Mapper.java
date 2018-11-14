package com.bm.process.dao.source1;

import com.bm.process.pojo.A1;
import com.bm.process.pojo.A1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface A1Mapper {
    int countByExample(A1Example example);

    int deleteByExample(A1Example example);

    int insert(A1 record);

    int insertSelective(A1 record);

    List<A1> selectByExample(A1Example example);

    int updateByExampleSelective(@Param("record") A1 record, @Param("example") A1Example example);

    int updateByExample(@Param("record") A1 record, @Param("example") A1Example example);
}