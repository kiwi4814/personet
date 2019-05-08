/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */
package com.personet.gearbox.model;

import lombok.Data;

/**
 * ZtreeNode
 *
 * @Description: 抽象Jquery Ztree model
 */
@Data
public abstract class AbstractZtreeNode {

    /**
     * 唯一主键
     */
    public String id;
    /**
     * 父节点ID
     */
    public String pId;
    /**
     * 节点名称
     */
    public String name;

    /**
     * true:展开;false:折叠
     */
    public String open;
    /**
     * true:选择;false:不选择
     */
    public String checked;
    /**
     * [图片路径]只设置Icon,展开和折叠都同一个图标
     */
    public String icon;
    /**
     * [className]利用 className 设置个性化图标
     */
    public String iconSkin;
    /**
     * 展开时的icon
     */
    public String iconOpen;
    /**
     * 折叠时的icon
     */
    public String iconClose;
}
