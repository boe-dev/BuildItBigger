package de.boe_dev;

import java.util.Random;

public class Joke {

    private static final String[] joke = {"Why do programmers always mix up Halloween and Christmas?\n" + "Because Oct 31 == Dec 25!",
            "Two bytes meet.  The first byte asks, “Are you ill?” \n" + "The second byte replies, “No, just feeling a bit off.”",
            "How many programmers does it take to change a light bulb?\n" + "None – It’s a hardware problem",
            "“Knock, knock.”\n" + "“Who’s there?”\n" + "very long pause….\n" + "“Java.“",
            "Have you heard about the new Cray super computer?  It’s so fast, it executes an infinite loop in 6 seconds."};

    private int randomJoke() {
        Random rn = new Random();
        return rn.nextInt(joke.length);
    }

    public String getRandomJoke() {
        return joke[randomJoke()];
    }
}
