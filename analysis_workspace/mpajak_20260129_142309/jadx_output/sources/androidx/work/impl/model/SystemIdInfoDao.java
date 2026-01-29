package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@Dao
/* loaded from: classes18.dex */
public interface SystemIdInfoDao {

    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return systemIdInfoDao.getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
        }

        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
            Intrinsics.checkNotNullParameter(id, "id");
            systemIdInfoDao.removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
        }
    }

    SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId);

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    SystemIdInfo getSystemIdInfo(String str, int i5);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(WorkGenerationalId workGenerationalId);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(String str);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(String str, int i5);
}
