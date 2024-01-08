package com.dao.copy;

import java.util.List;

import com.modules.Quote;

public interface Quotedao {
	Quote get(int id);
	List<Quote> getall();
}
