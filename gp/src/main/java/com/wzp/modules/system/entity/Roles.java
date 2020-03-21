package com.wzp.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:wzp
 * @Description:权限表
 * @Date:Created in 15:20 2020/1/19
 * @Version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
    @TableId
    private int id;

    private String roles;//权限
}
