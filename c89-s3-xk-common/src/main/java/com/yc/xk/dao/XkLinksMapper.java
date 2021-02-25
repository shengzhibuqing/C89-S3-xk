package com.yc.xk.dao;

import com.yc.xk.bean.XkLinks;
import com.yc.xk.bean.XkLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkLinksMapper {
    long countByExample(XkLinksExample example);

    int deleteByExample(XkLinksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XkLinks record);

    int insertSelective(XkLinks record);

    List<XkLinks> selectByExample(XkLinksExample example);

    XkLinks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XkLinks record, @Param("example") XkLinksExample example);

    int updateByExample(@Param("record") XkLinks record, @Param("example") XkLinksExample example);

    int updateByPrimaryKeySelective(XkLinks record);

    int updateByPrimaryKey(XkLinks record);
}