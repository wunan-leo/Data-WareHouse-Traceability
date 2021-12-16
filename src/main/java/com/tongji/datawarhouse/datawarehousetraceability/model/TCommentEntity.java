package
        com.tongji.datawarhouse.datawarehousetraceability.model;

import javax.persistence.*;

/**
 * class description
 *
 * @author : loey
 * @className : TCommentEntity
 * @since : 2021-12-11 20:30
 **/
@Entity
@Table(name = "t_comment", schema = "data_warehouse", catalog = "")
public class TCommentEntity {
    private String verified;
    private Double overall;
    private String reviewTime;
    private String reviewerId;
    private String asin;
    private String reviewText;
    private String style;
    private String reviewerName;
    private String summary;
    private String unixReviewTime;
    private String vote;
    private String image;
    private int commentId;

    @Basic
    @Column(name = "verified", nullable = true, length = 10)
    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    @Basic
    @Column(name = "overall", nullable = true, precision = 0)
    public Double getOverall() {
        return overall;
    }

    public void setOverall(Double overall) {
        this.overall = overall;
    }

    @Basic
    @Column(name = "review_time", nullable = true, length = 100)
    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Basic
    @Column(name = "reviewer_id", nullable = true, length = 50)
    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    @Basic
    @Column(name = "asin", nullable = true, length = 20)
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Basic
    @Column(name = "review_text", nullable = true, length = -1)
    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Basic
    @Column(name = "style", nullable = true, length = 1000)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Basic
    @Column(name = "reviewer_name", nullable = true, length = 1000)
    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 1000)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "unix_review_time", nullable = true, length = 50)
    public String getUnixReviewTime() {
        return unixReviewTime;
    }

    public void setUnixReviewTime(String unixReviewTime) {
        this.unixReviewTime = unixReviewTime;
    }

    @Basic
    @Column(name = "vote", nullable = true, length = 100)
    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    @Basic
    @Column(name = "image", nullable = true, length = -1)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Id
    @Column(name = "comment_id", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCommentEntity that = (TCommentEntity) o;

        if (commentId != that.commentId) return false;
        if (verified != null ? !verified.equals(that.verified) : that.verified != null) return false;
        if (overall != null ? !overall.equals(that.overall) : that.overall != null) return false;
        if (reviewTime != null ? !reviewTime.equals(that.reviewTime) : that.reviewTime != null) return false;
        if (reviewerId != null ? !reviewerId.equals(that.reviewerId) : that.reviewerId != null) return false;
        if (asin != null ? !asin.equals(that.asin) : that.asin != null) return false;
        if (reviewText != null ? !reviewText.equals(that.reviewText) : that.reviewText != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;
        if (reviewerName != null ? !reviewerName.equals(that.reviewerName) : that.reviewerName != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (unixReviewTime != null ? !unixReviewTime.equals(that.unixReviewTime) : that.unixReviewTime != null)
            return false;
        if (vote != null ? !vote.equals(that.vote) : that.vote != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verified != null ? verified.hashCode() : 0;
        result = 31 * result + (overall != null ? overall.hashCode() : 0);
        result = 31 * result + (reviewTime != null ? reviewTime.hashCode() : 0);
        result = 31 * result + (reviewerId != null ? reviewerId.hashCode() : 0);
        result = 31 * result + (asin != null ? asin.hashCode() : 0);
        result = 31 * result + (reviewText != null ? reviewText.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (reviewerName != null ? reviewerName.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (unixReviewTime != null ? unixReviewTime.hashCode() : 0);
        result = 31 * result + (vote != null ? vote.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + commentId;
        return result;
    }
}