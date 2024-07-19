package org.kubernetes.tomato;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TomatoService {

    private final TomatoRepository tomatoRepository;

    @Transactional
    public List<TomatoDto> getAllTomatoes() {
        return tomatoRepository.findAll().stream().map(this::toTomatoDto).collect(Collectors.toList());
    }

    @Transactional
    public TomatoDto getTomatoById(Long id) {
        return tomatoRepository.findById(id).map(this::toTomatoDto).orElse(null);
    }

    @Transactional
    public void addTomato(TomatoDto tomatoDto) {
        tomatoRepository.save(toTomato(tomatoDto));
    }

    @Transactional
    public void deleteTomatoById(Long id) {
        tomatoRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllTomatoes() {
        tomatoRepository.deleteAll();
    }

    private Tomato toTomato(TomatoDto tomatoDto) {
        return new Tomato()
                .setId(tomatoDto.getId())
                .setName(tomatoDto.getName())
                .setWeight(tomatoDto.getWeight())
                .setAngry(tomatoDto.isAngry());
    }

    private TomatoDto toTomatoDto(Tomato tomato) {
        return new TomatoDto()
                .setId(tomato.getId())
                .setName(tomato.getName())
                .setWeight(tomato.getWeight())
                .setAngry(tomato.isAngry());
    }

}
