package com.bm.process.dao.source2;

import com.bm.process.pojo.Aj2013Akmemo;
import com.bm.process.pojo.Aj2013AkmemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Aj2013AkmemoMapper {
    int countByExample(Aj2013AkmemoExample example);

    int deleteByExample(Aj2013AkmemoExample example);

    int deleteByPrimaryKey(String akmemoGuid);

    int insert(Aj2013Akmemo record);

    int insertSelective(Aj2013Akmemo record);

    List<Aj2013Akmemo> selectByExample(Aj2013AkmemoExample example);

    Aj2013Akmemo selectByPrimaryKey(String akmemoGuid);

    int updateByExampleSelective(@Param("record") Aj2013Akmemo record, @Param("example") Aj2013AkmemoExample example);

    int updateByExample(@Param("record") Aj2013Akmemo record, @Param("example") Aj2013AkmemoExample example);

    int updateByPrimaryKeySelective(Aj2013Akmemo record);

    int updateByPrimaryKey(Aj2013Akmemo record);
}