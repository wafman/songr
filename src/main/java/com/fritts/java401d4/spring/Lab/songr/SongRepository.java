package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
