/*
 * Copyright (C) 2018 Eir.
 */
package fr.rgary;

import fr.rgary.genome.DNA;
import fr.rgary.genome.Day;
import fr.rgary.genome.Hour;
import fr.rgary.genome.Week;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class PrintGenome.
 */
public class PrintGenome {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger(PrintGenome.class);

    public static String printWholeGenome(final DNA pDNA) {
//        LOGGER.info("Best Result: ");
        StringBuilder sb = new StringBuilder();
        sb.append("Best Result is a: ").append(pDNA.realOrigin.name()).append('\n');
        for (final Week week : pDNA.weeks) {
//            LOGGER.info("Week: ");
            sb.append("Week: ").append('\n');
            for (final Day day : week.days) {
//                LOGGER.info("\tDay: ");
                sb.append("\tDay: ").append('\n');
                for (final Hour hour : day.hours) {
//                    LOGGER.info("\t\t%s", hour);
                    sb.append("\t\t").append(hour.toString()).append('\n');
                }
            }
        }
        System.out.printf("%s", sb.toString());
        return sb.toString();
    }

    public static String printObjectID(final Object o) {
        return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }
}
