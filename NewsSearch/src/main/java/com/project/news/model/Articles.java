package com.project.news.model;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"source",
	"author",
	"title",
	"description",
	"urlother",
	"urlToImage",
	"publishedAt",
	"content"
	})
public class Articles {

	@JsonProperty("source")
	private Source source;

	@JsonProperty("author")
	private String author;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("description")
	private String description;

	@JsonProperty("urlother")
	private String urlother;
	
	@JsonProperty("urlToImage")
	private String urlToImage;
	
	@JsonProperty("publishedAt")
	private String publishedAt;
	
	@JsonProperty("content")
	private String content;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlOther() {
		return urlother;
	}

	public void setUrlOther(String urlother) {
		this.urlother = urlother;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}	
}