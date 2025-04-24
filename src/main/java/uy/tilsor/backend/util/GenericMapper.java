package uy.tilsor.backend.util;

import java.util.List;
import java.util.stream.Collectors;

public interface GenericMapper<E, D> {
    
	D toDTO(E entity);
    
    E toEntity(D dto);
    
    default List<D> toDTOList(List<E> entityList) {
        return entityList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    default List<E> toEntityList(List<D> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
