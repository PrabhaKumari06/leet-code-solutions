package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockIITest {
    private BuyAndSellStockII buyAndSellStock;

    @BeforeEach
    void setup() {
        buyAndSellStock = new BuyAndSellStockII();
    }

    @Test
    void singleInput() {
        int[] input = {1};
        assertEquals(0, buyAndSellStock.maxProfit(input));
    }

    @Test
    void zeroProfit_success() {
        int[] input = {7, 6, 4, 3, 1};
        assertEquals(0, buyAndSellStock.maxProfit(input));
    }

    @Test
    void maxProfitUnsortedArray_success() {
        int[] input = {7, 1, 5, 3, 6, 4};
        assertEquals(7, buyAndSellStock.maxProfit(input));
    }

    @Test
    void maxProfitSortedArray_success() {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(4, buyAndSellStock.maxProfit(input));
    }

}