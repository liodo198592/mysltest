package hrj.hrj.service;

import hrj.hrj.model.*;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface TimelogService {

    int addUser(Timelog user);

    public Timelog selectByPrimaryKey(Integer id);
}
