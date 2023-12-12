package edu.room.manage.mapper;

import edu.room.manage.common.CustomerMapper;
import edu.room.manage.domain.LoginLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogMapper extends CustomerMapper<LoginLog> {
}
