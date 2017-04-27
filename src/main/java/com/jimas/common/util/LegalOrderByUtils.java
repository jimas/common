package com.jimas.common.util;

import org.apache.commons.lang.StringUtils;

/**
 * @Description 对排序字段 合法性校验
 * @author weqinjia.liu
 * @Date 2016年9月5日
 */
public class LegalOrderByUtils {
    
    /**
     * 排除 sql注入  true 合法
     * @param orderBy
     * @return
     */
    public static Boolean isLegalOrderBy(String orderBy){
        boolean legal=true;
        if(StringUtils.isEmpty(orderBy)){
            return false;
        }
        orderBy=orderBy.toUpperCase();
        if(orderBy.contains(";")||orderBy.contains("TRUNCATE")||orderBy.contains("DELETE")||orderBy.contains("UPDATE")||orderBy.contains("DROP")){
            return false;
        }
        return legal;
        
        
    }
    
    

}
