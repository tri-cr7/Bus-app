package com.busapp.buss_api.dto;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperatorResponse {
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String description;
    private String logoUrl;
    private String amenities;
    private String cancellationPolicy;
    private Float avgRating;
    private Integer totalReviews;
    private Boolean isActive;
    private List<OperatorRouteResponse> routes;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class OperatorRouteResponse {
        private Integer routeId;
        private String departure;
        private String destination;
        private Float durationHours;
    }
}
