package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRespository extends CrudRepository<Album, Long> {
}
