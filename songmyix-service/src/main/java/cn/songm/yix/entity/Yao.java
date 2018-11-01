package cn.songm.yix.entity;

import cn.songm.common.beans.Entity;

public class Yao extends Entity {

    private static final long serialVersionUID = 1922696142285193658L;

    private String guaId;
    private Integer yaoIndex;
    private Integer yaoNature;
    private String yaoci;
    private String xiang;

    public String getGuaId() {
        return guaId;
    }

    public void setGuaId(String guaId) {
        this.guaId = guaId;
    }

    public Integer getYaoIndex() {
        return yaoIndex;
    }

    public void setYaoIndex(Integer yaoIndex) {
        this.yaoIndex = yaoIndex;
    }

    public Integer getYaoNature() {
        return yaoNature;
    }

    public void setYaoNature(Integer yaoNature) {
        this.yaoNature = yaoNature;
    }

    public String getYaoci() {
        return yaoci;
    }

    public void setYaoci(String yaoci) {
        this.yaoci = yaoci;
    }

    public String getXiang() {
        return xiang;
    }

    public void setXiang(String xiang) {
        this.xiang = xiang;
    }

}
