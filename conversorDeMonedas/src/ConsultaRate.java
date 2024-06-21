import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaRate {

    public Moneda cambioPeso(String monedaPrincipal, String monedaFinal ) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/3792eabf2e3487ac788508bb/pair/"+monedaPrincipal+"/"+monedaFinal;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);

        Gson gson = new Gson();
        Moneda miMoneda = gson.fromJson(json, Moneda.class);

        return miMoneda;
    }
}
