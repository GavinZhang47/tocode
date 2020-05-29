package com.example.tocode.code.dao;

import com.example.tocode.code.entity.TAlarmCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 告警统计表(TAlarmCount)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-24 20:22:02
 */
@Mapper
public interface TAlarmCountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TAlarmCount queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TAlarmCount> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tAlarmCount 实例对象
     * @return 对象列表
     */
    List<TAlarmCount> queryAll(TAlarmCount tAlarmCount);

    /**
     * 新增数据
     *
     * @param tAlarmCount 实例对象
     * @return 影响行数
     */
    int insert(TAlarmCount tAlarmCount);

    /**
     * 修改数据
     *
     * @param tAlarmCount 实例对象
     * @return 影响行数
     */
    int update(TAlarmCount tAlarmCount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}