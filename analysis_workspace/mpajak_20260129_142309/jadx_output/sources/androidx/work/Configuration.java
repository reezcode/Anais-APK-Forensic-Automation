package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.activity.d;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class Configuration {

    @SuppressLint({"MinMaxConstant"})
    public static final int MIN_SCHEDULER_LIMIT = 20;

    @Nullable
    public final String mDefaultProcessName;

    @Nullable
    public final Consumer<Throwable> mExceptionHandler;

    @NonNull
    public final Executor mExecutor;

    @NonNull
    public final InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    public final int mLoggingLevel;
    public final int mMaxJobSchedulerId;
    public final int mMaxSchedulerLimit;
    public final int mMinJobSchedulerId;

    @NonNull
    public final RunnableScheduler mRunnableScheduler;

    @Nullable
    public final Consumer<Throwable> mSchedulingExceptionHandler;

    @NonNull
    public final Executor mTaskExecutor;

    @NonNull
    public final WorkerFactory mWorkerFactory;

    /* loaded from: classes6.dex */
    public static final class Builder {

        @Nullable
        public String mDefaultProcessName;

        @Nullable
        public Consumer<Throwable> mExceptionHandler;
        public Executor mExecutor;
        public InputMergerFactory mInputMergerFactory;
        public int mLoggingLevel;
        public int mMaxJobSchedulerId;
        public int mMaxSchedulerLimit;
        public int mMinJobSchedulerId;
        public RunnableScheduler mRunnableScheduler;

        @Nullable
        public Consumer<Throwable> mSchedulingExceptionHandler;
        public Executor mTaskExecutor;
        public WorkerFactory mWorkerFactory;

        public Builder() {
            this.mLoggingLevel = 4;
            this.mMinJobSchedulerId = 0;
            this.mMaxJobSchedulerId = Integer.MAX_VALUE;
            this.mMaxSchedulerLimit = 20;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NonNull Configuration configuration) {
            this.mExecutor = configuration.mExecutor;
            this.mWorkerFactory = configuration.mWorkerFactory;
            this.mInputMergerFactory = configuration.mInputMergerFactory;
            this.mTaskExecutor = configuration.mTaskExecutor;
            this.mLoggingLevel = configuration.mLoggingLevel;
            this.mMinJobSchedulerId = configuration.mMinJobSchedulerId;
            this.mMaxJobSchedulerId = configuration.mMaxJobSchedulerId;
            this.mMaxSchedulerLimit = configuration.mMaxSchedulerLimit;
            this.mRunnableScheduler = configuration.mRunnableScheduler;
            this.mExceptionHandler = configuration.mExceptionHandler;
            this.mSchedulingExceptionHandler = configuration.mSchedulingExceptionHandler;
            this.mDefaultProcessName = configuration.mDefaultProcessName;
        }

        @NonNull
        public Configuration build() {
            return new Configuration(this);
        }

        @NonNull
        public Builder setDefaultProcessName(@NonNull String str) {
            this.mDefaultProcessName = str;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        @NonNull
        public Builder setInitializationExceptionHandler(@NonNull Consumer<Throwable> consumer) {
            this.mExceptionHandler = consumer;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setInitializationExceptionHandler(@NonNull final InitializationExceptionHandler initializationExceptionHandler) {
            Objects.requireNonNull(initializationExceptionHandler);
            this.mExceptionHandler = new Consumer() { // from class: androidx.work.a
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    InitializationExceptionHandler.this.handleException((Throwable) obj);
                }
            };
            return this;
        }

        @NonNull
        public Builder setInputMergerFactory(@NonNull InputMergerFactory inputMergerFactory) {
            this.mInputMergerFactory = inputMergerFactory;
            return this;
        }

        @NonNull
        public Builder setJobSchedulerJobIdRange(int i5, int i6) {
            if (i6 - i5 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.mMinJobSchedulerId = i5;
            this.mMaxJobSchedulerId = i6;
            return this;
        }

        @NonNull
        public Builder setMaxSchedulerLimit(int i5) {
            if (i5 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.mMaxSchedulerLimit = Math.min(i5, 50);
            return this;
        }

        @NonNull
        public Builder setMinimumLoggingLevel(int i5) {
            this.mLoggingLevel = i5;
            return this;
        }

        @NonNull
        public Builder setRunnableScheduler(@NonNull RunnableScheduler runnableScheduler) {
            this.mRunnableScheduler = runnableScheduler;
            return this;
        }

        @NonNull
        public Builder setSchedulingExceptionHandler(@NonNull Consumer<Throwable> consumer) {
            this.mSchedulingExceptionHandler = consumer;
            return this;
        }

        @NonNull
        public Builder setTaskExecutor(@NonNull Executor executor) {
            this.mTaskExecutor = executor;
            return this;
        }

        @NonNull
        public Builder setWorkerFactory(@NonNull WorkerFactory workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }
    }

    /* loaded from: classes12.dex */
    public interface Provider {
        @NonNull
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(@NonNull Builder builder) {
        Executor executor = builder.mExecutor;
        this.mExecutor = executor == null ? createDefaultExecutor(false) : executor;
        Executor executor2 = builder.mTaskExecutor;
        if (executor2 == null) {
            this.mIsUsingDefaultTaskExecutor = true;
            executor2 = createDefaultExecutor(true);
        } else {
            this.mIsUsingDefaultTaskExecutor = false;
        }
        this.mTaskExecutor = executor2;
        WorkerFactory workerFactory = builder.mWorkerFactory;
        this.mWorkerFactory = workerFactory == null ? WorkerFactory.getDefaultWorkerFactory() : workerFactory;
        InputMergerFactory inputMergerFactory = builder.mInputMergerFactory;
        this.mInputMergerFactory = inputMergerFactory == null ? InputMergerFactory.getDefaultInputMergerFactory() : inputMergerFactory;
        RunnableScheduler runnableScheduler = builder.mRunnableScheduler;
        this.mRunnableScheduler = runnableScheduler == null ? new DefaultRunnableScheduler() : runnableScheduler;
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
        this.mExceptionHandler = builder.mExceptionHandler;
        this.mSchedulingExceptionHandler = builder.mSchedulingExceptionHandler;
        this.mDefaultProcessName = builder.mDefaultProcessName;
    }

    @NonNull
    private Executor createDefaultExecutor(boolean z4) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(z4));
    }

    @NonNull
    private ThreadFactory createDefaultThreadFactory(final boolean z4) {
        return new ThreadFactory() { // from class: androidx.work.Configuration.1
            private final AtomicInteger mThreadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                StringBuilder g5 = d.g(z4 ? "WM.task-" : "androidx.work-");
                g5.append(this.mThreadCount.incrementAndGet());
                return new Thread(runnable, g5.toString());
            }
        };
    }

    @Nullable
    public String getDefaultProcessName() {
        return this.mDefaultProcessName;
    }

    @NonNull
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @Nullable
    public Consumer<Throwable> getInitializationExceptionHandler() {
        return this.mExceptionHandler;
    }

    @NonNull
    public InputMergerFactory getInputMergerFactory() {
        return this.mInputMergerFactory;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxSchedulerLimit() {
        return Build.VERSION.SDK_INT == 23 ? this.mMaxSchedulerLimit / 2 : this.mMaxSchedulerLimit;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    @NonNull
    public RunnableScheduler getRunnableScheduler() {
        return this.mRunnableScheduler;
    }

    @Nullable
    public Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.mSchedulingExceptionHandler;
    }

    @NonNull
    public Executor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    @NonNull
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUsingDefaultTaskExecutor() {
        return this.mIsUsingDefaultTaskExecutor;
    }
}
