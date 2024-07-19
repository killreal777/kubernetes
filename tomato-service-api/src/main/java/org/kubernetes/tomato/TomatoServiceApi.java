package org.kubernetes.tomato;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface TomatoServiceApi {

    @GetMapping("tomatoes")
    List<TomatoDto> getAllTomatoes();

    @GetMapping("tomato")
    TomatoDto getTomatoById(@RequestParam Long id);

    @PostMapping("tomato")
    void addTomato(@RequestBody TomatoDto tomato);

    @DeleteMapping("tomato")
    void deleteTomatoById(@RequestParam Long id);

    @DeleteMapping("tomatoes")
    void deleteAllTomatoes();

}
