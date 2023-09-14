package org.acme.service;

import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import com.github.benmanes.caffeine.cache.*;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class AlticciService {

    private final Map<Integer, Long> cache = new ConcurrentHashMap<>();

//    @CacheResult(cacheName = "alticci-cache") //max index = 157
//    public long calculateAlticci(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("n must be a integer >= 0.");
//        }
//        if (n <= 1) {
//            return n;
//        }
//        if (n == 2) {
//            return 1;
//        }
//        return calculateAlticci(n - 3) + calculateAlticci(n - 2);
//    }

    public long calculateAlticciAlternitive(int n){
        if (n < 0) {
            throw new IllegalArgumentException("n must be a integer >= 0.");
        }

        long startTime = System.currentTimeMillis();

        // Check if the result is already in the cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result;
        if (n <= 1) {
            result = n;
        } else if (n == 2) {
            result = 1;
        } else {
            result = calculateAlticciAlternitive(n - 3) + calculateAlticciAlternitive(n - 2);
        }

        cache.put(n, result);
        return result;
    }



            }
