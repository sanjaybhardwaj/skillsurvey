package au.com.redbackconsulting.skillsurvey.connectivity.helper;

import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;

import au.com.redbackconsulting.scheduler.api.bean.UserBean;
import au.com.redbackconsulting.skillsurvey.api.util.GsonFactory;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class CoreODataParser {

    private static final CoreODataParser INSTANCE = new CoreODataParser();

    public static CoreODataParser getInstance() {
        return INSTANCE;
    }

    private final Gson gson = GsonFactory.getInstance().getGson();

    private CoreODataParser() {
    }

    public SFUser loadSFUserProfileFromJsom(String json) throws IOException {
        JsonReader reader = getJsonReader(json);
        SFUser sfuser = gson.fromJson(reader, SFUser.class);
        closeJsonReader(reader);
        return sfuser;
    }
    
    public UserBean loadUserBeanProfileFromJsom(String json) throws IOException {
        JsonReader reader = getJsonReader(json);
        UserBean ubuser = gson.fromJson(reader, UserBean.class);
        closeJsonReader(reader);
        return ubuser;
    }

    public List<SFUser> loadSFUserProfileListFromJsom(String json) throws IOException {
        if (json == null) {
            return Collections.emptyList();
        }
        JsonReader reader = getJsonReader(json);
        SFUserList sfUsers = (SFUserList) gson.fromJson(reader, SFUserList.class);
        closeJsonReader(reader);
        return sfUsers.results;
    }

    private JsonReader getJsonReader(String json) throws IOException {
        JsonReader reader = new JsonReader(new StringReader(json));
        return openJsonReader(reader);
    }

    private JsonReader openJsonReader(JsonReader reader) throws IOException {
        // Bypasses the top level element
        reader.beginObject();
        reader.nextName();
        return reader;
    }

    private JsonReader closeJsonReader(JsonReader reader) throws IOException {
        reader.endObject();
        reader.close();
        return reader;
    }

}
