package edu.room.manage.domain;

import edu.room.manage.common.base.dto.BaseDomain;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "message")
public class Message extends BaseDomain {

    /**
     *
     */
    private Integer userId;

    /**
     * 内容
     */
    private String content;

    /**
     * 教室
     */
    private Integer roomId;
}
