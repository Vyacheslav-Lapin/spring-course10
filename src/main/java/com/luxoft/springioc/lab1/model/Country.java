package com.luxoft.springioc.lab1.model;

public interface Country {
	int getId();
	Country setId(int id);
	String getName();
	Country setName(String name);
	String getCodeName();
	Country setCodeName(String codeName);
	int hashCode();
}