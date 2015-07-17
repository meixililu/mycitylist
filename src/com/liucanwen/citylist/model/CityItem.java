package com.liucanwen.citylist.model;

import java.io.Serializable;

import com.liucanwen.citylist.widget.ContactItemInterface;

public class CityItem implements ContactItemInterface, Serializable {  

	private static final long serialVersionUID = 1L;
	private String cityId;
	private String nickName;
	private String fullName;

	public String getCityId() {
		return cityId;
	}
	
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
	public CityItem(String nickName, String fullName)
	{
		super();
		this.nickName = nickName;
		this.setFullName(fullName);
	}
	
	public CityItem(String cityId,String nickName, String fullName)
	{
		super();
		this.cityId = cityId;
		this.nickName = nickName;
		this.setFullName(fullName);
	}

	@Override
	public String getItemForIndex()
	{
		return fullName;
	}

	@Override
	public String getDisplayInfo()
	{
		return nickName;
	}

	public String getNickName()
	{
		return nickName;
	}

	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "CityItem [nickName=" + nickName + ", fullName=" + fullName
				+ "]";
	}

}
