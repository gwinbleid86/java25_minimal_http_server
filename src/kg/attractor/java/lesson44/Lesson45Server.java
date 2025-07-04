package kg.attractor.java.lesson44;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class Lesson45Server extends Lesson44Server{
    public Lesson45Server(String host, int port) throws IOException {
        super(host, port);
        registerGet("/login", this::loginGet);
        registerPost("/login", this::loginPost);
    }

    private void loginPost(HttpExchange exchange) {
//        String cType = getContentType(exchange);
//        String raw = getBody(exchange);
//
//        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
//
//        String fmt = "<p>Необработанные данные: <b>%s</b></p>" +
//                "<p>Content-Type: <b>%s</b></p>" +
//                "<p>После обработки: <b>%s</b></p>";
//        String data = String.format(fmt, raw, cType, parsed);
//
//        try{
//            sendByteData(exchange, ResponseCodes.OK, ContentType.TEXT_HTML, data.getBytes());
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        redirect303(exchange, "/");
    }

    private void loginGet(HttpExchange exchange) {
//        Path path = makeFilePath("login.ftlh");
//        sendFile(exchange, path, ContentType.TEXT_HTML);
        renderTemplate(exchange, "login.ftlh", null);
    }
}
