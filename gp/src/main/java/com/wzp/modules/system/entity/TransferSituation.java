package com.wzp.modules.system.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
*@Description 调动情况
*@Date 12:43 2020/1/17
*@Param
*@return
**/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferSituation implements Serializable {

    @TableId
    private int user_id;//员工号

    private String postBeforeTransfer;//调动前职务

    private String postTransferDuty;//调动后职务

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date transferTheTime;//调动时间

}
