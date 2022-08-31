package jsonParsing.json;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("DXC-PIP progetto per creazione e lettura di un JSON JSON JSON");

        /*
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
        */

//metodo 1
        RicettaBean ricettaBean1 = new RicettaBean(1, "primi", "pasta", "pasta, pomodoro", "yellow");

        //metodo 2 usando getter+setter nel caso in cui l'array non sia completo di tutti gli elementi

        RicettaBean ricettaBean2 = new RicettaBean();
        ricettaBean2.setId(2);
        ricettaBean2.setCategoria("secondi");
        ricettaBean2.setNome("orata");
        ricettaBean2.setIngredienti("orata, patate");
        ricettaBean2.setColore("orange");

        List<RicettaBean> listaRicette = new ArrayList<>();
        listaRicette.add(ricettaBean1);
        listaRicette.add(ricettaBean2);

        JSONArray ricette = new JSONArray(listaRicette);
        JSONObject elencoRicette = new JSONObject();

        elencoRicette.put("elenco ricette", ricette);


        System.out.println(ricette.toString(2));

        try (FileWriter file = new FileWriter("elencoRicette.json")) {
            elencoRicette.write(file, 4, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
