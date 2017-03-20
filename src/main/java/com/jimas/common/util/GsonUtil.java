package com.jimas.common.util;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.jimas.common.ResultVo;

public class GsonUtil {
    private static Gson gson = null;
    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });
        gson = builder.create();
    }

    public static String toJsonString(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> Object parseJson(String json, Class<T> c) {
        return gson.fromJson(json, c);
    }

    public static List<?> parseJsonList(String json, Type type) {
        return ((List<?>) gson.fromJson(json, type));
    }

    public static ResultVo<?> parseJson(String json, Type type) {
        return gson.fromJson(json, type);

    }
}