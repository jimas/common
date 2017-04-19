package com.jimas.common.constant;

/**
* @ClassName: ResultStatusEnum 
* @Description: 返回结果状态枚举
* @author Yawn.Chen
* @date 2015年12月19日 上午10:58:31 
*
 */
public enum ResultStatusEnum {
	SUCCESS(200,"Success","操作成功"),
	PARAMETER_ERROR(400, "Parameter is not set","参数有误"),
	SERVICE_EXCEPTION(500, "Service exceptions","服务异常"),
	TIMEOUT_EXCEPTION(504, "Timeout exceptions","超时异常");
	
	private int status;
	private String message;
	private String messageZh;
	
	ResultStatusEnum(int status, String message, String messageZh){
		this.status = status;
		this.message = message;
		this.messageZh = messageZh;
	}
	public static String getMessage(int status){
		for(ResultStatusEnum rsEnum : ResultStatusEnum.values()){
			if(rsEnum.getStatus()==status){
				return rsEnum.getMessage();
			}
		}
		return null;
	}
	public static String getMessageZh(int status){
	    for(ResultStatusEnum rsEnum : ResultStatusEnum.values()){
	        if(rsEnum.getStatus()==status){
	            return rsEnum.getMessageZh();
	        }
	    }
	    return null;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    public String getMessageZh() {
        return messageZh;
    }
    public void setMessageZh(String messageZh) {
        this.messageZh = messageZh;
    }
}
