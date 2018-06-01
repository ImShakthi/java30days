package com.sakthi.java.workspace.data.structure;

public class LinkedList {
    private String data;
    private LinkedList next;
    private LinkedList prev;

    public LinkedList() {
	// TODO Auto-generated constructor stub
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    public LinkedList getNext() {
	return next;
    }

    public void setNext(LinkedList next) {
	this.next = next;
    }

    public LinkedList getPrev() {
	return prev;
    }

    public void setPrev(LinkedList prev) {
	this.prev = prev;
    }

    public void add(final String dataArg) {
	
    }

    @Override
    public String toString() {
	return "LinkedList [data=" + data + ", next=" + next + ", prev=" + prev + "]";
    }

}
