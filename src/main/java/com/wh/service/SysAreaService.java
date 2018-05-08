package com.wh.service;


import com.wh.pojo.SysArea;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysAreaService {
    public List<SysArea> findSysAreaByParentId(long parentId);
}
