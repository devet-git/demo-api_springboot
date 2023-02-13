package com.devet.api.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.HashMap;
import java.util.Map;

public class MyResponse {
   final static Map<Integer, String> httpCodes = new HashMap<Integer, String>();
   
   static {
      httpCodes.put(200, "OK");
      httpCodes.put(201, "CREATED");
      httpCodes.put(204, "NO CONTENT");
      httpCodes.put(400, "BAD REQUEST");
      httpCodes.put(401, "UNAUTHORIZED");
      httpCodes.put(403, "FORBIDDEN");
      httpCodes.put(404, "NOT FOUND");
      httpCodes.put(405, "METHOD NOT ALLOWED");
      httpCodes.put(409, "CONFLICT");
      httpCodes.put(500, "INTERNAL SERVER ERROR");
   }
   
   
   public static ObjectNode success(Object data, int statusCode, String message) {
      final ObjectMapper mapper = new ObjectMapper();
      final ObjectNode result = mapper.createObjectNode();
      
      result.set("success", mapper.convertValue(true, JsonNode.class));
      result.set("status", mapper.convertValue(httpCodes.get(statusCode), JsonNode.class));
      result.set("code", mapper.convertValue(statusCode, JsonNode.class));
      result.set("message", mapper.convertValue(message, JsonNode.class));
      result.set("data", mapper.convertValue(data, JsonNode.class));
      
      return result;
   }
   
   public static ObjectNode success(String data, Integer statusCode) {
      final ObjectMapper mapper = new ObjectMapper();
      final ObjectNode result = mapper.createObjectNode();
      
      result.set("success", mapper.convertValue(true, JsonNode.class));
      result.set("status", mapper.convertValue(httpCodes.get(statusCode), JsonNode.class));
      result.set("code", mapper.convertValue(statusCode, JsonNode.class));
      result.set("message", mapper.convertValue(null, JsonNode.class));
      result.set("data", mapper.convertValue(data, JsonNode.class));
      
      return result;
   }
   
   public static ObjectNode error(Object data, int statusCode, String message) {
      final ObjectMapper mapper = new ObjectMapper();
      final ObjectNode result = mapper.createObjectNode();
      
      result.set("success", mapper.convertValue(false, JsonNode.class));
      result.set("status", mapper.convertValue(httpCodes.get(statusCode), JsonNode.class));
      result.set("code", mapper.convertValue(statusCode, JsonNode.class));
      result.set("message", mapper.convertValue(message, JsonNode.class));
      result.set("data", mapper.convertValue(data, JsonNode.class));
      
      return result;
   }
}
