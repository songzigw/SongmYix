package cn.songm.yix.entity;

import java.util.Arrays;
import java.util.List;

import cn.songm.common.beans.Entity;

public class Gua extends Entity {

    private static final long serialVersionUID = 4081161572774220542L;

    private String guaId;
    private String guaName;
    private String guaci;
    private String tuan;
    private String xiang;
    private Integer gindex;
    private Integer sguai;
    private Integer xguai;
    
    private final Yao[] yaos;

    {
        yaos = new Yao[6];
    }
    
    public String getGuaId() {
        return guaId;
    }

    public void setGuaId(String guaId) {
        this.guaId = guaId;
    }

    public String getGuaName() {
        return guaName;
    }

    public void setGuaName(String guaName) {
        this.guaName = guaName;
    }

    public String getGuaci() {
        return guaci;
    }

    public void setGuaci(String guaci) {
        this.guaci = guaci;
    }

    public String getTuan() {
        return tuan;
    }

    public void setTuan(String tuan) {
        this.tuan = tuan;
    }

    public String getXiang() {
        return xiang;
    }

    public void setXiang(String xiang) {
        this.xiang = xiang;
    }

    public Integer getGindex() {
        return gindex;
    }

    public void setGindex(Integer gindex) {
        this.gindex = gindex;
    }

    public Integer getSguai() {
        return sguai;
    }

    public void setSguai(Integer sguai) {
        this.sguai = sguai;
    }

    public Integer getXguai() {
        return xguai;
    }

    public void setXguai(Integer xguai) {
        this.xguai = xguai;
    }
    
    public Yao[] getYaos() {
        return yaos;
    }
    
    public void setYaos(Yao[] yaos) {
        for (int i = 0; i < this.yaos.length; i++) {
            this.yaos[i] = yaos[i];
        }
    }

    @Override
    public String toString() {
        return "Gua [guaId=" + guaId + ", guaName=" + guaName + ", guaci=" + guaci
                + ", tuan=" + tuan + ", xiang=" + xiang + ", gindex=" + gindex
                + ", sguai=" + sguai + ", xguai=" + xguai + ", yaos="
                + Arrays.toString(yaos) + "]";
    }

    public void setYaos(List<Yao> yaos) {
        for (int i = 0; i < this.yaos.length; i++) {
            this.yaos[i] = yaos.get(i);
        } 
    }
}
