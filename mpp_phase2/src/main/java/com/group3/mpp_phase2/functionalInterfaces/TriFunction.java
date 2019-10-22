package com.group3.mpp_phase2.functionalInterfaces;

@FunctionalInterface
public interface TriFunction<S,T,R,U>{
	U apply(S s, T t, R r);
}
