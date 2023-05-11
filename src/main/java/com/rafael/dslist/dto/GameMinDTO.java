package com.rafael.dslist.dto;

import java.io.Serializable;

import com.rafael.dslist.entities.Game;
import com.rafael.dslist.projections.GameMinProjection;

public class GameMinDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(Game obj) {
		this.id = obj.getId();
		this.title = obj.getTitle();
		this.year = obj.getYear();
		this.imgUrl = obj.getImgUrl();
		this.shortDescription = obj.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getGameYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	

}
