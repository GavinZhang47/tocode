package com.example.tocode.code.service.impl;

import com.example.tocode.code.entity.TAlarmCount;
import com.example.tocode.code.dao.TAlarmCountDao;
import com.example.tocode.code.service.TAlarmCountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 告警统计表(TAlarmCount)表服务实现类
 *
 * @author makejava
 * @since 2020-05-24 20:22:05
 */
@Service
public class TAlarmCountServiceImpl implements TAlarmCountService {
    @Resource
    private TAlarmCountDao tAlarmCountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TAlarmCount queryById(Integer id) {
        TAlarmCount tAlarmCount = new TAlarmCount();
        try {
            tAlarmCount = tAlarmCountDao.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tAlarmCount;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TAlarmCount> queryAllByLimit(int offset, int limit) {
        return this.tAlarmCountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tAlarmCount 实例对象
     * @return 实例对象
     */
    @Override
    public TAlarmCount insert(TAlarmCount tAlarmCount) {
        this.tAlarmCountDao.insert(tAlarmCount);
        return tAlarmCount;
    }

    /**
     * 修改数据
     *
     * @param tAlarmCount 实例对象
     * @return 实例对象
     */
    @Override
    public TAlarmCount update(TAlarmCount tAlarmCount) {
        this.tAlarmCountDao.update(tAlarmCount);
        return this.queryById(tAlarmCount.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tAlarmCountDao.deleteById(id) > 0;
    }
}