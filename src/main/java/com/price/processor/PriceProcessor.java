package com.price.processor;

/**
 * @author administrator
 * @since 4/23/21
 */
public interface PriceProcessor
{

    void onPrice(String ccyPair, double rate);

    /**
     * Subscribe for updates
     *
     * Called rarely during operation of PriceProcessor
     *
     * @param priceProcessor - can be up to 200 subscribers
     */
    void subscribe(PriceProcessor priceProcessor);

    /**
     * Unsubscribe from updates
     *
     * Called rarely during operation of PriceProcessor
     *
     * @param priceProcessor
     */
    void unsubscribe(PriceProcessor priceProcessor);
}
