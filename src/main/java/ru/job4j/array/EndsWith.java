package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[post.length + index + 1] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
