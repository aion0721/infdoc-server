package com.example.infdocserver;

import java.math.BigInteger;
import javax.servlet.*;

import net.jcip.annotations.*;

/**
 * UnsafeCountingFactorizer
 *
 * Servlet that counts requests without the necessary synchronization
 *
 * @author Brian Goetz and Tim Peierls
 */
@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (instance == null)
            instance = new ExpensiveObject();
        return instance;
    }
}

class ExpensiveObject {
}
