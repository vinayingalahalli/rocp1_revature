package com.app.service.impl;

import com.app.service.ValidationService;

public class ValidationServiceImpl implements ValidationService {

	@Override
	public boolean isValidPrimeNumber(int n) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}

}
