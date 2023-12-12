package edu.room.manage.dto;

import edu.room.manage.domain.Classes;
import lombok.Data;

@Data
public class ClassesDTO extends Classes {

    /**
     * 辅导员名字
     */
    private String userName;
}
