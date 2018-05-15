package com.lwo.json;

import java.util.*;

public class JsonArray extends JsonNode implements List<JsonNode> {
    List<JsonNode> values = new ArrayList<>();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<JsonNode> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(JsonNode jsonNode) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends JsonNode> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends JsonNode> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public JsonNode get(int index) {
        return null;
    }

    @Override
    public JsonNode set(int index, JsonNode element) {
        return null;
    }

    @Override
    public void add(int index, JsonNode element) {

    }

    @Override
    public JsonNode remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<JsonNode> listIterator() {
        return null;
    }

    @Override
    public ListIterator<JsonNode> listIterator(int index) {
        return null;
    }

    @Override
    public List<JsonNode> subList(int fromIndex, int toIndex) {
        return null;
    }
}
