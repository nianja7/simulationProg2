package mg.hotel.enums;

public enum FournitureDeChambre {
    LIT_SIMPLE("Lit simple"),
    LIT_DOUBLE("Lit double"),
    LIT_KING_SIZE("Lit king size"),
    DOUCHE_ITALIENNE("Douche italienne"),
    BAIGNOIRE("Baignoire"),
    TELEVISION_4K("Television 4K"),
    MINI_BAR("Mini bar"),
    CLIMATISATION("Climatisation"),
    COFFRE_FORT("Coffre fort"),
    BALCON("Balcon");

    private final String libelle;

    FournitureDeChambre(String libelle) {
        this.libelle = libelle;
    }
}
