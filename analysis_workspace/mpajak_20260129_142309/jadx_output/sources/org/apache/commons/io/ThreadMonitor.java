package org.apache.commons.io;

import java.time.Duration;

/* loaded from: classes10.dex */
class ThreadMonitor implements Runnable {
    private final Thread thread;
    private final Duration timeout;

    private ThreadMonitor(Thread thread, Duration duration) {
        this.thread = thread;
        this.timeout = duration;
    }

    private static void sleep(Duration duration) {
        long millis = duration.toMillis();
        long currentTimeMillis = System.currentTimeMillis() + millis;
        do {
            Thread.sleep(millis);
            millis = currentTimeMillis - System.currentTimeMillis();
        } while (millis > 0);
    }

    public static Thread start(Thread thread, Duration duration) {
        if (duration.isZero() || duration.isNegative()) {
            return null;
        }
        Thread thread2 = new Thread(new ThreadMonitor(thread, duration), "ThreadMonitor");
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static Thread start(Duration duration) {
        return start(Thread.currentThread(), duration);
    }

    public static void stop(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
