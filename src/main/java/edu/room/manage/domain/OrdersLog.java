package edu.room.manage.domain;

import edu.room.manage.common.base.dto.BaseDomain;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Accessors(chain = true)
@Table(name = "orders_log")
public class OrdersLog extends BaseDomain implements Serializable {

    /**
     *
     */
    private Integer ordersId;

    private Approval.ApprovalStatusEnum statusOld;


    private Approval.ApprovalStatusEnum statusNew;

    /**
     *
     */
    private Integer userId;

    /**
     * 备注
     */
    private String remark;
}
