package com.hzc.common.entitybefore;

import com.hzc.common.entity.BaseFieldVo;

public class EntityBefore {
    /**
     * 插入数据时，设置DB表的共通字段值
     *
     * @param vo     更新条件
     * @param pageId 插入页面Id
     */
    public static void beforInsert(BaseFieldVo vo, String pageId) {
        BaseFieldValueUtils.setCommonField4Insert(vo, pageId,"更新者");
    }

    /**
     * 更新数据时，设置DB表的共通字段值
     *
     * @param vo     更新条件
     * @param pageId 更新页面Id
     */
    public static void beforUpdate(BaseFieldVo vo, String pageId) {
        BaseFieldValueUtils.setCommonField4Update(vo, pageId, "更新者");
    }
}
