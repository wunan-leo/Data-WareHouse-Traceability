package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.*;

/**
 * class description
 *
 * @author : loey
 * @className : VTvAsinEntity
 * @since : 2021-12-11 18:52
 **/
@Entity
@Table(name = "v_TV_asin", schema = "data_warehouse", catalog = "")
public class VTvAsinEntity {

    @Id
    private String asin;

    @Basic
    @Column(name = "asin", nullable = false, length = 20)
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTvAsinEntity that = (VTvAsinEntity) o;

        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return asin != null ? asin.hashCode() : 0;
    }
}