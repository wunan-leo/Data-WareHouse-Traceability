package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * class description
 *
 * @author : loey
 * @className : TConsolidationMovieEntity
 * @since : 2021-12-10 21:39
 **/
@Entity
@Table(name = "t_consolidation_movie", schema = "data_warehouse", catalog = "")
public class TConsolidationMovieEntity {
    private String asin;
    private String movieTitle;
    private String movieEdition;
    private String movieFormat;
    private Double movieScore;
    private String director;
    private String mainActor;
    private String actor;
    private String movieCategory;
    private Date movieReleaseDate;
    private Integer commentNum;
    private String dbRaringScore;
    private Integer asinCount;

    @Id
    @Column(name = "asin", nullable = false, length = 20)
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Basic
    @Column(name = "movie_title", nullable = true, length = 512)
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Basic
    @Column(name = "movie_edition", nullable = true, length = 255)
    public String getMovieEdition() {
        return movieEdition;
    }

    public void setMovieEdition(String movieEdition) {
        this.movieEdition = movieEdition;
    }

    @Basic
    @Column(name = "movie_format", nullable = true, length = 255)
    public String getMovieFormat() {
        return movieFormat;
    }

    public void setMovieFormat(String movieFormat) {
        this.movieFormat = movieFormat;
    }

    @Basic
    @Column(name = "movie_score", nullable = true, precision = 0)
    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }

    @Basic
    @Column(name = "director", nullable = true, length = 512)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @Column(name = "main_actor", nullable = true, length = 512)
    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    @Basic
    @Column(name = "actor", nullable = true, length = 512)
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Basic
    @Column(name = "movie_category", nullable = true, length = 255)
    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    @Basic
    @Column(name = "movie_release_date", nullable = true)
    public Date getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(Date movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    @Basic
    @Column(name = "comment_num", nullable = true)
    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    @Basic
    @Column(name = "db_raring_score", nullable = true, length = 255)
    public String getDbRaringScore() {
        return dbRaringScore;
    }

    public void setDbRaringScore(String dbRaringScore) {
        this.dbRaringScore = dbRaringScore;
    }

    @Basic
    @Column(name = "asin_count", nullable = true)
    public Integer getAsinCount() {
        return asinCount;
    }

    public void setAsinCount(Integer asinCount) {
        this.asinCount = asinCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TConsolidationMovieEntity that = (TConsolidationMovieEntity) o;

        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;
        if (movieTitle != null ? !movieTitle.equals(that.movieTitle) : that.movieTitle != null) return false;
        if (movieEdition != null ? !movieEdition.equals(that.movieEdition) : that.movieEdition != null) return false;
        if (movieFormat != null ? !movieFormat.equals(that.movieFormat) : that.movieFormat != null) return false;
        if (movieScore != null ? !movieScore.equals(that.movieScore) : that.movieScore != null) return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (mainActor != null ? !mainActor.equals(that.mainActor) : that.mainActor != null) return false;
        if (actor != null ? !actor.equals(that.actor) : that.actor != null) return false;
        if (movieCategory != null ? !movieCategory.equals(that.movieCategory) : that.movieCategory != null)
            return false;
        if (movieReleaseDate != null ? !movieReleaseDate.equals(that.movieReleaseDate) : that.movieReleaseDate != null)
            return false;
        if (commentNum != null ? !commentNum.equals(that.commentNum) : that.commentNum != null) return false;
        if (dbRaringScore != null ? !dbRaringScore.equals(that.dbRaringScore) : that.dbRaringScore != null)
            return false;
        if (asinCount != null ? !asinCount.equals(that.asinCount) : that.asinCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asin != null ? asin.hashCode() : 0;
        result = 31 * result + (movieTitle != null ? movieTitle.hashCode() : 0);
        result = 31 * result + (movieEdition != null ? movieEdition.hashCode() : 0);
        result = 31 * result + (movieFormat != null ? movieFormat.hashCode() : 0);
        result = 31 * result + (movieScore != null ? movieScore.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (mainActor != null ? mainActor.hashCode() : 0);
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        result = 31 * result + (movieCategory != null ? movieCategory.hashCode() : 0);
        result = 31 * result + (movieReleaseDate != null ? movieReleaseDate.hashCode() : 0);
        result = 31 * result + (commentNum != null ? commentNum.hashCode() : 0);
        result = 31 * result + (dbRaringScore != null ? dbRaringScore.hashCode() : 0);
        result = 31 * result + (asinCount != null ? asinCount.hashCode() : 0);
        return result;
    }
}