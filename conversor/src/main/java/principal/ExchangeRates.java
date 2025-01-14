package principal;

import java.util.Map;

/**
 * Class representing currency exchange rates.
 */
public class ExchangeRates {
    /**
     * Date of the exchange rates.
     */
    String date;

    /**
     * Map containing exchange rates relative to the US dollar (USD).
     */
    Map<String, Double> usd;
}