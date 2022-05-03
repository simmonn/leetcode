package com.leetcode.num;

/**
 * TODO .
 *
 * @author simmon
 * @since 2022/5/4
 */
public class FibNum {

    public int fib(int n) {
        if (n == 0 || n==1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);

    }

}
