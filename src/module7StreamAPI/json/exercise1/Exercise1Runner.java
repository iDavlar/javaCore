package module7StreamAPI.json.exercise1;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Exercise1Runner {
    static final String PATH = "module7StreamAPI/json/exercise1/test.json";

    public static void main(String[] args) throws Exception {
        byte[] json = ClassLoader.getSystemResourceAsStream(PATH).readAllBytes();
        ObjectMapper mapper = new ObjectMapper();

        Employee employee = mapper.readValue(json, Employee.class);

        System.out.println(employee);
    }
}
