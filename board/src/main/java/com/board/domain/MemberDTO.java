package com.board.domain;

import com.board.enums.Role;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
	
   private Long id;
   private String email;
   private String name;
   private String password;
   private Role authorities;

   public MemberEntity toEntity(){
       return MemberEntity.builder()
               .id(id)
               .email(email)
               .name(name)
               .password(password)
               .authorities(authorities)
               .build();
   }
   
    @Builder
    public MemberDTO(Long id, String email, String password, String name, Role authorities) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.authorities=authorities;
    }
}