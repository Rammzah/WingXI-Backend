package com.wingsxi.backend.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="item_basic")
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="itemid")
	private int itemID;
	@Column(name="subid")
	private int subID;
	private String name;
	@Column(name="sortname")
	private String sortName;
	@Column(name="stacksize")
	private int stackSize;
	private int flags;
	@Column(name="ah")
	private int aH;
	@Column(name="nosale")
	private int noSale;
	@Column(name="basesell")
	private int baseSell;
	
	public Item() {
	}
	
	public int getItem() {
		return this.itemID;
	}
	public void setItem(int itemID) {
		this.itemID = itemID;
	}

	public int getSubID() {
		return subID;
	}

	public void setSubID(int subID) {
		this.subID = subID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public int getaH() {
		return aH;
	}

	public void setaH(int aH) {
		this.aH = aH;
	}

	public int getNoSale() {
		return noSale;
	}

	public void setNoSale(int noSale) {
		this.noSale = noSale;
	}

	public int getBaseSell() {
		return baseSell;
	}

	public void setBaseSell(int baseSell) {
		this.baseSell = baseSell;
	}
}
