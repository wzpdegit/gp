package com.wzp.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:wzp
 * @Description:工资查询
 * @Date:Created in 13:56 2020/1/17
 * @Version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WageQuery implements Serializable {
    @TableId
    private int user_id;//员工号

    private int basicSalary;//基本工资

    private int postAllowance;//岗位津贴

    private int OvertimeAllowance;//加班补贴

    private int businessTripViolation;//出差违纪

    private int violationDeduction;//违纪扣除

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payDate;//发薪日期
}
