package com.board.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.board.enums.Role;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String email;
    
    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String password;

    @Column
    @Enumerated(EnumType.STRING)
    private Role authorities;
    
    @Column
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="member_id")
    private List<Post> posts = new ArrayList<Post>();
    
    @Builder
    public MemberEntity(Long id, String email, String name, String password, Role authorities, List<Post> posts) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.authorities=authorities;
        this.posts = posts;
    }


}