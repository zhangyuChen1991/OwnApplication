package com.cc.musiclist.constant;

/**
 * Created by zhangyu on 2016/6/19 16:28.
 */
public class Constants {
    public static final int playState = 0x94;
    public static final int STATE_PLAY_PAUSE = 975;
    public static final int STATE_PLAY_STOP = 977;
    public static final int STATE_PLAYING = 979;

    public static final String filesPathCache = "filesPathCache";
    public static final String playListCache = "playListCache";
    public static final String lastPlayFilePath = "lastPlayFilePath";

    public static final String lastPlayPosition = "lastPlayPosition";
    public static final String lastPlayModel = "lastPlayModel";

    public static final int initFileStart = 0x25, initFileOver = 0x27, updateProgress = 0x31, updateAnimatior = 0x41,startNew = 0x33;

    public static final int LEFT = 0x101,RIGHT = 0x103;
}
