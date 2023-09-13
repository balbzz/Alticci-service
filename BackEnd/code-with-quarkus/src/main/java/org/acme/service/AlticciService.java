package org.acme.service;

import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

    //@CacheResult(cacheName = "alticci-cache")
    public long calculateAlticci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a nonnegative integer.");
        }
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        return calculateAlticci(n - 3) + calculateAlticci(n - 2);
    }

}
