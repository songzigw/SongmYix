package cn.songm.yix.service;

import java.util.List;

import cn.songm.yix.entity.Gua;
import cn.songm.yix.entity.Predict;
import cn.songm.yix.entity.Yao;

public interface GuaService {

    void addGua(Gua gua);
    
    void addYao(Yao yao);

    void addPredict(Predict pre);

    Gua getGuaById(String guaId);
    
    Gua getGuaByIndex(int index);
    
    Gua getGuaByIndex(int sguai, int xguai);

    Yao getYaoById(String guaId, int yaoIndex, int yaoNature);
    
    List<Gua> getGuas64();
    
    //Gua getHuGua(String guaId);
}
