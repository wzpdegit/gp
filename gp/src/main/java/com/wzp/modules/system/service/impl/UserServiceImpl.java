package com.wzp.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzp.modules.system.entity.User;
import com.wzp.modules.system.mapper.UserMapper;
import com.wzp.modules.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author:wzp
 * @Description:
 * @Date:Created in 13:28 2020/2/7
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
    *@Description 添加User信息
    *@Date 13:45 2020/2/7
    *@Param [entity]
    *@return boolean
    **/
    @Override
    public boolean save(User entity) {
        int insert = userMapper.insert(entity);
        if (insert == 1){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    /**
    *@Description 根据id删除用户信息
    *@Date 13:53 2020/2/7
    *@Param [id]
    *@return boolean
    **/
    @Override
    public boolean removeById(Serializable id) {
        int insert = userMapper.deleteById(id);
        if (insert == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<User> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    /**
    *@Description 根据用户id修改用户信息
    *@Date 13:56 2020/2/7
    *@Param [entity]
    *@return boolean
    **/
    @Override
    public boolean updateById(User entity) {
        int insert = userMapper.updateById(entity);
        if (insert == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(User entity, Wrapper<User> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

    /**
    *@Description 根据id找到用户信息
    *@Date 13:57 2020/2/7
    *@Param [id]
    *@return com.wzp.system.entity.User
    **/
    @Override
    public User getById(Serializable id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public Collection<User> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<User> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<User> queryWrapper) {
        return 0;
    }

    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return null;
    }

    /**
    *@Description 分页
    *@Date 13:50 2020/2/7
    *@Param [page, queryWrapper]
    *@return com.baomidou.mybatisplus.core.metadata.IPage<com.wzp.system.entity.User>
    **/
    @Override
    public IPage<User> page(IPage<User> page, Wrapper<User> queryWrapper) {
        userMapper.selectPage(page,queryWrapper);
        return page;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<User> page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<User> getBaseMapper() {
        return userMapper;
    }
}
