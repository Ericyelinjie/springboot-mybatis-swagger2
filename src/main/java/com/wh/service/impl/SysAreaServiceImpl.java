package com.wh.service.impl;

import com.wh.dao.mapper.SysAreaMapper;
import com.wh.pojo.SysArea;
import com.wh.service.SysAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service(value = "areaService")
public class SysAreaServiceImpl implements SysAreaService {

    @Autowired
    private SysAreaMapper sysAreaMapper;
    @Override
    public List<SysArea> findSysAreaByParentId(long parentId) {
       try {
            return this.sysAreaMapper.selectAreaByParentId(parentId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
