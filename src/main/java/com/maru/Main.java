package com.maru;

import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        HashSet hashSet = new HashSet(100);

        hashSet.add("A");
        logger.info(hashSet.contain("A") + "");

        hashSet.add("B");
        logger.info(hashSet.contain("B") + "");

        hashSet.add(1);
        logger.info(hashSet.contain(1) + "");

        hashSet.add(2);
        logger.info(hashSet.contain(2) + "");

        hashSet.remove("A");
//        logger.info(hashSet.contain("A") + "");
    }
}