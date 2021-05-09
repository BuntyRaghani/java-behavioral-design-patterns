package com.example.iterator.v1;

public class BrowseHistoryV2 {

    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {
        private BrowseHistoryV2 browseHistoryV2;
        private int index;

        public ArrayIterator(BrowseHistoryV2 browseHistoryV2) {
            this.browseHistoryV2 = browseHistoryV2;
        }

        @Override
        public boolean hasNext() {
            return (index < browseHistoryV2.count);
        }

        @Override
        public String current() {
            return browseHistoryV2.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
