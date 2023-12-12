package edu.room.manage.mapper;

import edu.room.manage.common.CustomerMapper;
import edu.room.manage.common.mybatis.condition.MybatisCondition;
import edu.room.manage.domain.Approval;
import edu.room.manage.dto.ApprovalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalMapper extends CustomerMapper<Approval> {

    /**
     * 列表
     * @param mybatisCondition
     * @return
     */
    List<ApprovalDTO> selectDto(MybatisCondition mybatisCondition);
}
