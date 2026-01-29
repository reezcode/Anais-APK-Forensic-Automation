package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOIndexedException;

/* loaded from: classes10.dex */
public class FilterCollectionWriter extends Writer {
    public final Collection<Writer> EMPTY_WRITERS;
    public final Collection<Writer> writers;

    public FilterCollectionWriter(Collection<Writer> collection) {
        List emptyList = Collections.emptyList();
        this.EMPTY_WRITERS = emptyList;
        this.writers = collection == null ? emptyList : collection;
    }

    public FilterCollectionWriter(Writer... writerArr) {
        List emptyList = Collections.emptyList();
        this.EMPTY_WRITERS = emptyList;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : emptyList;
    }

    private List<Exception> add(List<Exception> list, int i5, IOException iOException) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new IOIndexedException(i5, iOException));
        return list;
    }

    private boolean notEmpty(List<Exception> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(c5);
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence);
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        List<Exception> list = null;
        int i7 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence, i5, i6);
                } catch (IOException e5) {
                    list = add(list, i7, e5);
                }
            }
            i7++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("append", list);
        }
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("close", list);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("flush", list);
        }
    }

    @Override // java.io.Writer
    public void write(int i5) {
        List<Exception> list = null;
        int i6 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(i5);
                } catch (IOException e5) {
                    list = add(list, i6, e5);
                }
            }
            i6++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer
    public void write(String str) {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str);
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) {
        List<Exception> list = null;
        int i7 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str, i5, i6);
                } catch (IOException e5) {
                    list = add(list, i7, e5);
                }
            }
            i7++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        List<Exception> list = null;
        int i5 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr);
                } catch (IOException e5) {
                    list = add(list, i5, e5);
                }
            }
            i5++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        List<Exception> list = null;
        int i7 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr, i5, i6);
                } catch (IOException e5) {
                    list = add(list, i7, e5);
                }
            }
            i7++;
        }
        if (notEmpty(list)) {
            throw new IOExceptionList("write", list);
        }
    }
}
