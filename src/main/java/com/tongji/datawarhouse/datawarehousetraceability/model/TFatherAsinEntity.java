package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.*;

/**
 * class description
 *
 * @author : loey
 * @className : TFatherAsinEntity
 * @since : 2021-12-10 21:40
 **/
@Entity
@Table(name = "t_father_asin", schema = "data_warehouse", catalog = "")
public class TFatherAsinEntity {
    private String asin;
    private String fatherAsin;

    @Id
    @Column(name = "asin", nullable = false, length = 20)
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Basic
    @Column(name = "father_asin", nullable = true, length = 20)
    public String getFatherAsin() {
        return fatherAsin;
    }

    public void setFatherAsin(String fatherAsin) {
        this.fatherAsin = fatherAsin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFatherAsinEntity that = (TFatherAsinEntity) o;

        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;
        if (fatherAsin != null ? !fatherAsin.equals(that.fatherAsin) : that.fatherAsin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asin != null ? asin.hashCode() : 0;
        result = 31 * result + (fatherAsin != null ? fatherAsin.hashCode() : 0);
        return result;
    }
}