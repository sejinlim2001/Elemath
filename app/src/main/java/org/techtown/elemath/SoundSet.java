package org.techtown.elemath;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;

import java.util.HashMap;

public class SoundSet {
    public static final int successSound = R.raw.successsound;
    public static final int buttonSound = R.raw.buttonsound;
    public static final int failSound = R.raw.failsound;
    public static final int alertSound = R.raw.alertsound;

    private static SoundPool soundPool;
    private static HashMap<Integer, Integer> soundPoolMap;

    public static void initSounds(Context context) {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        soundPoolMap = new HashMap<>(4);
        soundPoolMap.put(buttonSound, soundPool.load(context, buttonSound, 1));
        soundPoolMap.put(successSound, soundPool.load(context, successSound, 2));
        soundPoolMap.put(failSound, soundPool.load(context, failSound, 3));
        soundPoolMap.put(alertSound, soundPool.load(context, alertSound, 4));
    }

    public static void play(int rawID){
        if (soundPoolMap.containsKey(rawID)) {
            soundPool.play(soundPoolMap.get(rawID), 1f, 1f, 1, 0, 1f);
        }
    }
}
