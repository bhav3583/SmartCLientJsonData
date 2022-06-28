package com.jsonProg;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJSONFile {
    public static void main(String[] args) throws IOException, ParseException {


        JSONParser jsonparser = new JSONParser();

        FileReader reader = new FileReader("jsonfiles/jsondata.json");
        Object obj = jsonparser.parse(reader);

        JSONObject empjsonobj = (JSONObject)obj;

        JSONObject corners=(JSONObject)empjsonobj.get("Corners");
        JSONObject fouls=(JSONObject)empjsonobj.get("Fouls");
        JSONObject goalKicks=(JSONObject)empjsonobj.get("GoalKicks");
        JSONObject throwIns=(JSONObject)empjsonobj.get("ThrowIns");
        JSONObject goals=(JSONObject)empjsonobj.get("Goals");

        System.out.println("Corners =" +corners.get("Score"));
        System.out.println("Fouls =" +fouls.get("Score"));
        System.out.println("GoalKicks =" +goalKicks.get("Score"));
        System.out.println("ThrowIns =" +throwIns.get("Score"));
        System.out.println("Goals =" +goals.get("Score"));

        empjsonobj.remove("CustomerId");
        empjsonobj.put("CustomerId",1);
        System.out.println("Updated CustomerId is : "+empjsonobj.get("CustomerId"));

        empjsonobj.remove("FixtureId");
        empjsonobj.put("FixtureId",1001);
        System.out.println("Updated FixtureId is " + empjsonobj.get("FixtureId"));

        empjsonobj.remove("StartTimes.FirstHalf");
        empjsonobj.put("StartTimes.FirstHalf","2022-06-29T00:01:30.000Z");
        System.out.println("Updated FirstHalf : "+ empjsonobj.get("StartTimes.FirstHalf"));

        empjsonobj.remove("StartTimes.SecondHalf");
        empjsonobj.put("StartTimes.SecondHalf","2022-06-29T00:00:30.000Z");
        System.out.println("Updated SecondHalf : "+ empjsonobj.get("StartTimes.SecondHalf"));

        System.out.println(empjsonobj);













    }


}
