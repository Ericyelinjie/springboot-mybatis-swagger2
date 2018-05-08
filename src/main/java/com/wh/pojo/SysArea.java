package com.wh.pojo;

public class SysArea {
    private long areaId;
    private String mapId;
    private String areaName;
    private int disOrder;
    private long parentId;

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(int disOrder) {
        this.disOrder = disOrder;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
}
