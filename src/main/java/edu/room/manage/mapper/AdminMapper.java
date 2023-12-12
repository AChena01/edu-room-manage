package edu.room.manage.mapper;

import edu.room.manage.common.CustomerMapper;
import edu.room.manage.domain.Admin;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMapper extends CustomerMapper<Admin> {
}
