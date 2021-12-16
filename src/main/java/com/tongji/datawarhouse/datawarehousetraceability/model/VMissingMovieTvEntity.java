package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.*;

/**
 * class description
 *
 * @author : loey
 * @className : VMissingMovieTvEntity
 * @since : 2021-12-11 16:10
 **/
@Entity
@Table(name = "v_missing_movie_TV", schema = "data_warehouse", catalog = "")
public class VMissingMovieTvEntity {
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

        VMissingMovieTvEntity that = (VMissingMovieTvEntity) o;

        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return asin != null ? asin.hashCode() : 0;
    }
}