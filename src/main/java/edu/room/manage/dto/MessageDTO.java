package edu.room.manage.dto;

import edu.room.manage.domain.Message;
import lombok.Data;

@Data
public class MessageDTO extends Message {

    /**
     *
     */
    private String userName;

    /**
     *
     */
    private String roomName;

    /**
     *
     */
    private String floorName;
}
