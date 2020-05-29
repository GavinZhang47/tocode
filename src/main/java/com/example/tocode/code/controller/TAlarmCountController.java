package com.example.tocode.code.controller;

import com.example.tocode.code.entity.TAlarmCount;
import com.example.tocode.code.service.TAlarmCountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 告警统计表(TAlarmCount)表控制层
 *
 * @author makejava
 * @since 2020-05-24 20:22:06
 */
@RestController
@RequestMapping("tAlarmCount")
public class TAlarmCountController {
    /**
     * 服务对象
     */
    @Resource
    private TAlarmCountService tAlarmCountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TAlarmCount selectOne(Integer id) {
        return this.tAlarmCountService.queryById(id);
    }

}