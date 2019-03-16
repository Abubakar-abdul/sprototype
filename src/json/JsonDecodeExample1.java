/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author SIDDEEQ
 */
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecodeExample1
{
 public static void main(String[] args) 
 {
  String s = "{\"name\":\"Alex\",\"marks\":648.50,\"roll\":12}";
  Object o1 = JSONValue.parse(s);
  JSONObject jsonObj = (JSONObject) o1;
  String name = (String) jsonObj.get("name");
  double marks = (Double) jsonObj.get("marks");
  Integer roll = (Integer) jsonObj.get("roll");
  System.out.println(name + " " + marks + " " + roll);
 }
}
    
