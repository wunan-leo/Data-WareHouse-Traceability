package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * class description
 *
 * @author : loey
 * @className : TMovieWithoutRemovingTvAsinEntity
 * @since : 2021-12-10 21:40
 **/
@Entity
@Table(name = "t_movie_without_removing_TV_asin", schema = "data_warehouse", catalog = "")
public class TMovieWithoutRemovingTvAsinEntity {
    private String asin;

    @Id
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

        TMovieWithoutRemovingTvAsinEntity that = (TMovieWithoutRemovingTvAsinEntity) o;

        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return asin != null ? asin.hashCode() : 0;
    }
}