package com.hzc.common.util;

import java.util.UUID;



public class IdUtils {
    private IdUtils() {
    }

    /**
     * 获取当前UUID
     */
    public static String getUuid() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = (uuid.toString()).replaceAll("-", "");
        return uuidStr;
    }
}
