package lab2526.ex1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import com.google.gson.JsonParser;
import com.google.gson.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {

    public Parser() throws IOException, JsonException {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("https://yandex.ru").timeout(5000).get();

        }catch (IOException e){

        }
        JsonObject res = new JsonObject();
        JsonObject station = new JsonObject();
        JsonArray metro_line = new JsonArray();


        Elements stations = document.select("div.js-metro-stations");

        for(Element metro_station : stations){
            JsonArray massiv_station = new JsonArray();
            for(Element metro_st: metro_station.select("span.name")){
                massiv_station.add(metro_st.text());
            }
            station.add(metro_station.attr("data-line"), massiv_station);

        }

        Elements lines = document.select("span.js-metro-line");

        for(Element line : lines){
            JsonObject ln = new JsonObject();
            ln.addProperty("number",line.attr("data-line"));
            ln.addProperty("name",line.text());
            metro_line.add(ln);
        }

        res.add("station", station);
        res.add("lines", metro_line);

        saveJson(res.toString());
        calculateStation();
    }

    public void saveJson(String json_content){
        try{
            FileWriter writer = new FileWriter("src/lab2526/metro.json");
            writer.write(json_content);
            writer.flush();
        }catch (IOException e){

        }
    }

    public void calculateStation() throws IOException, JsonException {
        String content = "";
        try{
            FileReader read = new FileReader("src/lab2526/metro.json");
            int c;
            while ((c=read.read())!=-1){

                content += (char)c;
                //c = read.read();
            }
            JSONObject json = new JSONObject(content);
            System.out.println(json);
            System.out.println(json.get("lines"));
            System.out.println(json.get("station"));
            JSONObject stat = (JSONObject) json.get("station");
            JsonObject jsonObject = (new JsonParser()).parse(content).getAsJsonObject();
            JsonObject stations = (JsonObject) jsonObject.get("station");
            System.out.println("Количество станций на каждой линии: ");
            for(String key : stations.keySet())
                System.out.println(key + " " + ((JsonArray)stations.get(key)).size());
        }catch (IOException e){

        }
    }

    public static void main(String[] args) throws IOException, JsonException {
        Parser parser = new Parser();
    }
}
