package enums;

import lombok.Getter;

@Getter

public enum PaymentMethod {
    CREDIT_CARD("Credit Card"),
    DEBIT_CARD("Debit Card"),
    APPLE_PAY("Apple Pay"),
    GOOGLE_PAY("Google Pay"),
    PAYPAL("PayPal"),
    CRYPTOCURRENCY("Cryptocurrency"),
    QR_CODE_PAYMENT("QR Code Payment"),
    BUY_NOW_PAY_LATER("Buy Now, Pay Later"),
    CASH("Cash");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
