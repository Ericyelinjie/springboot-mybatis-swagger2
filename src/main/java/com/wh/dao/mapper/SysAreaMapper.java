package com.wh.dao.mapper;


import com.wh.pojo.SysArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface SysAreaMapper {
    // 根据parentId查询地区
    public List<SysArea> selectAreaByParentId(@Param("parentId") long parentId) throws SQLException;
}
