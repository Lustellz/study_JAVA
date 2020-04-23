package com.board.deploy.config;

import com.board.deploy.enums.PostType;
import com.board.deploy.repository.MemberRepository;
import com.board.deploy.repository.PostRepository;
import com.board.deploy.vo.Member;
import com.board.deploy.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member member = memberRepository.save(Member.builder()
                .name("rg")
                .password("fkalditkfkdgo.")
                .email("ryeong_gyeong.gwon@kt.com")
                .createdDate(LocalDateTime.now())
                .build());

        IntStream.rangeClosed(1, 200).forEach(index ->
                postRepository.save(Post.builder()
                        .title("Content " + index)
                        .content("Content Example " + index)
                        .author("rg"+index)
                        .member(member).build()));
    }

}
