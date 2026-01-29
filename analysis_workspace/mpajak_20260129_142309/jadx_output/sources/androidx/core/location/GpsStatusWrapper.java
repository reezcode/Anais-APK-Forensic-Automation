package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes8.dex */
class GpsStatusWrapper extends GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;

    @GuardedBy("mWrapped")
    private Iterator<GpsSatellite> mCachedIterator;

    @GuardedBy("mWrapped")
    private int mCachedIteratorPosition;

    @GuardedBy("mWrapped")
    private GpsSatellite mCachedSatellite;

    @GuardedBy("mWrapped")
    private int mCachedSatelliteCount;
    private final GpsStatus mWrapped;

    public GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mWrapped = gpsStatus2;
        this.mCachedSatelliteCount = -1;
        this.mCachedIterator = gpsStatus2.getSatellites().iterator();
        this.mCachedIteratorPosition = -1;
        this.mCachedSatellite = null;
    }

    private static int getConstellationFromPrn(int i5) {
        if (i5 > 0 && i5 <= 32) {
            return 1;
        }
        if (i5 >= 33 && i5 <= 64) {
            return 2;
        }
        if (i5 > 64 && i5 <= 88) {
            return 3;
        }
        if (i5 <= 200 || i5 > 235) {
            return (i5 < QZSS_SVID_MIN || i5 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite getSatellite(int i5) {
        GpsSatellite gpsSatellite;
        synchronized (this.mWrapped) {
            if (i5 < this.mCachedIteratorPosition) {
                this.mCachedIterator = this.mWrapped.getSatellites().iterator();
                this.mCachedIteratorPosition = -1;
            }
            while (true) {
                int i6 = this.mCachedIteratorPosition;
                if (i6 >= i5) {
                    break;
                }
                this.mCachedIteratorPosition = i6 + 1;
                if (!this.mCachedIterator.hasNext()) {
                    this.mCachedSatellite = null;
                    break;
                }
                this.mCachedSatellite = this.mCachedIterator.next();
            }
            gpsSatellite = this.mCachedSatellite;
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i5) {
        int constellationFromPrn = getConstellationFromPrn(i5);
        return constellationFromPrn != 2 ? constellationFromPrn != 3 ? constellationFromPrn != 5 ? i5 : i5 - 200 : i5 - 64 : i5 + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GpsStatusWrapper) {
            return this.mWrapped.equals(((GpsStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i5) {
        return getSatellite(i5).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i5) {
        return getSatellite(i5).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i5) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return getConstellationFromPrn(getSatellite(i5).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i5) {
        return getSatellite(i5).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i5;
        synchronized (this.mWrapped) {
            if (this.mCachedSatelliteCount == -1) {
                for (GpsSatellite gpsSatellite : this.mWrapped.getSatellites()) {
                    this.mCachedSatelliteCount++;
                }
                this.mCachedSatelliteCount++;
            }
            i5 = this.mCachedSatelliteCount;
        }
        return i5;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i5) {
        int i6 = Build.VERSION.SDK_INT;
        int prn = getSatellite(i5).getPrn();
        return i6 < 24 ? prn : getSvidFromPrn(prn);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i5) {
        return getSatellite(i5).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i5) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i5) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i5) {
        return getSatellite(i5).hasEphemeris();
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i5) {
        return getSatellite(i5).usedInFix();
    }
}
