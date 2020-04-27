package com.board.domain;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;

@Getter
@MappedSuperclass
public class BaseEntity {

	@Column(updatable = false)
	protected LocalDateTime createdAt;
	
	@Column
	protected LocalDateTime updatedAt;
	
	@PrePersist
	protected void onPersist() {
		this.createdAt = this.updatedAt = LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = LocalDateTime.now();
	}
}
