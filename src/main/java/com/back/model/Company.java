package com.back.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Company implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String dataset_code;
	public String database_code;
	public String name;
	public String description;
	public String refreshed_at;
	public Date newest_available_date;
	public Date oldest_available_date;
	public String column_names;
	public String frequency;
	public String type;
	public String premium;
	public int database_id;
	
	
	
	/******* GETTER & SETTER *********/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataset_code() {
		return dataset_code;
	}
	public void setDataset_code(String dataset_code) {
		this.dataset_code = dataset_code;
	}
	public String getDatabase_code() {
		return database_code;
	}
	public void setDatabase_code(String database_code) {
		this.database_code = database_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRefreshed_at() {
		return refreshed_at;
	}
	public void setRefreshed_at(String refreshed_at) {
		this.refreshed_at = refreshed_at;
	}
	public Date getNewest_available_date() {
		return newest_available_date;
	}
	public void setNewest_available_date(Date newest_available_date) {
		this.newest_available_date = newest_available_date;
	}
	public Date getOldest_available_date() {
		return oldest_available_date;
	}
	public void setOldest_available_date(Date oldest_available_date) {
		this.oldest_available_date = oldest_available_date;
	}
	public String getColumn_names() {
		return column_names;
	}
	public void setColumn_names(String column_names) {
		this.column_names = column_names;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public int getDatabase_id() {
		return database_id;
	}
	public void setDatabase_id(int database_id) {
		this.database_id = database_id;
	}

}
