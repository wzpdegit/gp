package com.wzp.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzp.modules.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
