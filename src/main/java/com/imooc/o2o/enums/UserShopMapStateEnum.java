package com.imooc.o2o.enums;

public enum UserShopMapStateEnum {
     
	SUCCESS(1,"操作成功"), FAIL(-1,"操作失败"), NULL_ERROR(-1000,"参数为空");
	
	private int state;
	
	private String stateInfo;

	private UserShopMapStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	/**
	 * 根据传入的状态值返回UserShopMapStateEnum对象
	 * @param state
	 * @return
	 */
	public static UserShopMapStateEnum stateOf(int state) {
		for(UserShopMapStateEnum UserShopMapStateEnum: values()) {
			if(state == UserShopMapStateEnum.getState()) {
				return UserShopMapStateEnum;
			}
		}
		return null;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	} 
}
