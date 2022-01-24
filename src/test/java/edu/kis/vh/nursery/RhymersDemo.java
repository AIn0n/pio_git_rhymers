package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        testRhymes(new DefaultRhymersFactory());
    }

    private final static int ITERATIONS = 15;

    public static void testRhymes(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {
                factory.getStandardRhymer(),
                factory.getFalseRhymer(),
                factory.getFIFORhymer(),
                factory.getHanoiRhymer()
        };
        for (int i = 1; i < ITERATIONS; i++)
            for (DefaultCountingOutRhymer rhymer : rhymers) rhymer.countIn(i);
        java.util.Random rn = new java.util.Random();

        for (int i = 1; i < ITERATIONS; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

}