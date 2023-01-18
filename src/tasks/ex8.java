package tasks;

import java.util.ArrayList;

public class ex8 {
	public static void findMostProfit(Integer[] stocks) {
		ArrayList<Integer> profit = new ArrayList<Integer>();
		for (int i = 0; i < stocks.length - 1; i++) {
			profit.add((stocks[i + 1] - stocks[i]));
		}
		System.out.println("======= The profit of stocks =======");
		for (Integer element : profit) {
			System.out.println(element);

		}
	}

	public static void findBestProfitOfeachDays(Integer[] rStocks, Integer[] wStocks, Integer[] cStocks) {
		ArrayList<Integer> profit = new ArrayList<Integer>();
		for (int i = 0; i < rStocks.length - 1; i++) {
			profit.add(rStocks[i]);
			profit.add(wStocks[i]);
			profit.add(cStocks[i]);
			int largest = 0;
			for (int j = 0; j < profit.size(); j++) {
				if (rStocks[i] > largest) {
					largest = rStocks[i];
					if (wStocks[i] > largest) {
						largest = wStocks[i];
						if (cStocks[i] > largest) {
							largest = cStocks[i];
						}
					}
				}

			}
			System.out.println(largest);
		}
	}

	public static void main(String[] args) {
		Integer[] riceStocks = { 900, 1200, 1200, 1210, 900, 750, 1050 };
		Integer[] wheateStocks = { 1100, 1900, 1500, 1500, 1500, 1500 };
		Integer[] cotonStocks = { 200, 700, 300, 290, 600, 750, 350 };
		// findMostProfit(riceStocks);
		findBestProfitOfeachDays(riceStocks, wheateStocks, cotonStocks);
	}

}
