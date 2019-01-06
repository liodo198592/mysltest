package hrj.hrj.mapper;

import hrj.hrj.model.Timelog;

public interface TimelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Timelog record);

    int insertSelective(Timelog record);

    Timelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Timelog record);

    int updateByPrimaryKey(Timelog record);
}