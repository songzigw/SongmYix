package cn.songm.yix.dao.impl;

import org.springframework.stereotype.Repository;

import cn.songm.common.dao.BaseDaoImpl;
import cn.songm.yix.dao.PredictDao;
import cn.songm.yix.entity.Predict;

@Repository("predictDao")
public class PredictDaoImpl extends BaseDaoImpl<Predict> implements PredictDao {

}
