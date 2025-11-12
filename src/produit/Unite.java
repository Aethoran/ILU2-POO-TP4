package produit;

public enum Unite {
    KILOGRAMME("kg"),
    GRAMME("g"),
    LITRE("l"),
    MILLILITRE("ml"),
    CENTILITRE("cl"),
    PIECE("a la piece");

    private final String symbole;

    private Unite(String symbole) {
        this.symbole = symbole;
    }

    public String getSymbole() {
        return symbole;
    }

    @Override
    public String toString() {
        return symbole;
    }

}
