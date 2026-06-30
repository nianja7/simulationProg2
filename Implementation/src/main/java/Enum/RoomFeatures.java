package model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RoomFeatures {
    SINGLE_BED("Single Bed"),
    DOUBLE_BED("Double Bed"),
    KING_SIZE_BED("King Size Bed"),
    ITALIAN_SHOWER("Italian Shower"),
    BATHTUB("Bathtub"),
    FOUR_K_TELEVISION("4K Television"),
    MINI_BAR("Mini Bar"),
    AIR_CONDITIONING("Air Conditioning"),
    SAFE_BOX("Safe Box"),
    BALCONY("Balcony");

    private final String label;
}