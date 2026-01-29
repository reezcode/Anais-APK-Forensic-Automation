package com.tencent.smtt.sdk;

import android.graphics.SurfaceTexture;
import android.os.Bundle;

/* loaded from: classes17.dex */
public class TbsMediaPlayer {

    /* renamed from: a, reason: collision with root package name */
    private n f1964a;

    /* loaded from: classes4.dex */
    public interface TbsMediaPlayerListener {
        public static final int MEDIA_EXTRA_AUDIOTRACK_INDEX = 104;
        public static final int MEDIA_EXTRA_AUDIOTRACK_TITLES = 103;
        public static final int MEDIA_EXTRA_SUBTITLE_COUNT = 101;
        public static final int MEDIA_EXTRA_SUBTITLE_INDEX = 102;
        public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
        public static final int MEDIA_INFO_BUFFERING_END = 702;
        public static final int MEDIA_INFO_BUFFERING_PERCENTAGE = 790;
        public static final int MEDIA_INFO_BUFFERING_START = 701;
        public static final int MEDIA_INFO_EXTERNAL_METADATA_UPDATE = 803;
        public static final int MEDIA_INFO_HAVE_VIDEO_DATA = 752;
        public static final int MEDIA_INFO_METADATA_UPDATE = 802;
        public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
        public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
        public static final int MEDIA_INFO_NO_VIDEO_DATA = 751;
        public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
        public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
        public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
        public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
        public static final int ROTATE_ACTION_HASROTATE = 3;
        public static final int ROTATE_ACTION_NOTHING = 1;
        public static final int ROTATE_ACTION_SETDEGREE = 2;
        public static final int ROTATE_ACTION_UNKNOWN = 0;

        void onBufferingUpdate(float f5);

        void onPlayerCompleted();

        void onPlayerError(String str, int i5, int i6, Throwable th);

        void onPlayerExtra(int i5, Object obj);

        void onPlayerInfo(int i5, int i6);

        void onPlayerPaused();

        void onPlayerPlaying();

        void onPlayerPrepared(long j5, int i5, int i6, int i7, int i8);

        void onPlayerProgress(long j5);

        void onPlayerSeeked(long j5);

        void onPlayerSubtitle(String str);
    }

    public TbsMediaPlayer(n nVar) {
        this.f1964a = nVar;
    }

    public void audio(int i5) {
        this.f1964a.b(i5);
    }

    public void close() {
        this.f1964a.e();
    }

    public float getVolume() {
        return this.f1964a.b();
    }

    public boolean isAvailable() {
        return this.f1964a.a();
    }

    public void pause() {
        this.f1964a.c();
    }

    public void play() {
        this.f1964a.d();
    }

    public void seek(long j5) {
        this.f1964a.a(j5);
    }

    public void setPlayerListener(TbsMediaPlayerListener tbsMediaPlayerListener) {
        this.f1964a.a(tbsMediaPlayerListener);
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        this.f1964a.a(surfaceTexture);
    }

    public void setVolume(float f5) {
        this.f1964a.a(f5);
    }

    public void startPlay(String str, Bundle bundle) {
        this.f1964a.a(str, bundle);
    }

    public void subtitle(int i5) {
        this.f1964a.a(i5);
    }
}
