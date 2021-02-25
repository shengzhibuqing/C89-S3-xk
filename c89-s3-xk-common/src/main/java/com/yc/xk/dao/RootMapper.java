package com.yc.xk.dao;

import com.yc.xk.bean.Root;
import com.yc.xk.bean.RootExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RootMapper {
    long countByExample(RootExample example);

    int deleteByExample(RootExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Root record);

    int insertSelective(Root record);

    List<Root> selectByExample(RootExample example);

    Root selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") Root record, @Param("example") RootExample example);

    int updateByExample(@Param("record") Root record, @Param("example") RootExample example);

    int updateByPrimaryKeySelective(Root record);

    int updateByPrimaryKey(Root record);
}