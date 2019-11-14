package com.morezcode.graphql.publisher;

import org.springframework.stereotype.Component;

@Component
public class StockTickerPublisher {

//    private static final Logger LOG = LoggerFactory.getLogger(StockTickerPublisher.class);
//
//    private final Observable<StockPriceUpdate> publisher;
//    private final static Map<String, BigDecimal> CURRENT_STOCK_PRICES = new ConcurrentHashMap<>();
//    private final static Random rand = new Random();
//
//    static {
//        CURRENT_STOCK_PRICES.put("TEAM", dollars(39, 64));
//        CURRENT_STOCK_PRICES.put("IBM", dollars(147, 10));
//        CURRENT_STOCK_PRICES.put("AMZN", dollars(1002, 94));
//        CURRENT_STOCK_PRICES.put("MSFT", dollars(77, 49));
//        CURRENT_STOCK_PRICES.put("GOOGL", dollars(1007, 87));
//    }
//
//    public StockTickerPublisher() {
//        Observable<StockPriceUpdate> stockPriceUpdateObservable = Observable.create(emitter -> {
//
//            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//            executorService.scheduleAtFixedRate(newStockTick(emitter), 0, 2, TimeUnit.SECONDS);
//
//        });
//
//        ConnectableObservable<StockPriceUpdate> connectableObservable = stockPriceUpdateObservable.share().publish();
//        connectableObservable.connect();
//
//        publisher = connectableObservable.toFlowable(BackpressureStrategy.BUFFER);
//    }
//
//    private Runnable newStockTick(ObservableEmitter<StockPriceUpdate> emitter) {
//        return () -> {
//            List<StockPriceUpdate> stockPriceUpdates = getUpdates(getRandomValue(0, 5));
//            if (stockPriceUpdates != null) {
//                emitStocks(emitter, stockPriceUpdates);
//            }
//        };
//    }
//
//    private void emitStocks(ObservableEmitter<StockPriceUpdate> emitter, List<StockPriceUpdate> stockPriceUpdates) {
//        for (StockPriceUpdate stockPriceUpdate : stockPriceUpdates) {
//            try {
//                emitter.onNext(stockPriceUpdate);
//            } catch (RuntimeException e) {
//                LOG.error("Cannot send StockUpdate", e);
//            }
//        }
//    }
//
//    public Flowable<StockPriceUpdate> getPublisher() {
//        return publisher;
//    }
//
//    public Flowable<StockPriceUpdate> getPublisher(List<String> stockCodes) {
//        if (stockCodes != null) {
//            return publisher.filter(stockPriceUpdate -> stockCodes.contains(stockPriceUpdate.getStockCode()));
//        }
//        return publisher;
//    }
//
//    private List<StockPriceUpdate> getUpdates(Integer number) {
//        List<StockPriceUpdate> updates = new ArrayList<>();
//        for (Integer i = 0; i < number; i++) {
//            updates.add(rollUpdate());
//        }
//        return updates;
//    }
//
//    private StockPriceUpdate rollUpdate() {
//        ArrayList<String> STOCK_CODES = new ArrayList<>(CURRENT_STOCK_PRICES.keySet());
//
//        String stockCode = STOCK_CODES.get(getRandomValue(0, STOCK_CODES.size() - 1));
//        BigDecimal currentPrice = CURRENT_STOCK_PRICES.get(stockCode);
//
//
//        BigDecimal incrementDollars = dollars(getRandomValue(0, 1), getRandomValue(0, 99));
//        if (getRandomValue(0, 10) > 7) {
//            // 0.3 of the time go down
//            incrementDollars = incrementDollars.negate();
//        }
//        BigDecimal newPrice = currentPrice.add(incrementDollars);
//
//        CURRENT_STOCK_PRICES.put(stockCode, newPrice);
//        return new StockPriceUpdate(stockCode, LocalDateTime.now(), newPrice, incrementDollars);
//    }
//
//    private static BigDecimal dollars(Integer dollars, Integer cents) {
//        return truncate("" + dollars + "." + cents);
//    }
//
//    private static BigDecimal truncate(final String text) {
//        BigDecimal bigDecimal = new BigDecimal(text);
//        if (bigDecimal.scale() > 2)
//            bigDecimal = new BigDecimal(text).setScale(2, RoundingMode.HALF_UP);
//        return bigDecimal.stripTrailingZeros();
//    }
//
//    private static Integer getRandomValue(Integer min, Integer max) {
//        return rand.nextInteger((max - min) + 1) + min;
//    }

}
