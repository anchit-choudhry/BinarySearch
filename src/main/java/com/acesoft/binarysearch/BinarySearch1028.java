package com.acesoft.binarysearch;

import java.util.HashSet;
import java.util.Set;

/*
 * https://binarysearch.com/problems/Validate-Delivery-Orders
 *
 * You are given a list of strings orders. Each element in orders starts with either "P" meaning
 * pickup or "D" meaning delivery followed by the order id. For example, "P12" means pick up order 12.
 *
 * Return whether orders is valid given the following rules:
 * A delivery cannot happen for an order before pickup
 * Every pickup must be delivered
 * An order that's already been picked up and delivered cannot be picked up or delivered again
 *
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of orders
 *
 * Example 1
 * Input
 * orders = ["P1", "P2", "D2", "D1"]
 * Output
 * true
 * Explanation
 * We first pick up orders 1 and 2 then we drop 2 and 1.
 *
 * Example 2
 * Input
 * orders = ["P1", "P2", "P3"]
 * Output
 * false
 * Explanation
 * The orders were not delivered.
 *
 * Example 3
 * Input
 * orders = ["D1", "P1"]
 * Output
 * false
 * Explanation
 * We must pick up the order first.
 *
 * Example 4
 * Input
 * orders = ["P1", "D1", "P1", "D1"]
 * Output
 * false
 * Explanation
 * We can't pick up an order again after it's already been picked up and dropped off.
 */
public class BinarySearch1028 {

    public boolean solve(String[] orders) {
        Set<String> hs = new HashSet<>();
        Set<String> pickedUp = new HashSet<>();
        for (String order : orders) {
            String orderNo = order.substring(1);
            if (order.charAt(0) == 'P') {
                if (!hs.add(orderNo) || pickedUp.contains(orderNo)) {
                    return false;
                }
            } else {
                pickedUp.add(orderNo);
                if (!hs.remove(orderNo)) {
                    return false;
                }
            }
        }
        return hs.size() == 0;
    }
}