package com.dotohtwo.models.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("reviews_by_product")
public class ReviewByProduct {

    @PrimaryKey
    private ReviewByProductKey key;

    @Column("author_id")
    private String authorId;

    @Column("rating")
    private int rating;

    @Column("content")
    private String content;

    public ReviewByProductKey getKey() { return key; }
    public void setKey(ReviewByProductKey key) { this.key = key; }

    public String getAuthorId() { return authorId; }
    public void setAuthorId(String authorId) { this.authorId = authorId; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
