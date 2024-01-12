package com.example.demo.entities;

	import java.util.List;
	import jakarta.persistence.*;
	@Entity
	public class Song {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String name;
		String artist;
		String gener;
		String link;
		@ManyToMany
		List<Playlist> playlists;
		public Song() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Song(int id, String name, String artist, String gener, String link, List<Playlist> playlists) {
			super();
			this.id = id;
			this.name = name;
			this.artist = artist;
			this.gener = gener;
			this.link = link;
			this.playlists = playlists;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getGener() {
			return gener;
		}
		public void setGener(String gener) {
			this.gener = gener;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public List<Playlist> getPlaylists() {
			return playlists;
		}
		public void setPlaylists(List<Playlist> playlists) {
			this.playlists = playlists;
		}
		@Override
		public String toString() {
			return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", gener=" + gener + ", link=" + link
					+ ", playlists=" + playlists + "]";
		}
		
		
		

}