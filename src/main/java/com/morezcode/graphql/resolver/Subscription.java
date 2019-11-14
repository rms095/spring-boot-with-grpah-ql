package com.morezcode.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.morezcode.graphql.model.StockPriceUpdate;
import com.morezcode.graphql.publisher.StockTickerPublisher;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class Subscription implements GraphQLSubscriptionResolver {

    private StockTickerPublisher stockTickerPublisher;

    Subscription(StockTickerPublisher stockTickerPublisher) {
        this.stockTickerPublisher = stockTickerPublisher;
    }

    Publisher<StockPriceUpdate> stockQuotes(List<String> stockCodes) {
        return null;// stockTickerPublisher.getPublisher(stockCodes);
    }

}
