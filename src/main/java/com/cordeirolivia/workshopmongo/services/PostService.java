package com.cordeirolivia.workshopmongo.services;

import com.cordeirolivia.workshopmongo.domain.Post;
import com.cordeirolivia.workshopmongo.domain.User;
import com.cordeirolivia.workshopmongo.dto.UserDTO;
import com.cordeirolivia.workshopmongo.repository.PostRepository;
import com.cordeirolivia.workshopmongo.repository.UserRepository;
import com.cordeirolivia.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}