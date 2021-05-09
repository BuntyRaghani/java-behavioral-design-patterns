package com.example.iterator.v1;

public class Application {

    public static void main(String[] args) {

        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        // Printing elements using list iterator
        System.out.println("Printing Elements Using List Iterator: ");
        Iterator listIterator = browseHistory.createIterator();
        while (listIterator.hasNext()) {
            String url = listIterator.current();
            System.out.println(url);
            listIterator.next();
        }


        /* BrowseHistoryV2 class is just for our reference to understand that
         * when we change the iterator type in BrowseHistory class
         * then only the BrowseHistory class will be impacted and
         * there will be no impact inside our main class.
         */
        BrowseHistoryV2 browseHistoryV2 = new BrowseHistoryV2();
        browseHistoryV2.push("a");
        browseHistoryV2.push("b");
        browseHistoryV2.push("c");

        // Printing elements using array iterator
        System.out.println("\nPrinting Elements Using Array Iterator: ");
        Iterator arrayIterator = browseHistoryV2.createIterator();
        while (arrayIterator.hasNext()) {
            String url = arrayIterator.current();
            System.out.println(url);
            arrayIterator.next();
        }
    }
}
