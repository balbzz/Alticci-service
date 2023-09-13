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
//            throw new IllegalArgumentException("n must be a nonnegative integer.");
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
            throw new IllegalArgumentException("n must be a nonnegative integer.");
        }

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

        // Cache the result
        cache.put(n, result);

        return result;
    }
//
//    private final Map<Integer, BigInteger> cache = new LinkedHashMap<Integer, BigInteger>(1000, 0.75f, true) {
//        protected boolean removeEldestEntry(Map.Entry<Integer, BigInteger> eldest) {
//            return size() > MAX_CACHE_SIZE;
//        }
//    };
//
//    private final int MAX_CACHE_SIZE = 1000; // Tamanho máximo do cache
//
//
//    public BigInteger calculateAlticci(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("n must be a nonnegative integer.");
//        }
//
//        // Verificar se o valor está no cache
//        if (cache.containsKey(n)) {
//            return cache.get(n);
//        }
//
//        BigInteger result;
//
//        if (n == 0) {
//            result = BigInteger.ZERO;
//        } else if (n == 1 || n == 2) {
//            result = BigInteger.ONE;
//        } else {
//            // Chamar o cálculo real da sequência de Alticci
//            result = calculateAlticciInternal(n);
//        }
//
//        // Colocar o resultado no cache
//        cache.put(n, result);
//
//        return result;
//    }
//
//    private BigInteger calculateAlticciInternal(int n) {
//        BigInteger a = BigInteger.ZERO;
//        BigInteger b = BigInteger.ONE;
//        BigInteger c = BigInteger.ONE;
//
//        for (int i = 3; i <= n; i++) {
//            BigInteger temp = a;
//            a = b;
//            b = c;
//            c = temp.add(b);
//        }
//
//        return c;
//    }




            }
