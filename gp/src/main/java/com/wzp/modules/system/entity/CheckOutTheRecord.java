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
 * @Description:签出记录
 * @Date:Created in 13:51 2020/1/17
 * @Version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckOutTheRecord implements Serializable {
    @TableId
    private String id;

    private String lengthOfShift;//班次时间(早班,晚班,夜班)

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date CheckOutTime;//签出时间
}
