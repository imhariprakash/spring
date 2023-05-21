package com.hari.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;

	@OneToMany(mappedBy = "publisher")
	private Set <Book> publishedBooks = new HashSet<>();

	public Publisher()
	{
	}

	public Publisher(String name, String address, String city, String state, String zip)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZip()
	{
		return zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public Set<Book> getPublishedBooks()
	{
		return publishedBooks;
	}

	public void setPublishedBooks(Set<Book> publishedBooks)
	{
		this.publishedBooks = publishedBooks;
	}

	public void addPublishedBook(Book book)
	{
		publishedBooks.add(book);
	}

	@Override public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(!(o instanceof Publisher publisher))
			return false;
		return Objects.equals(getId(), publisher.getId()) && Objects.equals(getName(), publisher.getName()) && Objects.equals(getAddress(), publisher.getAddress()) && Objects.equals(getCity(), publisher.getCity()) && Objects.equals(getState(), publisher.getState()) && Objects.equals(getZip(), publisher.getZip()) && Objects.equals(getPublishedBooks(), publisher.getPublishedBooks());
	}

	@Override public int hashCode()
	{
		return Objects.hash(getId());
	}

	@Override public String toString()
	{
		return "Publisher{" +
			"id=" + id +
			", name='" + name + '\'' +
			", address='" + address + '\'' +
			", city='" + city + '\'' +
			", state='" + state + '\'' +
			", zip='" + zip + '\'' +
			'}';
	}
}
