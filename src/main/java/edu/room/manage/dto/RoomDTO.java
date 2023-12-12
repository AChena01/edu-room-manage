package edu.room.manage.dto;

import edu.room.manage.domain.Room;
import lombok.Data;


@Data
public class RoomDTO extends Room {

    /**
     * 辅导员
     */
    private String userName;

    /**
     * 教学楼
     */
    private String floorName;
}
