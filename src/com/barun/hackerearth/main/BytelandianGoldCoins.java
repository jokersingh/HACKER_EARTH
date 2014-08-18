/**
 * 
 */
package com.barun.hackerearth.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bbarun
 *
 */
public class BytelandianGoldCoins {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> coinNumbers = new ArrayList<Integer>();
		String arg = "";
		int i = 0;
		do {
			if (i < 10) {
				arg = getValues(br, arg);
				if (arg != null) {
					coinNumbers.add(Integer.parseInt(arg));
				}
				i++;
			} else {
				break;
			}
		} while (arg != null);
		for (Integer coin : coinNumbers) {
			System.out.println(getMaxDollars(coin));
		}

	}

	/**
	 * @param br
	 * @param coinNumbers
	 * @param arg
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private static String getValues(BufferedReader br, String arg)
			throws IOException, NumberFormatException {

		String value = null;

		arg = br.readLine();
		if (arg != null && !arg.equals("")) {
			value = arg;
		} else {
			value = null;
		}
		return value;
	}

	/**
	 * @param coin
	 */
	private static Integer getMaxDollars(Integer coin) {
		int half = coin / 2;
		int oneThird = coin / 3;
		int quater = coin / 4;
		int total = half + oneThird + quater;
		if (total >= coin) {
			return total;
		} else {
			return coin;
		}
	}

}
