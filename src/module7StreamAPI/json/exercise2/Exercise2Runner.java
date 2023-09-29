package module7StreamAPI.json.exercise2;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Exercise2Runner {
    static final String PATH = "module7StreamAPI/json/exercise2/test.json";

    public static void main(String[] args) throws Exception {
        byte[] json = ClassLoader.getSystemResourceAsStream(PATH).readAllBytes();
        ObjectMapper mapper = new ObjectMapper();

        ColourPiсker colourPiсker = mapper.readValue(json, ColourPiсker.class);
        colourPiсker.pick();

    }
}
