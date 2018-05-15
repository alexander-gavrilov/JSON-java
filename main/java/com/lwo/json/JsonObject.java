package com.lwo.json;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonObject extends JsonNode implements Map<String,JsonNode> {
    private HashMap<String, JsonNode> properties = new HashMap();

    @Override
    public int size() {
        return properties.size();
    }

    @Override
    public boolean isEmpty() {
        return properties.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return properties.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return properties.containsValue(value);
    }

    @Override
    public JsonNode get(Object key) {
        return properties.get(key);
    }

    @Override
    public JsonNode put(String key, JsonNode value) {
        return properties.put(key, value);
    }

    @Override
    public JsonNode remove(Object key) {
        return properties.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends JsonNode> m) {
        properties.putAll(m);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    @Override
    public Set<String> keySet() {
        return properties.keySet();
    }

    @Override
    public Collection<JsonNode> values() {
        return properties.values();
    }

    @Override
    public Set<Entry<String, JsonNode>> entrySet() {
        return properties.entrySet();
    }
}
