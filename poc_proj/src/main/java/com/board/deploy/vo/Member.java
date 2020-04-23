package com.board.deploy.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Member implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idx;

    @Column
    public String name;

    @Column
    public String password;

    @Column
    public String email;

    @Column
    public LocalDateTime createdDate;

    @Column
    public LocalDateTime updatedDate;

    @Builder
    public Member(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }
}