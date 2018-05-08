package com.wh.controller;

import com.wh.pojo.SysArea;
import com.wh.service.SysAreaService;
import com.wh.service.impl.SysAreaServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private SysAreaServiceImpl areaService;

    @ApiOperation(value = "测试swagger2", notes = "测试swagger2")
    @RequestMapping(value = "test/{id}", method = RequestMethod.GET)
    public List<SysArea> findSysAreaByParentId(@PathVariable(value = "id") Integer id) {
        return this.areaService.findSysAreaByParentId(id);
    }


    @ApiOperation(value = "测试swagger2", notes = "测试swagger2")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "test/id/{id}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "id") Integer id) {
        return "success";
    }
}
