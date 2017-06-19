package openevent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import openevent.model.Event;
import openevent.model.Microlocation;
import openevent.model.Session;
import openevent.model.SessionType;
import openevent.model.Speaker;
import openevent.model.Sponsor;
import openevent.model.Track;
import openevent.model.api.ApiEvent;
import openevent.model.api.ApiMicrolocation;
import openevent.model.api.ApiSession;
import openevent.model.api.ApiSessionType;
import openevent.model.api.ApiSpeaker;
import openevent.model.api.ApiSponsor;
import openevent.model.api.ApiTrack;

public class Application {

    private ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        Application application = new Application();

        try {
            //Event Deserialization
            application.doModelDeserialization(Event.class, ApiEvent.class, "event", false);

            //Microlocations Deserialization
            application.doModelDeserialization(Microlocation.class, ApiMicrolocation.class, "microlocations", true);

            //Sponsor Deserialization
            application.doModelDeserialization(Sponsor.class, ApiSponsor.class, "sponsors", true);

            //Track Deserialization
            application.doModelDeserialization(Track.class, ApiTrack.class, "tracks", true);

            //SessionType Deserialization
            application.doModelDeserialization(SessionType.class, ApiSessionType.class, "session_types", true);

            //Session Deserialization
            application.doModelDeserialization(Session.class, ApiSession.class, "sessions", true);

            //Speakers Deserialization
            application.doModelDeserialization(Speaker.class, ApiSpeaker.class, "speakers", true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private <T, V> void doModelDeserialization(Class<T> oldType, Class<V> newType, String jsonSource, boolean isList) throws IOException {
        oldModelDeserialization(oldType, jsonSource, isList);
        newModelDeserialization(newType, jsonSource, isList);
        System.out.println();
    }

    private <T> void oldModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = jsonSource + ".json";
        if (isList) {
            List<T> items = objectMapper.readValue(getFile(path), new TypeReference<List<T>>() {});
            System.out.println(items.toString());
        } else {
            T item = objectMapper.readValue(getFile(path), type);
            System.out.println(item.toString());
        }
    }

    private <T> void newModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = "api/" + jsonSource + ".json";
        ResourceConverter converter = new ResourceConverter(type);
        if (isList) {
            JSONAPIDocument<List<T>> document = converter.readDocumentCollection(getInputStream(path), type);
            System.out.println(document.get());
        } else {
            JSONAPIDocument<T> document = converter.readDocument(getInputStream(path), type);
            System.out.println(document.get());
        }
    }

    private static InputStream getInputStream(String fileName) {
        return Application.class.getResourceAsStream("/" + fileName);
    }

    private static String getFile(String fileName) {
        InputStream is = getInputStream(fileName);

        StringBuilder sb = new StringBuilder();
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
