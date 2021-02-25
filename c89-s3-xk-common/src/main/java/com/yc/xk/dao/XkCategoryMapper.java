package com.yc.xk.dao;

import com.yc.xk.bean.XkCategory;
import com.yc.xk.bean.XkCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkCategoryMapper {
    long countByExample(XkCategoryExample example);

    int deleteByExample(XkCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XkCategory record);

    int insertSelective(XkCategory record);

    List<XkCategory> selectByExample(XkCategoryExample example);

    XkCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XkCategory record, @Param("example") XkCategoryExample example);

    int updateByExample(@Param("record") XkCategory record, @Param("example") XkCategoryExample example);

    int updateByPrimaryKeySelective(XkCategory record);

    int updateByPrimaryKey(XkCategory record);
}