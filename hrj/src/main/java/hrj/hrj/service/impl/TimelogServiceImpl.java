package hrj.hrj.service.impl;

import hrj.hrj.mapper.*;
import hrj.hrj.model.*;
import hrj.hrj.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service(value = "timelogService")
public class TimelogServiceImpl implements TimelogService {

    @Autowired
    private TimelogMapper timelogMapper;// 这里会报错，但是并不会影响

    @Override
    public int addUser(Timelog user) {

        return timelogMapper.insertSelective(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数 pageSize 每页显示的数据条数
     */
    @Override
    public Timelog selectByPrimaryKey(Integer id) {
        // 将参数传给这个方法就可以实现物理分页了，非常简单。
        System.out.println("before timelogMapper.selectByPrimaryKey");
        return timelogMapper.selectByPrimaryKey(id);
    }
}