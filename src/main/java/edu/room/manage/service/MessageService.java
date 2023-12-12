package edu.room.manage.service;

import com.github.pagehelper.PageInfo;
import edu.room.manage.common.base.service.BaseService;
import edu.room.manage.common.mybatis.condition.MybatisCondition;
import edu.room.manage.domain.Message;
import edu.room.manage.dto.MessageDTO;

public interface MessageService extends BaseService<Message> {
    PageInfo<MessageDTO> selectDtoPage(MybatisCondition condition);
}
