package com.example;

import java.util.Map;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;

// Java Program to Illustrate Creation of Simple POJO Class

// Importing required classes
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name = "song")

// POJO class
public class Song {

	@Id
	@Column(name = "songId") 
	private int id;

	// @Column(name = "songName") 
	private String songName;

	// @Column(name = "singer") 
	private String singer;

	@Column(columnDefinition = "BLOB")
    private byte[] data;

	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public String getSongName() { return songName; }

	public void setSongName(String songName)
	{
		this.songName = songName;
	}

	public String getSinger() { return singer; }

	public void setSinger(String artist)
	{
		this.singer = artist;
	}

	public byte[] getData()  {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

	public String toString() {
		return "{Song Id: "+id+", Data: "+new String(data)+"}";
	}
}
