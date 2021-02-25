package com.yc.xk.dao;

import com.yc.xk.bean.XkMovie;
import com.yc.xk.bean.XkMovieExample;
import com.yc.xk.bean.XkMovieWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkMovieMapper {
    long countByExample(XkMovieExample example);

    int deleteByExample(XkMovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XkMovieWithBLOBs record);

    int insertSelective(XkMovieWithBLOBs record);

    List<XkMovieWithBLOBs> selectByExampleWithBLOBs(XkMovieExample example);

    List<XkMovie> selectByExample(XkMovieExample example);

    XkMovieWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XkMovieWithBLOBs record, @Param("example") XkMovieExample example);

    int updateByExampleWithBLOBs(@Param("record") XkMovieWithBLOBs record, @Param("example") XkMovieExample example);

    int updateByExample(@Param("record") XkMovie record, @Param("example") XkMovieExample example);

    int updateByPrimaryKeySelective(XkMovieWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(XkMovieWithBLOBs record);

    int updateByPrimaryKey(XkMovie record);
}