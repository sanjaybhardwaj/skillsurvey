package au.com.redbackconsulting.skillsurvey.api.util;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * java.util.Date serializer/deserializer in UTC format.
 * 
 * @author Chavdar Baikov
 */
public class DateTimeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

    private static final String UTC_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private final DateFormat dateFormat;

    public DateTimeAdapter() {
        dateFormat = new SimpleDateFormat(UTC_DATE_FORMAT, Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }


    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        synchronized (dateFormat) {
            return new JsonPrimitive(dateFormat.format(date));
        }
    }


    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            synchronized (dateFormat) {
                return dateFormat.parse(jsonElement.getAsString());
            }
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }

}
