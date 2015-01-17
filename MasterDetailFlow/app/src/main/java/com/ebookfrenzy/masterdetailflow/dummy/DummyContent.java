package com.ebookfrenzy.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "eBookFrenzy", "http://www.ebookfrenzy.com"));
        addItem(new DummyItem("2", "Amazon", "http://www.amazon.com"));
        addItem(new DummyItem("3", "Wikipedia", "http://www.wikipedia.org"));
        addItem(new DummyItem("4", "Alex's Site", "http://www.alexadusei.me/12aa100/main/aboutme.html"));
        addItem(new DummyItem("5", "Riley's Site", "http://www.rileykarson.com/"));
        addItem(new DummyItem("6", "Scott's Site", "http://www.skilleen.com/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String website_name;
        public String website_url;

        public DummyItem(String id, String website_name, String website_url) {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_name;
        }
    }
}
