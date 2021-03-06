package com.wonderfulme.libjokerjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Thanks johnpile for the jokes!
 * http://prof.johnpile.com/2013/05/28/the-24-bestworst-programming-jokes/
 */

public final class Joker {
    private List<String> mJokes;

    public Joker() {
        mJokes = new ArrayList<>();
        mJokes.add("Knock, knock.\n" +
                "Race condition.\n" +
                "Who’s there.");
        mJokes.add("A guy walks into a bar and asks for 1.014 root beers.\n" +
                "The bartender says: I’ll have to charge you extra, that’s a root beer float.\n" +
                "So the guy says: In that case, better make it a double.");
        mJokes.add("Why is it that women find C to be more attractive than Java?\n" +
                "Because C doesn’t treat them like objects.");
        mJokes.add("Why do programmers confuse Halloween with Christmas?\n" +
                "Because OCT 31 = DEC 25.");
    }

    public String getOneRandomJoke() {
        Random random = new Random();
        int pos = random.nextInt(mJokes.size());
        return mJokes.get(pos);
    }
}