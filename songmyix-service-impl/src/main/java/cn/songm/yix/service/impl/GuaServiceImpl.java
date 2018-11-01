package cn.songm.yix.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.songm.yix.dao.GuaDao;
import cn.songm.yix.dao.PredictDao;
import cn.songm.yix.dao.YaoDao;
import cn.songm.yix.entity.Gua;
import cn.songm.yix.entity.Predict;
import cn.songm.yix.entity.Yao;
import cn.songm.yix.service.GuaService;

@Repository("guaService")
public class GuaServiceImpl implements GuaService {

    @Autowired
    private GuaDao guaDao;
    @Autowired
    private YaoDao yaoDao;
    @Autowired
    private PredictDao predictDao;

    @Override
    public void addGua(Gua gua) {
        guaDao.insert(gua);
        Yao[] yaos = gua.getYaos();
        for (int i = 0; i < yaos.length; i++) {
            if (yaos[i] != null && getYaoById(yaos[i].getGuaId(), yaos[i].getYaoIndex(),
                    yaos[i].getYaoNature()) == null) {
                yaoDao.insert(yaos[i]);
            }
        }
    }

    @Override
    public void addPredict(Predict pre) {
        pre.setPreId(predictDao.selectSequence());
        predictDao.insert(pre);
    }

    @Override
    public Gua getGuaById(String guaId) {
        Gua g = guaDao.selectOneById(guaId);
        Map<String, Object> map = new HashMap<>();
        map.put("guaId", guaId);
        g.setYaos(yaoDao.selectListByColumn(map));
        return g;
    }

    @Override
    public Yao getYaoById(String guaId, int yaoIndex, int yaoNature) {
        Map<String, Object> map = new HashMap<>();
        map.put("guaId", guaId);
        map.put("yaoIndex", yaoIndex);
        map.put("yaoNature", yaoNature);
        return yaoDao.selectOneByColumn(map);
    }

    @Override
    public List<Gua> getGuas64() {
        return guaDao.selectListByColumn(new HashMap<>());
    }

    @Override
    public void addYao(Yao yao) {
        yaoDao.insert(yao);
    }

    @Override
    public Gua getGuaByIndex(int index) {
        Map<String, Object> map = new HashMap<>();
        map.put("gindex", index);
        Gua g = guaDao.selectOneByColumn(map);
        if (g == null) return null;
        map = new HashMap<>();
        map.put("guaId", g.getGuaId());
        g.setYaos(yaoDao.selectListByColumn(map));
        return g;
    }

    @Override
    public Gua getGuaByIndex(int sguai, int xguai) {
        Map<String, Object> map = new HashMap<>();
        map.put("sguai", sguai);
        map.put("xguai", xguai);
        Gua g = guaDao.selectOneByColumn(map);
        if (g == null) return null;
        map = new HashMap<>();
        map.put("guaId", g.getGuaId());
        g.setYaos(yaoDao.selectListByColumn(map));
        return g;
    }
}
