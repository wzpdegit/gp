package com.wzp.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:wzp
 * @Description:管理员情况
 * @Date:Created in 14:06 2020/1/17
 * @Version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adminnm implements Serializable {
    @TableId
    private String id;//员工编号

    private String name;//用户名

    private String password;//密码
}
