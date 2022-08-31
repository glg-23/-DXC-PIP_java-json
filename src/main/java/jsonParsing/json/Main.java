package jsonParsing.json;

import org.json.JSONObject;
import org.json.JSONArray;

public class Main {

    public static void main(String[] args) {

        System.out.println("DXC-PIP progetto per creazione e lettura di un JSON JSON JSON");

        JSONObject elencoRicette = new JSONObject();

        JSONArray ricetta = new JSONArray();


        JSONObject ricetta1 = new JSONObject();
        JSONObject ricetta2 = new JSONObject();

        ricetta1.put("categoria", "primi");
        ricetta1.put("nome", "pasta");
        ricetta1.put("ingredienti", "pasta, pomodoro");
        ricetta1.put("colore", "yellow");

        ricetta2.put("categoria", "secondi");
        ricetta2.put("nome", "carne");
        ricetta2.put("ingredienti", "carne, sale, olio");
        ricetta2.put("colore", "orange");


        ricetta.put(ricetta1);
        ricetta.put(ricetta2);

        elencoRicette.put("elenco ricette", ricetta);

        System.out.println(elencoRicette.toString(2));

    }
}
