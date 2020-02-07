package com.wzp.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 */
@Data
public class User implements Serializable {
    @TableId
    private String id;//员工id

    private String name;//员工姓名

    private String password;//员工密码

    private String sex;//员工性别

    private int department;//所属部门编号

    private String position;//职位

    private String education;//学历

    private String graduation;//毕业学校

    private String major;//专业

    private String address;//家庭地址

    private int phone;//电话

    private String email;//邮件

    private String status;//状态(0:在职;1:离职)
}
