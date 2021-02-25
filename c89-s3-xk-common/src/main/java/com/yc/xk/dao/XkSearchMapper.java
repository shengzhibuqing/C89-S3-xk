package com.yc.xk.dao;

import com.yc.xk.bean.XkSearch;
import com.yc.xk.bean.XkSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkSearchMapper {
    long countByExample(XkSearchExample example);

    int deleteByExample(XkSearchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XkSearch record);

    int insertSelective(XkSearch record);

    List<XkSearch> selectByExample(XkSearchExample example);

    XkSearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XkSearch record, @Param("example") XkSearchExample example);

    int updateByExample(@Param("record") XkSearch record, @Param("example") XkSearchExample example);

    int updateByPrimaryKeySelective(XkSearch record);

    int updateByPrimaryKey(XkSearch record);
}