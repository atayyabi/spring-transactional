package com.tayyabi.demo.utilities;

import java.util.HashMap;
import java.util.Map;

import com.tayyabi.demo.exception.InsufficientFundsException;

public class PaymentUtils {

	public static boolean validateCreditLimit(String accNo, double paidAmount) {

		Map<String, Double> paymentMap = new HashMap<>();

		paymentMap.put("account-1", 12000.00);
		paymentMap.put("account-2", 10000.00);
		paymentMap.put("account-3", 5000.00);
		paymentMap.put("account-4", 8000.00);

		if (paidAmount > paymentMap.get(accNo)) {
			throw new InsufficientFundsException("insufficient funds in your account");
		} else {
			return true;
		}
	}

}
