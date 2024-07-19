package org.kubernetes.tomato;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TomatoRestController implements TomatoServiceApi {

    private final TomatoService tomatoService;

    @Override
    public List<TomatoDto> getAllTomatoes() {
        return tomatoService.getAllTomatoes();
    }

    @Override
    public TomatoDto getTomatoById(@RequestParam Long id) {
        return tomatoService.getTomatoById(id);
    }

    @Override
    public void addTomato(@RequestBody TomatoDto tomato) {
        tomatoService.addTomato(tomato);
    }

    @Override
    public void deleteTomatoById(@RequestParam Long id) {
        tomatoService.deleteTomatoById(id);
    }

    @Override
    public void deleteAllTomatoes() {
        tomatoService.deleteAllTomatoes();
    }

}
