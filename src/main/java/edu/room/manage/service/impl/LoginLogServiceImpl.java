package edu.room.manage.service.impl;

import edu.room.manage.common.base.service.BaseServiceImpl;
import edu.room.manage.domain.LoginLog;
import edu.room.manage.mapper.LoginLogMapper;
import edu.room.manage.service.LoginLogService;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl extends BaseServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {
}
