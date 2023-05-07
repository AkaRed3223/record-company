package com.example.recordcompany.controller;

import com.example.recordcompany.domain.Album;
import com.example.recordcompany.domain.Band;
import com.example.recordcompany.domain.Song;
import com.example.recordcompany.repository.AlbumRepository;
import com.example.recordcompany.repository.BandRepository;
import com.example.recordcompany.repository.SongRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class MainController {

    private final BandRepository bandRepository;
    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;

    public MainController(BandRepository bandRepository, AlbumRepository albumRepository, SongRepository songRepository) {
        this.bandRepository = bandRepository;
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }

    @GetMapping("/bands")
    public List<Band> getBands() {
        return bandRepository.findAll();
    }

    @GetMapping("/albums")
    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    @GetMapping("/songs")
    public List<Song> getSongs() {
        return songRepository.findAll();
    }
}
