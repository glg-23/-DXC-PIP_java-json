package jsonParsing.json;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.CDL;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println();
        System.out.println("DXC-PIP progetto per creazione e lettura di un file JSON");


        //versione 1 (creare json direttamente nel main)
        /*
            System.out.println("creazione json direttamente nel main");
            System.out.println();

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


        //versione 2 (creare json utilizzando la classe Bean)
        /*
            System.out.println("creazione json utilizzando classe Bean");
            System.out.println();

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

            JSONObject elencoRicette = new JSONObject();
            JSONArray ricette = new JSONArray(listaRicette);

            elencoRicette.put("elenco ricette", ricette);

            System.out.println(ricette.toString(2));
*/


        //versione 3 (creare json da un file .csv)
        System.out.println("creazione json da un file .csv");
        System.out.println();

        JSONArray headerRicette = new JSONArray();

        headerRicette.put("id");
        headerRicette.put("categoria");
        headerRicette.put("nome");
        headerRicette.put("ingredienti");
        headerRicette.put("colore");

        String ricetteCSV = new String(Files.readAllBytes(Paths.get("ricetteCSV.csv")));
        System.out.println(ricetteCSV);
        System.out.println();

        JSONArray elencoRicette = CDL.toJSONArray(headerRicette, ricetteCSV);

        System.out.println(elencoRicette.toString(2));

        //ok per tutte le versioni
        try (FileWriter file = new FileWriter("elencoRicette.json")) {
            elencoRicette.write(file, 4, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
