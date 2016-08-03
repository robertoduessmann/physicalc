package com.roberto.physicalc.impl;

import org.json.simple.JSONObject;

public class JsonUtil {
	public static String generateJson (double mass, double energy){
		
		JSONObject obj = new JSONObject();
		obj.put("equation", "e=mc2");
		obj.put("mass", mass);
		obj.put("energy", energy);
		
		return obj.toJSONString();
	}
}
