package com.wzp.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:wzp
 * @Description:部门情况
 * @Date:Created in 14:23 2020/1/17
 * @Version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    @TableId
    private String departmentId;//部门id

    private String departmentName;//部门名字

    private String departmentManager;//部门经理
}
