package com.dotohtwo.models.model;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@PrimaryKeyClass
public class ReviewByProductKey implements Serializable {

    @PrimaryKeyColumn(name = "product_id", type = PrimaryKeyType.PARTITIONED)
    private UUID productId;

    @PrimaryKeyColumn(name = "created_at", type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private Instant createdAt;

    @PrimaryKeyColumn(name = "review_id", type = PrimaryKeyType.CLUSTERED, ordering = Ordering.ASCENDING)
    private UUID reviewId;

    public ReviewByProductKey() {}

    public ReviewByProductKey(UUID productId, Instant createdAt, UUID reviewId) {
        this.productId = productId;
        this.createdAt = createdAt;
        this.reviewId = reviewId;
    }

    public UUID getProductId() { return productId; }
    public void setProductId(UUID productId) { this.productId = productId; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public UUID getReviewId() { return reviewId; }
    public void setReviewId(UUID reviewId) { this.reviewId = reviewId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReviewByProductKey that)) return false;
        return Objects.equals(productId, that.productId)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(reviewId, that.reviewId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, createdAt, reviewId);
    }
}
