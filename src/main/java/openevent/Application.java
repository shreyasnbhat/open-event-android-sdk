package openevent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;
import openevent.model.Event;
import openevent.model.api.ApiEvent;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        // Old model deserialization
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Event event = objectMapper.readValue(getFile("event.json"), Event.class);

            System.out.println(event.toString());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // New model deserialization
        ResourceConverter converter = new ResourceConverter(ApiEvent.class);
        JSONAPIDocument<ApiEvent> eventDocument = converter.readDocument(getInputStream("api/event.json"), ApiEvent.class);
        ApiEvent event = eventDocument.get();
        System.out.println(event.toString());
    }

    private static InputStream getInputStream(String fileName) {
        return Application.class.getResourceAsStream("/" + fileName);
    }

    private static String getFile(String fileName) {
        InputStream is = getInputStream(fileName);

        StringBuilder sb=new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String read;

        try {
            while ((read = br.readLine()) != null) {
                sb.append(read).append("\n");
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return sb.toString();

    }


}
