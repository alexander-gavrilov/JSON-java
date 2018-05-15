package com.lwo.json;

public abstract class JsonNode {
    private JsonNode parent;
    private JsonNode value;

    public JsonNode getParent() {
        return parent;
    }

    public void setParent(JsonNode parent) {
        this.parent = parent;
    }

    public JsonNode getValue() {
        return value;
    }

    public void setValue(JsonNode value) {
        this.value = value;
    }
}
