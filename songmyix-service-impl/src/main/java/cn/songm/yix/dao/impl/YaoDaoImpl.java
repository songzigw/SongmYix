package cn.songm.yix.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.songm.common.dao.BaseDaoImpl;
import cn.songm.yix.dao.YaoDao;
import cn.songm.yix.entity.Yao;

@Repository("yaoDao")
public class YaoDaoImpl extends BaseDaoImpl<Yao> implements YaoDao {

    @Override
    public Yao selectOneById(Object id) {
        return super.selectOneById(id);
    }

    @Override
    public Yao selectOneByColumn(Map<String, Object> paramMap) {
        return super.selectOneByColumn(paramMap);
    }

}
