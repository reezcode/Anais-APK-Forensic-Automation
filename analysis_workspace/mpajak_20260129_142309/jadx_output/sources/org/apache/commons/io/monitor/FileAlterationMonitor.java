package org.apache.commons.io.monitor;

import androidx.work.WorkRequest;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes24.dex */
public final class FileAlterationMonitor implements Runnable {
    private static final FileAlterationObserver[] EMPTY_ARRAY = new FileAlterationObserver[0];
    private final long interval;
    private final List<FileAlterationObserver> observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor() {
        this(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public FileAlterationMonitor(long j5) {
        this.observers = new CopyOnWriteArrayList();
        this.interval = j5;
    }

    public FileAlterationMonitor(long j5, Collection<FileAlterationObserver> collection) {
        this(j5, (FileAlterationObserver[]) ((Collection) Optional.ofNullable(collection).orElse(Collections.emptyList())).toArray(EMPTY_ARRAY));
    }

    public FileAlterationMonitor(long j5, FileAlterationObserver... fileAlterationObserverArr) {
        this(j5);
        if (fileAlterationObserverArr != null) {
            for (FileAlterationObserver fileAlterationObserver : fileAlterationObserverArr) {
                addObserver(fileAlterationObserver);
            }
        }
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.observers.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.interval;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return this.observers;
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            while (this.observers.remove(fileAlterationObserver)) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.running) {
            Iterator<FileAlterationObserver> it = this.observers.iterator();
            while (it.hasNext()) {
                it.next().checkAndNotify();
            }
            if (!this.running) {
                return;
            } else {
                try {
                    Thread.sleep(this.interval);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
    }

    public synchronized void start() {
        if (this.running) {
            throw new IllegalStateException("Monitor is already running");
        }
        Iterator<FileAlterationObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().initialize();
        }
        this.running = true;
        ThreadFactory threadFactory = this.threadFactory;
        this.thread = threadFactory != null ? threadFactory.newThread(this) : new Thread(this);
        this.thread.start();
    }

    public synchronized void stop() {
        stop(this.interval);
    }

    public synchronized void stop(long j5) {
        if (!this.running) {
            throw new IllegalStateException("Monitor is not running");
        }
        this.running = false;
        try {
            this.thread.interrupt();
            this.thread.join(j5);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<FileAlterationObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }
}
