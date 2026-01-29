package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

@Dao
/* loaded from: classes15.dex */
public interface WorkTagDao {

    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static void insertTags(WorkTagDao workTagDao, String id, Set<String> tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new WorkTag((String) it.next(), id));
            }
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> getTagsForWorkSpecId(String str);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> getWorkSpecIdsWithTag(String str);

    @Insert(onConflict = 5)
    void insert(WorkTag workTag);

    void insertTags(String str, Set<String> set);
}
