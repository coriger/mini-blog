package com.clo.sdk.android.util;

import org.codehaus.jackson.map.ObjectMapper;

public class ClientContant {

	public static ObjectMapper objectMapper;
	
	
	public static ObjectMapper getObjectMapper(){
		if(objectMapper!=null)return objectMapper;
		return new ObjectMapper();
	}
	

}
