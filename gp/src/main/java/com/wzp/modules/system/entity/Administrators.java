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
public class Administrators implements Serializable {
    @TableId
    private int user_id;//员工编号

    private String admin_name;//用户名

    private String admin_password;//密码
}
