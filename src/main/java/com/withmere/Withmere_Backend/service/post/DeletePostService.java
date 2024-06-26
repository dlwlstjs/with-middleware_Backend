package com.withmere.Withmere_Backend.service.post;

import com.withmere.Withmere_Backend.domain.post.Post;
import com.withmere.Withmere_Backend.domain.user.User;
import com.withmere.Withmere_Backend.repository.PostRepository;
import com.withmere.Withmere_Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeletePostService {
    private final PostRepository postRepository;
    @Transactional
    public void execute(User email, String postTitle) {
        //이메일에 postTitle이 있는지 확인
        //삭제
        postRepository.deleteByEmailAndPostTitle(email, postTitle);
    }
}
