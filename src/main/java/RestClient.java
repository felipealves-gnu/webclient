import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

  public static void main(String[] args) {
    final String REST_URI = "http://api.code4socialgood.org/api/skills";
    Client client = ClientBuilder.newClient();

    System.out.println("Status: " + client.target(REST_URI).request(MediaType.APPLICATION_JSON).get());
  }

}
