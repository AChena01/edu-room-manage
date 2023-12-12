package edu.room.manage.mapper;

import edu.room.manage.common.CustomerMapper;
import edu.room.manage.domain.OrdersLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersLogMapper extends CustomerMapper<OrdersLog> {
}
