package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        int num = random.nextInt(8);
        String prediction = "";
        if (num == 0) {
            prediction = CERTAIN;
        } else if (num == 1) {
            prediction = DEFINITELY;
        } else if (num == 2) {
            prediction = MOST_LIKELY;
        } else if (num == 3) {
            prediction = OUTLOOK_GOOD;
        } else if (num == 4) {
            prediction = ASK_AGAIN_LATER;
        } else if (num == 5) {
            prediction = TRY_AGAIN;
        } else if (num == 6) {
            prediction = NO;
        } else if (num == 7) {
            prediction = VERY_DOUBTFUL;
        } else {
            prediction = null;
        }
        return prediction;
    }
}
