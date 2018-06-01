package com.sakthi.java.workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SnippetHandler {

    public static void main(final String args[]) {
	// Subset s = new Subset();
	// s.run();

	TreeStockMarket stock = new TreeStockMarket();
	stock.init();
    }
}

class Subset {
    public void run() {

	Scanner scanner = null;
	try {
	    scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    List<Integer> list = new ArrayList<Integer>();
	    for (int index = 0; index < n; index++) {
		list.add(scanner.nextInt());
	    }
	    printSubsets(list);

	} catch (Exception e) {
	    System.out.println(e);

	} finally {
	    if (scanner != null) {
		scanner.close();
	    }
	}
    }

    void printSubsets(List<Integer> list) {

	Long bitOrSum = new Long(0);
	int n = list.size();
	List<Integer> subset = null;
	int min = 1001;
	int max = 0;
	for (int i = 0; i < (1 << n); i++) {
	    subset = new ArrayList<Integer>();
	    min = 1001;
	    max = 0;
	    for (int index = 0; index < n; index++) {
		if ((i & (1 << index)) > 0) {
		    int val = list.get(index);
		    if (min >= val) {
			min = val;
		    }
		    if (max <= val) {
			max = val;
		    }
		    subset.add(val);
		}
	    }
	    if (subset != null && subset.size() >= 2) {
		bitOrSum += (min | max);
	    }
	}
	System.out.println(bitOrSum % 1000000007);
    }
}

class TreeStockMarket {
    private Map<Integer, List<Integer>> stockTree = new HashMap<Integer, List<Integer>>();
    private List<Integer> valueList = new ArrayList<Integer>();

    public void init() {
	Scanner scanner = null;
	try {
	    scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int q = scanner.nextInt();

	    int root;
	    int child;
	    for (int index = 0; index < n - 1; index++) {
		root = scanner.nextInt();
		child = scanner.nextInt();
		List<Integer> children = stockTree.get(root);
		if (children == null) {
		    children = new ArrayList<Integer>();
		}
		children.add(child);
		stockTree.put(root, children);
	    }

	    for (int index = 0; index < n; index++) {
		valueList.add(scanner.nextInt());
	    }

	    List<Query> querys = new ArrayList<Query>();
	    for (int index = 0; index < q; index++) {
		Query query = new Query();
		query.setU(scanner.nextInt());
		query.setL(scanner.nextInt());
		query.setR(scanner.nextInt());

		querys.add(query);
	    }

	    for (Query query : querys) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		Map<Integer, Boolean> visitMap = new HashMap<Integer, Boolean>();
		find(query.getU(), countMap, visitMap);

		System.out.println(">>>>>>>>>>> " + countMap + "  " + visitMap);
		int count = 0;
		for (Integer key : countMap.keySet()) {
		    if (query.getL() <= countMap.get(key) && countMap.get(key) <= query.getR()) {
			count++;
		    }
		}
		System.out.println(count);
	    }
	} catch (Exception e) {
	    System.err.println(e);
	} finally {
	    if (scanner != null) {
		scanner.close();
	    }
	}
    }

    public Map<Integer, Integer> find(final int root, Map<Integer, Integer> countMap, Map<Integer, Boolean> visitMap) {
	try {
	    List<Integer> values = stockTree.get(root);

	    if (values != null) {

		Integer val = valueList.get(root - 1);
		Integer c = countMap.get(val);
		if (visitMap.get(val) == null) {
		    if (c == null) {
			c = 0;
		    }
		    c++;
		    countMap.put(val, c);
		    visitMap.put(val, true);
		}

		for (Integer value : values) {
		    Integer valKey = valueList.get(value - 1);
		    Integer count = countMap.get(valKey);
		    if (count == null) {
			count = 0;
		    }
		    count++;
		    countMap.put(valKey, count);
		    visitMap.put(valKey, true);
		    find(value, countMap, visitMap);
		}
	    } else {
		Integer key = valueList.get(root - 1);
		Integer c = countMap.get(key);
		if (c == null) {
		    countMap.put(key, 1);
		}
		System.out.println(" Root " + root);
	    }

	} catch (Exception e) {
	    System.err.println(" Error in find due to " + e);
	}
	return countMap;
    }

}

class Query {
    int u;
    int l;
    int r;

    public int getU() {
	return u;
    }

    public void setU(int u) {
	this.u = u;
    }

    public int getL() {
	return l;
    }

    public void setL(int l) {
	this.l = l;
    }

    public int getR() {
	return r;
    }

    public void setR(int r) {
	this.r = r;
    }

    @Override
    public String toString() {
	return "Query [u=" + u + ", l=" + l + ", r=" + r + "]";
    }

}
