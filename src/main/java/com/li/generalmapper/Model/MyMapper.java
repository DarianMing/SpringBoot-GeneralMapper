package com.li.generalmapper.Model;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T> extends IdsMapper<T>, MySqlMapper<T> , tk.mybatis.mapper.common.BaseMapper<T>,
        ConditionMapper<T> , ExampleMapper<T> {
}
