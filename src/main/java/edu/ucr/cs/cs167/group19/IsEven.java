package edu.ucr.cs.cs167.group19;

import java.util.function.Function;

public class IsEven implements Function<Integer, Boolean> {
    @Override
    public Boolean apply(Integer x) {
        return x % 2 == 0;
    }
}
