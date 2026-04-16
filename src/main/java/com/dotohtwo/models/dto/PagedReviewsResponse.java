package com.dotohtwo.models.dto;

import com.dotohtwo.models.model.ReviewByAuthor;

import java.util.List;

public record PagedReviewsResponse(
        List<ReviewByAuthor> reviews,
        String nextPageToken
) {}
