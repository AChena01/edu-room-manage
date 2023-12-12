package edu.room.manage.dto;

import edu.room.manage.domain.Floor;
import lombok.Data;

@Data
public class FloorDTO extends Floor {

    /**
     * 楼主
     */
    private String userName;
}
