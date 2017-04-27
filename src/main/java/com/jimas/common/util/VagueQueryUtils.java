package com.jimas.common.util;

import org.apache.commons.lang.StringUtils;

/**
 * @Description 模糊查询 参数设置 工具
 * @author weqinjia.liu
 * @Date 2016年9月21日
 */
public class VagueQueryUtils {
    private static final String fix="%";
    /**
     * 得到左边模糊匹配的param
     * @param str
     * @return
     */
    public static String getLeftVagueParam(String str){
        if(StringUtils.isEmpty(str)){
            return str;
        }
        return fix+str;
    }
    /**
     * 得到右边模糊匹配的param
     * @param str
     * @return
     */
    public static String getRightVagueParam(String str){
        if(StringUtils.isEmpty(str)){
            return str;
        }
        return str+fix;
    }
    /**
     * 得到全模糊匹配的param
     * @param str
     * @return
     */
    public static String getVagueParam(String str){
        if(StringUtils.isEmpty(str)){
            return str;
        }
        return fix+str+fix;
    }

}
