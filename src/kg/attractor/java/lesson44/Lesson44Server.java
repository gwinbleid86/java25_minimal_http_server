package kg.attractor.java.lesson44;

import com.sun.net.httpserver.HttpExchange;
import kg.attractor.java.server.BasicServer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lesson44Server extends BasicServer {

    public Lesson44Server(String host, int port) throws IOException {
        super(host, port);
        registerGet("/sample", this::freemarkerSampleHandler);
    }

    private void freemarkerSampleHandler(HttpExchange exchange) {
        renderTemplate(exchange, "sample.ftlh", getSampleDataModel());
    }

    private Object getSampleDataModel() {
        // возвращаем экземпляр тестовой модели-данных
        // которую freemarker будет использовать для наполнения шаблона
//        return new SampleDataModel();
        SampleDataModel sdm = new SampleDataModel();
        Map<String, Object> data = new HashMap<>();
        data.put("user", sdm.getUser());
        data.put("customers", sdm.getCustomers());
        data.put("currentDateTime", sdm.getCurrentDateTime());
        return data;
    }
}
