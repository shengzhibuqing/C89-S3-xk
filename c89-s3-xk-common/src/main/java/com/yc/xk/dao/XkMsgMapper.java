package com.yc.xk.dao;

import com.yc.xk.bean.XkMsg;
import com.yc.xk.bean.XkMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkMsgMapper {
    long countByExample(XkMsgExample example);

    int deleteByExample(XkMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XkMsg record);

    int insertSelective(XkMsg record);

    List<XkMsg> selectByExample(XkMsgExample example);

    XkMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XkMsg record, @Param("example") XkMsgExample example);

    int updateByExample(@Param("record") XkMsg record, @Param("example") XkMsgExample example);

    int updateByPrimaryKeySelective(XkMsg record);

    int updateByPrimaryKey(XkMsg record);
}