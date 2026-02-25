import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    private static final String API_KEY = "14024c91a0e2765d92372858";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public Moneda buscarMoneda(String baseCode, String targetCode, double amount) {
        URI direccion = URI.create(BASE_URL + API_KEY + "/pair/" + baseCode + "/" + targetCode + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda o falló la conexión con la API.");
        }
    }
}