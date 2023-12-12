package edu.room.manage.service.impl;

import edu.room.manage.common.base.service.BaseServiceImpl;
import edu.room.manage.domain.Admin;
import edu.room.manage.mapper.AdminMapper;
import edu.room.manage.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends BaseServiceImpl<AdminMapper, Admin> implements AdminService{
}
