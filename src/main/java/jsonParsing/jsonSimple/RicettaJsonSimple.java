package jsonParsing.jsonSimple;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

//utilizzato solo per versione 2

public class RicettaJsonSimple implements JSONStreamAware {

    private int numElemento;
    private String categoria;
    private String nome;
    private String ingredienti;
    private String colore;

    public RicettaJsonSimple(int numElemento, String categoria, String nome, String ingredienti, String colore) {
        this.numElemento = numElemento;
        this.categoria = categoria;
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.colore = colore;
    }

    @Override
    public void writeJSONString(Writer writer) throws IOException{
        Map<String, Serializable> map = new LinkedHashMap<String, Serializable>();

        map.put("numElemento",numElemento);
        map.put("categoria",categoria);
        map.put("nome",nome);
        map.put("ingredienti",ingredienti);
        map.put("colore",colore);

        JSONValue.writeJSONString(map, writer);
    }
}
